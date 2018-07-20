public class StrategyA implements Strategy {

  @Override
  public void print() {
    System.out.println("Strategy A");
  }

  @Override
  public long algorithm(int a, int b) {
    return a + b;
  }

}
