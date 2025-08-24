public class WalletPayment implements PaymentProvider {
  @Override
  public String findPay(Payment p) {
    return "Paid via Wallet: " + p.getAmount();
  }
}
