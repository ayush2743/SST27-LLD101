public class OrderController {
  private RepositoryService repositoryService;

  public OrderController(RepositoryService repositoryService) {
    this.repositoryService = repositoryService;
  }

  public void create(String id) {
    repositoryService.save(id);
    System.out.println("Created order: " + id);
  }
}