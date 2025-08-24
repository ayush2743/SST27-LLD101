
public class Demo04 {
  public static void main(String[] args) {

    PaymentService paymentService = new PaymentService();
    Payment payment = new Payment(new UPIPayment(), 499);

    System.out.println(paymentService.pay(payment));
  }
}
