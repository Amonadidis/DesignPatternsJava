public class TestFactory2 extends AbstractFactory {

  public AbstractProductA createProductA() {
    System.out.println("Test Factory 2 Create Product A");
    return new TestProductA2();
  }

  public AbstractProductB createProductB() {
    System.out.println("Test Factory 2 Create Product B");
    return new TestProductB2();
  }

}
