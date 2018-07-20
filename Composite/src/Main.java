public class Main {

  public static void main(String[] args) {
    Leaf leaf1 = new Leaf("1");
    Leaf leaf2 = new Leaf("2");
    Leaf leaf3 = new Leaf("3");
    Composite composite1 = new Composite();
    Composite composite2 = new Composite();
    composite1.add(leaf1);
    composite1.add(leaf2);
    composite1.add(leaf3);
    composite1.remove(leaf2);
    composite2.add(composite1);
    composite2.add(leaf2);
    composite2.operation();
  }

}
