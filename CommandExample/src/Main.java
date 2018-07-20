public class Main {

  public static void main(String[] args) {
    Receiver receiver = new Receiver();
    StartCommand startCommand = new StartCommand(receiver);
    StopCommand stopCommand = new StopCommand(receiver);
    Invoker invoker = new Invoker(startCommand, stopCommand);

    invoker.start();
    invoker.stop();
  }

}
