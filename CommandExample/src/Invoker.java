public class Invoker {

  private Command startCommand;
  private Command stopCommand;

  public Invoker(Command startCommand, Command stopCommand) {
    this.startCommand = startCommand;
    this.stopCommand = stopCommand;
  }

  public void start() {
    startCommand.execute();
  }

  public void stop() {
    stopCommand.execute();
  }

}
