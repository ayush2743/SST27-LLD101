public class Player {
  private FrameDecoder decoder;
  private UIDisplay display;
  private FrameCache cache;

  public Player(FrameDecoder decoder, UIDisplay display, FrameCache cache) {
    this.decoder = decoder;
    this.display = display;
    this.cache = cache;
  }
  

  public void play(byte[] fileBytes) {
    Frame frame = decoder.decode(fileBytes);
    display.showPlayingStatus(fileBytes.length);

    cache.cacheFrame(frame);
    System.out.println("Cached last frame? " + cache.hasLastFrame());
  }
}