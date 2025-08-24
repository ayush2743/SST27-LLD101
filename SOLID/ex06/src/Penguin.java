public class Penguin extends Bird implements Swimmable {
  @Override
  public void makeSound() {
    System.out.println("Honk!");
  }

  public void swim() {
    System.out.println("Paddle!");
  }

  @Override
  public void release() {
    swim();
  }
}