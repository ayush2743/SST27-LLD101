public class CardPayment implements PaymentProvider {
  @Override
  public String findPay(Payment p) {
    return "Paid via Card: " + p.getAmount();
  }
}
