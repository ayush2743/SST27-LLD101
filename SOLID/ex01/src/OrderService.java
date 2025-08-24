public class OrderService {
  private TaxCalculator taxCalculator;
  private NotificationService notificationService;
  private OrderRepository orderRepository;

  public OrderService(TaxCalculator taxCalculator, NotificationService notificationService, OrderRepository orderRepository) {
    this.taxCalculator = taxCalculator;
    this.notificationService = notificationService;
    this.orderRepository = orderRepository;
  }
  

  public void checkout(String customerEmail, double subtotal) {
    double total = taxCalculator.calculateTotalWithTax(subtotal);
    notificationService.send(customerEmail, "Thanks! Your total is " + total);
    orderRepository.save();
  }
}