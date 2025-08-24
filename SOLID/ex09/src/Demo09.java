public class Demo09 {
  public static void main(String[] args) {

    OrderController orderController = new OrderController(new SqlOrderRepository());
    orderController.create("ORD-1");
  }
}
