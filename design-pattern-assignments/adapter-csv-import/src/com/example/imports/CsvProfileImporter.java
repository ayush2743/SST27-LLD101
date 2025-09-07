package com.example.imports;

import java.nio.file.Path;
import java.util.List;
import java.util.Objects;

public class CsvProfileImporter implements ProfileImporter {
  private final NaiveCsvReader csvReader;
  private final ProfileService profileService;

  public CsvProfileImporter(NaiveCsvReader csvReader, ProfileService profileService) {
    this.csvReader = Objects.requireNonNull(csvReader);
    this.profileService = Objects.requireNonNull(profileService);
  }

  @Override
  public int importFrom(Path csvFile) {
    List<String[]> rows = csvReader.read(csvFile);
    int count = 0;

    for (String[] row : rows) {
      // Skip if not enough columns
      if (row.length < 2) {
        System.out.println("Skipping invalid row: not enough columns");
        continue;
      }

      String id = row[0].trim();
      String email = row[1].trim();
      String displayName = row.length > 2 ? row[2].trim() : "";

      // Skip if missing id or email
      if (id.isEmpty() || email.isEmpty()) {
        System.out.println("Skipping invalid row: missing id or email");
        continue;
      }

      try {
        profileService.createProfile(id, email, displayName);
        count++;
      } catch (Exception e) {
        System.out.println("Skipping invalid row: " + e.getMessage());
      }
    }

    return count;
  }
}
