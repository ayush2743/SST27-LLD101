public class ShippingCostCalculator {

  
  public double cost(Shipment shipment) {
    return shipment.getShippingType().calculateCost(shipment.getWeightKg());
  }
}
