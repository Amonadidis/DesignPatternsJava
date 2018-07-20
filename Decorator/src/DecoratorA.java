public class DecoratorA extends Decorator {

  public void testOperation() {
    System.out.println("DecoratorA");
  }

  @Override
  public void operation() {
    super.operation();
    testOperation();
  }
}
