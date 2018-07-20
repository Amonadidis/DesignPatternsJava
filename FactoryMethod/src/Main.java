public class Main {

  public static void main(String[] args) {
    Creator testCreator = new TestCreator();
    Product product = testCreator.createProduct();
    product.test();
  }

}
