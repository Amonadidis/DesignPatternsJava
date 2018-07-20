public class StrategyB implements Strategy {

  @Override
  public void print() {
    System.out.println("Strategy B");
  }

  @Override
  public long algorithm(int a, int b) {
    return a * 2 + b;
  }
  
}
