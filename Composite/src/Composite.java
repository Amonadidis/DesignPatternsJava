import java.util.List;
import java.util.ArrayList;

public class Composite implements Component {

  private List<Component> children = new ArrayList<>();

  public void operation() {
      System.out.println("Composite operation");
      for (Component child : children) {
        child.operation();
      }
  }

  public void add(Component child) {
    System.out.println("Composite add");
    children.add(child);
  }

  public void remove(Component child) {
    System.out.println("Composite remove");
    children.remove(child);
  }

  public List<Component> getChildren() {
    System.out.println("Composite getChildren");
    return children;
  }

}
