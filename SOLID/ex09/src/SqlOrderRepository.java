public class SqlOrderRepository implements RepositoryService {
  @Override
  public void save(String id) {
    System.out.println("Saved order " + id + " to SQL");
  }
}
