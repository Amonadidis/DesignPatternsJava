public class Adapter implements Target {

  private Adaptee adaptee = null;

  public Adapter(Adaptee adaptee) {
    this.adaptee = adaptee;
  }

  @Override
  public void operation() {
    System.out.println("Operation Adpter");
    adaptee.operation();
  }

}
