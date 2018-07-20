public class Main {

  public static void main(String args[]) {
    TestSubject subject = new TestSubject();

    new TestObserver(subject);

    subject.setStatus("Observer Pattern Test");
  }

}
