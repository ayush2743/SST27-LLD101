package com.example.profiles;

import java.util.Objects;

public final class Validation {
  private Validation() {
  }

  public static boolean isBlank(String s) {
    return s == null || s.trim().isEmpty();
  }

  public static void requireNonBlank(String val, String name) {
    if (isBlank(val))
      throw new IllegalArgumentException(name + " must not be blank");
  }

  public static void requireEmail(String email) {
    Objects.requireNonNull(email, "email");
    if (!email.contains("@"))
      throw new IllegalArgumentException("invalid email");
  }

  public static void validatePhone(String phone) {
    if (phone != null && !phone.trim().isEmpty()) {
      // Basic phone validation - should contain only digits, spaces, +, -, (, )
      if (!phone.matches("[\\d\\s\\+\\-\\(\\)]+")) {
        throw new IllegalArgumentException("invalid phone format");
      }
    }
  }

  public static void validateDisplayName(String displayName) {
    if (displayName != null && displayName.length() > 100) {
      throw new IllegalArgumentException("displayName must not exceed 100 characters");
    }
  }

  public static void validateTwitter(String twitter) {
    if (twitter != null && !twitter.trim().isEmpty()) {
      if (!twitter.startsWith("@")) {
        throw new IllegalArgumentException("twitter handle must start with @");
      }
    }
  }

  public static void validateGithub(String github) {
    if (github != null && !github.trim().isEmpty()) {
      // GitHub username validation - alphanumeric and hyphens only
      if (!github.matches("^[a-zA-Z0-9\\-]+$")) {
        throw new IllegalArgumentException("invalid github username format");
      }
    }
  }
}
