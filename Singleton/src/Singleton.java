public final class Singleton {

    private static final Singleton SINGLETON = new Singleton();

    private Singleton() {
      System.out.println("Singleton Constructor called");
    }

    public static Singleton getInstance() {
      System.out.println("returned private static final singleton");
      return SINGLETON;
    }

    public static void main(String[] args) {
      System.out.println("first Singleton.getInstance() call");
      Singleton.getInstance();

      System.out.println("second Singleton.getInstance() call");
      Singleton.getInstance();
    }

}
