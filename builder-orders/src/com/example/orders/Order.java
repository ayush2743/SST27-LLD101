package com.example.orders;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Immutable Order using Builder pattern.
 */
public class Order {
  private final String id;
  private final String customerEmail;
  private final List<OrderLine> lines;
  private final Integer discountPercent;
  private final boolean expedited;
  private final String notes;

  // Private constructor - only Builder can create instances
  private Order(Builder builder) {
    this.id = builder.id;
    this.customerEmail = builder.customerEmail;
    this.lines = deepCopyLines(builder.lines);
    this.discountPercent = builder.discountPercent;
    this.expedited = builder.expedited;
    this.notes = builder.notes;
  }

  private static List<OrderLine> deepCopyLines(List<OrderLine> originalLines) {
    List<OrderLine> copy = new ArrayList<>();
    for (OrderLine line : originalLines) {
      copy.add(new OrderLine(line.getSku(), line.getQuantity(), line.getUnitPriceCents()));
    }
    return Collections.unmodifiableList(copy);
  }

  public String getId() {
    return id;
  }

  public String getCustomerEmail() {
    return customerEmail;
  }

  public List<OrderLine> getLines() {
    return lines;
  } 

  public Integer getDiscountPercent() {
    return discountPercent;
  }

  public boolean isExpedited() {
    return expedited;
  }

  public String getNotes() {
    return notes;
  }

  public int totalBeforeDiscount() {
    int sum = 0;
    for (OrderLine l : lines)
      sum += l.getQuantity() * l.getUnitPriceCents();
    return sum;
  }

  public int totalAfterDiscount() {
    int base = totalBeforeDiscount();
    if (discountPercent == null)
      return base;
    return base - (base * discountPercent / 100);
  }

  public static class Builder {
    private final String id;
    private final String customerEmail;
    private final List<OrderLine> lines = new ArrayList<>();

    private Integer discountPercent;
    private boolean expedited = false;
    private String notes;

    public Builder(String id, String customerEmail) {
      this.id = id;
      this.customerEmail = customerEmail;
    }

    public Builder addLine(OrderLine line) {
      this.lines.add(line);
      return this;
    }

    public Builder discountPercent(Integer discountPercent) {
      this.discountPercent = discountPercent;
      return this;
    }

    public Builder expedited(boolean expedited) {
      this.expedited = expedited;
      return this;
    }

    public Builder notes(String notes) {
      this.notes = notes;
      return this;
    }

    public Order build() {
      if (id == null || id.trim().isEmpty()) {
        throw new IllegalArgumentException("id must not be blank");
      }

      if (!PricingRules.isValidEmail(customerEmail)) {
        throw new IllegalArgumentException("invalid email format");
      }

      if (lines.isEmpty()) {
        throw new IllegalArgumentException("at least one line is required");
      }

      if (!PricingRules.isValidDiscount(discountPercent)) {
        throw new IllegalArgumentException("discount must be between 0 and 100");
      }

      return new Order(this);
    }
  }
}
