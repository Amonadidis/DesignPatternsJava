public class Main {

  public static void main(String[] args) {
    State stateA = new StateA();
    State stateB = new StateB();
    Test test = new Test();
    test.operation();
    test.setState(stateB);
    test.operation();
    test.setState(stateA);
    test.operation();
  }

}
