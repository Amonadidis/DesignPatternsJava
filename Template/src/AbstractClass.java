public abstract class AbstractClass {

  public void templateMethod() {
    System.out.println("Abstract Class Template Method");
    primitiveOperation1();
    primitiveOperation2();
  }

  public abstract void primitiveOperation1();

  public abstract void primitiveOperation2();

}
