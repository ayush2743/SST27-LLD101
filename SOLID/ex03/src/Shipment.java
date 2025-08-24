public class Shipment {
  private ShippingType shippingType;
  private double weightKg;

  public Shipment(ShippingType shippingType, double weightKg) {
    this.shippingType = shippingType;
    this.weightKg = weightKg;
  }

  public double getWeightKg() {
    return weightKg;
  }

  public ShippingType getShippingType() {
    return shippingType;
  }
}