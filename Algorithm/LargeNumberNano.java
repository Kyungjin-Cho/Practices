package Week1;

// Import Scanner to read the user's input
import java.util.Scanner;

public class LargeNumberNano {
  public static void main(String[] args) {
    // Declare variables
    int num1, num2;

    // Declare and create Scanner objects
    Scanner sc = new Scanner(System.in);

    // Input
    System.out.println("Please enter the first number");
    num1 = sc.nextInt();

    System.out.println("Please enter the second number");
    num2 = sc.nextInt();

    // Set start time of algorithms
    long startTime = System.nanoTime();

    // Output
    if (num1 >= num2) {
      System.out.println(num1);
    } else {
      System.out.println(num2);
    }

    // Set end time of algorithms
    long endTime = System.nanoTime();

    // Calculate elapsed time(in nano seconds)
    long elapsedTime = (endTime - startTime);

    // Output the elapased time
    System.out.println(elapsedTime);

    sc.close();

  }
}
