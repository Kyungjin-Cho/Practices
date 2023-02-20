public class GenericArray<T> {
  private T[] data;
  private int size;

  public GenericArray() {
    data = (T[]) (new Object[50]);
  }

  public void add(T element) {
    data[size] = element;
    size++;
  }

  public int length() {
    return size;
  }
}
