public class OvernightShipment implements ShippingType {

  
  public double calculateCost(double weightKg) {
    return 120 + 10 * weightKg;
  }
}
