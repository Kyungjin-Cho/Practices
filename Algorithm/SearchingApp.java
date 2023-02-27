import java.util.Scanner;

public class SearchingApp {
  public static void main(String[] args) {
    // Declare variables
    int[] arr = { 1, 100, 10, 11, 13, 5000 };
    Scanner sc = new Scanner(System.in);

    int query = sc.nextInt();

    int indexOfQuery = linearSearch(arr, query);

    System.out.println("LINEAR SEARCH: The query: " + query + " is at position: " + indexOfQuery);

    int indexOfQuery_binarySearch = binarySearch(arr, query);
    System.out.println("BINARY SEARCH: The query: " + query + " is at position: " + indexOfQuery_binarySearch);

  }

  static int binarySearch(int[] arr, int query) {
    int upperB = arr.length;
    int lowerB = 0;

    while (lowerB < upperB) {
      int mid = (upperB + lowerB) / 2;
      if (arr[mid] == query) {
        return mid;
      } else if (arr[mid] > query) {
        upperB = mid - 1;
      } else {
        lowerB = mid + 1;
      }
    }
    return -1;
  }

  static int linearSearch(int[] arr, int query) {
    for (int index = 0; index < arr.length; index++) {
      if (arr[index] == query) {
        return index;
      }
    }
    return -1;
  }
}
