public class Context {

  private Strategy strategy = null;
  private final int a = 5;
  private final int b = 2;

  public Context() {

  }

  public Context(Strategy strategy) {
    this.strategy = strategy;
  }

  public void setStrategy(Strategy strategy) {
    this.strategy = strategy;
  }

  public void operation() {
    if (strategy == null) {
      System.out.println("Strategy is not set.");
    } else {
      strategy.print();
      System.out.println("Algorythm with numbers " + this.a + " and " + this.b + " = " + strategy.algorithm(this.a, this.b));
    }
  }

}
