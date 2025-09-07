package com.example.report;

import java.nio.file.Path;
import java.util.Map;

public class ReportBundleFacade {

  private final AuditLog auditLog;
  private final JsonWriter jsonWriter;
  private final Zipper zipper;

  public ReportBundleFacade(AuditLog auditLog, JsonWriter jsonWriter, Zipper zipper) {
    this.auditLog = auditLog;
    this.jsonWriter = jsonWriter;
    this.zipper = zipper;
  }

  public Path export(Map<String, Object> data, Path outDir, String baseName) {
    Path json = jsonWriter.write(data, outDir, baseName);
    Path zip = zipper.zip(json, outDir.resolve(baseName + ".zip"));
    auditLog.log("exported " + zip);
    return zip;
  }
}
