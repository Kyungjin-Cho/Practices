package basic;

// It must be imported first because it’s not a language level construct like an array.
import java.util.ArrayList;

public class Basic {
  public static void main(String[] args) {
    // Create an ArrayList(String is the generic type paramenter) -> constructors
    ArrayList<String> newList = new ArrayList<String>();

    // The add method is used to add an element at the "end" -> add
    newList.add("MON");
    newList.add("WED");
    newList.add("FRI");
    newList.add("FRI");
    newList.add("SAT");
    newList.add("SUN");
    newList.add("Hello");
    newList.add("Bye");

    // The add method is used to add an element to specific index -> add
    newList.add(1, "TUE");

    // The set method is used to replace any existing element -> set
    newList.set(3, "THU");

    // Remove
    newList.remove(7); // index
    newList.remove(String.valueOf("Bye"));

    // RemoveAll
    // newList.removeAll(Arrays.asList(String.valueOf("SUN")));

    // AddAll
    ArrayList<String> day = new ArrayList<String>();
    day.add("Morning");
    day.add("Afternoon");
    day.add("Evening");
    day.add("Night");

    newList.addAll(day);

    // clear;
    day.clear();

    // Contain
    System.out.println("SUN: " + newList.contains("SUN"));

    // isEmpty
    System.out.println("ArrayList[newList] Empty?: " + newList.isEmpty());
    System.out.println("ArrayList[day] Empty?: " + day.isEmpty());

    /*
     * The size method is used to find out how many indices
     * already have elements in the ArrayList.
     * Size is not capacity.
     */
    int howMany = newList.size();
    System.out.println("Size: " + howMany);

    // Print out elements of the ArrayList.
    // The get method is used to access the value of any existing element.
    for (int i = 0; i < howMany; i++) {
      if (i == howMany - 1) {
        System.out.print(newList.get(i) + "\n");
      } else {
        System.out.print(newList.get(i) + ", ");
      }

    }

    // Print out elements using foreach loop
    for (String elem : newList) {
      System.out.println(elem);
    }
  }
}