public class Invoker {

  private Command testCommand1;
  private Command testCommand2;

  public Invoker(Command testCommand1, Command testCommand2) {
    this.testCommand1 = testCommand1;
    this.testCommand2 = testCommand2;
  }

  public void test1() {
    testCommand1.execute();
  }

  public void test2() {
    testCommand2.execute();
  }

}
