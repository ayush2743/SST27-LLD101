public class UPIPayment implements PaymentProvider {
  @Override
  public String findPay(Payment p) {
    return "Paid via UPI: " + p.getAmount();
  }
}
