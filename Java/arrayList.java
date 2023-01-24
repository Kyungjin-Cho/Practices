import java.util.ArrayList;

public class arrayList {
  public static void main(String[] args) {
    ArrayList<Integer> myInts = new ArrayList<Integer>(25);
    for (int i = 1; i <= 10; i++) {
      myInts.add(i * 3);
    }

    myInts.set(5, 44);

    System.out.println("Size of myInts: " + myInts.size());

    for (int j = 0; j < myInts.size(); j++) {
      System.out.print(myInts.get(j) + " ");
    }

  }
}