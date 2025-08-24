public class ConsoleLogger implements LoggerService {
  @Override
  public void log(String msg) {
    System.out.println("[LOG] " + msg);
  }
}