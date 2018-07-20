public class Main {

  public static void main(String args[]) {

    StrategyA strategyA = new StrategyA();
    StrategyB strategyB = new StrategyB();
    StrategyC strategyC = new StrategyC();

    Context context = new Context(strategyA);
    context.operation();
    context.setStrategy(strategyB);
    context.operation();
    context.setStrategy(strategyC);
    context.operation();

    Context context1 = new Context();
    context1.operation();

  }

}
