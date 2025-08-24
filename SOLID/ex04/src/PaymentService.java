public class PaymentService {
  
  public String pay(Payment p) {
    return p.getProvider().findPay(p);
  }
}