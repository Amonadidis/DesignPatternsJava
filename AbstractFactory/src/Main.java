public class Main {

  public static void main(String[] args) {
    AbstractFactory testFactory1 = new TestFactory1();
    AbstractFactory testFactory2 = new TestFactory2();
    AbstractProductA testProductA1 = testFactory1.createProductA();
    AbstractProductB testProductB1 = testFactory1.createProductB();
    AbstractProductA testProductA2 = testFactory2.createProductA();
    AbstractProductB testProductB2 = testFactory2.createProductB();
    testProductA1.test();
    testProductB1.test();
    testProductA2.test();
    testProductB2.test();
  }

}
