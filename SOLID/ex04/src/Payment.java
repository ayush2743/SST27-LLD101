public class Payment {
  PaymentProvider provider;
  double amount;

  Payment(PaymentProvider p, double a) {
    this.provider = p;
    this.amount = a;
  }

  public PaymentProvider getProvider() {
    return provider;
  }

  public double getAmount() {
    return amount;
  }
}