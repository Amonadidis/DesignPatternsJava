class TestAggregate<T> implements Aggregate<T> {

  protected T test[];

  public TestAggregate(T test[]) {
    this.test = test;
  }

  @Override
  public Iterator<T> getIterator() {
    return new TestIterator();
  }

  private class TestIterator implements Iterator<T> {

    private int index;

    @Override
    public T next() {
        if (hasNext()) {
          return test[index++];
        }
        return null;
    }

    @Override
    public boolean hasNext() {
      if (index < test.length) {
        return true;
      }
      return false;
    }

  }

}
