public class Main {

  public static void main(String[] args) {
    String test[] = {"Test1", "Test2", "Test3", "Test4", "Test5"};
    Aggregate<String> testAggregate = new TestAggregate<>(test);
    Iterator<String> iterator = testAggregate.getIterator();

    while (iterator.hasNext()) {
      String string = iterator.next();
      System.out.println(string);
    }

    Integer integerTest[] = {1, 2, 3, 4, 5};
    Aggregate<Integer> integerTestAggregate = new TestAggregate<>(integerTest);
    Iterator<Integer> integerIterator = integerTestAggregate.getIterator();

    while (integerIterator.hasNext()) {
      Integer integer = integerIterator.next();
      System.out.println(integer);
    }
  }

}
