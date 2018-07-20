public class Main {

  public static void main(String[] args) {
    DecoratorA decoratorA = new DecoratorA();
    decoratorA.operation();
    DecoratorB decoratorB = new DecoratorB();
    decoratorB.operation();
  }

}
