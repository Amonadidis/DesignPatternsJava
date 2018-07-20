public class Client {

  private Target target = new Adapter(new Adaptee());

  public void startAdapter() {
    System.out.println("Start Adapter");
    target.operation();
  }

}
