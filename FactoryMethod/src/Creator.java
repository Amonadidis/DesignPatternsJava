public abstract class Creator {

  public Product createProduct() {
    Product product = factoryMehtod();
    product.setTestInt(5);
    return product;
  }

  protected abstract Product factoryMehtod();

}
