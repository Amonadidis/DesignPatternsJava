public class TestProduct extends Product {

  public void setTestInt(int testInt) {
    super.testInt = testInt;
  }

  public void test() {
    System.out.println("Test Product " + super.testInt);
  }

}
