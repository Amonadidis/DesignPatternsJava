public class Test {

  private State state;

  public Test() {
    System.out.println("Test State init to:");
    state = new StateA();
  }

  public Test(State state) {
    System.out.println("Test State init to:");
    this.state = state;
  }

  public void setState(State state) {
    System.out.println("Test State changed to:");
    this.state = state;
  }

  public void operation() {
    state.operation();
  }

}
