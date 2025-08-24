public class Demo02 {
  public static void main(String[] args) {
    FrameDecoder decoder = new FrameDecoder();
    UIDisplay display = new ConsoleDisplay();
    FrameCache cache = new FrameCache();

    Player player = new Player(decoder, display, cache);
    player.play(new byte[] { 1, 2, 3, 4 });
  }
}
