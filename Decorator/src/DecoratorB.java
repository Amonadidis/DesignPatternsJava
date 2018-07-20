public class DecoratorB extends Decorator {

  private String decoratorB = "DecoratorB";

  @Override
  public void operation() {
    super.operation();
    System.out.println(this.decoratorB);
  }

}
