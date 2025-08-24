public class ExpressShipment implements ShippingType {

  
  public double calculateCost(double weightKg) {
    return 80 + 8 * weightKg;
  }
}
