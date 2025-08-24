
public class Demo01 {
  public static void main(String[] args) {
    TaxCalculator taxCalculator = new TaxCalculator();
    NotificationService notificationService = new EmailClient();
    OrderRepository orderRepository = new OrderRepository();

    OrderService orderService = new OrderService(taxCalculator, notificationService, orderRepository);
    orderService.checkout("a@shop.com", 100.0);
  }
}
