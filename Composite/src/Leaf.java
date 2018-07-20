public class Leaf implements Component {

  private String string;

  public Leaf(String string) {
    this.string = string;
  }

  public void operation() {
    System.out.println("Leaf operation " + string);
  }

}
