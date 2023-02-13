
// Import Scanner to read user's input
import java.util.Scanner;

public class ConcatDigits {
  public static void main(String[] args) {
    // Declare valuables
    int n;

    // Declare and create Scanner objects
    Scanner sc = new Scanner(System.in);

    // Input
    n = sc.nextInt();

    // Close Scanner
    sc.close();

    // Set start time of algorithms
    long startTime = System.currentTimeMillis();

    // Output
    for (int i = n; i >= 0; i--) {
      for (int j = n; j >= 0; j--) {
        String str_j = Integer.toString(j);
        String str_i = Integer.toString(i);
        System.out.print(str_i + str_j + " ");
      }
    }

    // Set end time of algorithms
    long endTime = System.currentTimeMillis();

    // Calculate elapsed time(in milliseconds)
    long elapsedTime = (endTime - startTime);

    // Output the elapased time
    System.out.println();
    System.out.println(elapsedTime);

  }
}