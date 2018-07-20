public class StrategyC implements Strategy {

  @Override
  public void print() {
    System.out.println("Strategy C");
  }

  @Override
  public long algorithm(int a, int b) {
    return (a + b) * 2;
  }
  
}
