public class TestObserver extends Observer {

  private TestSubject testSubject;

  public TestObserver(TestSubject testSubject) {
    this.testSubject = testSubject;
    this.subject = this.testSubject;
    this.subject.register(this);
  }

  public void update() {
    System.out.println(this.testSubject.getStatus());
  }

}
