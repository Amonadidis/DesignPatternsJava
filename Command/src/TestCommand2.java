public class TestCommand2 implements Command {

  private Receiver receiver;

  public TestCommand2(Receiver receiver) {
    this.receiver = receiver;
  }
  @Override
  public void execute() {
    System.out.println("Test Command 2");
    receiver.action2();
  }

}
