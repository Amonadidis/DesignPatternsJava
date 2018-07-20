public class TestSubject implements Subject {

  private String name = null;

  public TestSubject(String name) {
    System.out.println(name + " Constructor");
    this.name = name;
  }

  public void operation() {
    System.out.println(name + " operation");
  }

}
