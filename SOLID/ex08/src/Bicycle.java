public class Bicycle implements PedalPowered {

  @Override
  public void pedal(int effort) {
    System.out.println("Pedal effort " + effort);
  }
}