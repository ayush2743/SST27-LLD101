public class ReportService {

  private LoggerService loggerService;

  public ReportService(LoggerService loggerService) {
    this.loggerService = loggerService;
  }

  void generate() {
    loggerService.log("Generating daily report...");
    System.out.println("Report contents...");
  }
}