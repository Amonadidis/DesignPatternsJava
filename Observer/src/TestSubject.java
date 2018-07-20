public class TestSubject extends Subject {

  private String status = "";

  public void setStatus(String status) {
    this.status = status;
    notifyObservers();
  }

  public String getStatus() {
    return this.status;
  }

}
