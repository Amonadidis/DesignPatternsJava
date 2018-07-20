import package1.Class1;
import package2.Class2;
import package3.Class3;

public class Facade {

  private Class1 class1;
  private Class2 class2;
  private Class3 class3;

  public Facade() {
    class1 = new Class1();
    class2 = new Class2();
    class3 = new Class3();
  }

  public void operation() {
    System.out.println("Facade operation");
    String class1String = class1.operation();
    String class2String = class2.operation(class1String);
    String class3String = class3.operation(class2String);
    System.out.println(class3String);
  }

}
