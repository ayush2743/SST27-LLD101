public class ConsoleDisplay implements UIDisplay {

  
  public void showPlayingStatus(int bytesLength) {
    System.out.println("\u25B6 Playing " + bytesLength + " bytes");
  }
}
