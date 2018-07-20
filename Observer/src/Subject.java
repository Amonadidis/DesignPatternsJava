import java.util.ArrayList;
import java.util.Collection;

public class Subject {

  protected Collection<Observer> observers = new ArrayList<>();

  public void register(Observer observer) {
    this.observers.add(observer);
  }

  public void unregister(Observer observer) {
    this.observers.remove(observer);
  }

  public void notifyObservers() {
    this.observers.forEach(observer -> {
      observer.update();
    });
  }

}
