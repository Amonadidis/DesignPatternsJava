public class Main {

  public static void main(String[] args) {
    Receiver receiver = new Receiver();
    TestCommand1 testCommand1 = new TestCommand1(receiver);
    TestCommand2 testCommand2 = new TestCommand2(receiver);
    Invoker invoker = new Invoker(testCommand1, testCommand2);

    invoker.test1();
    invoker.test2();
  }

}
