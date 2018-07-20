public class Proxy implements Subject {

  private TestSubject testSubject = null;
  private String name = null;

  public Proxy(String name) {
    this.name = name;
  }

  public void operation() {
    System.out.println("Proxy operation");
    if (testSubject == null) {
      testSubject = new TestSubject(name);
    }
    testSubject.operation();
  }

}
