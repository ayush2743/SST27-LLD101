public class Sparrow extends Bird implements Flyable {
  @Override
  public void makeSound() {
    System.out.println("Chirp!");
  }

  @Override
  public void fly() {
    System.out.println("Flap!");
  }

  @Override
  public void release() {
    fly();
  }
}
