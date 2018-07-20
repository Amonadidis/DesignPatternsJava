public class TestFactory1 extends AbstractFactory {

  public AbstractProductA createProductA() {
    System.out.println("Test Factory 1 Create Product A");
    return new TestProductA1();
  }

  public AbstractProductB createProductB() {
    System.out.println("Test Factory 1 Create Product B");
    return new TestProductB1();
  }

}
