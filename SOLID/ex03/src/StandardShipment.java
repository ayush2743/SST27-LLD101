public class StandardShipment implements ShippingType {
  public double calculateCost(double weightKg) {
    return 50 + 5 * weightKg;
  }
}
