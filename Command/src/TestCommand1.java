public class TestCommand1 implements Command {

  private Receiver receiver;

  public TestCommand1(Receiver receiver) {
    this.receiver = receiver;
  }

  @Override
  public void execute() {
    System.out.println("Test Command 1");
    receiver.action1();
  }

}
