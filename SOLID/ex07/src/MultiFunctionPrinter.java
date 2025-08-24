public class MultiFunctionPrinter implements Printer, Scanner, FaxMachine {
  public void print(String text) {
    System.out.println("Print: " + text);
  }

  public void scan(String dstPath) {
    System.out.println("Scan to: " + dstPath);
  }

  public void fax(String number) {
    System.out.println("Fax to: " + number);
  }
}
