public class Aviary {
  
  public void release(Bird bird) {
    
    bird.makeSound();
    bird.release();
    System.out.println("Released");
  }
}