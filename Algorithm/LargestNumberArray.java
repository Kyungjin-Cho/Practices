package Week1;

// Import Scanner to read the user's input
import java.util.Scanner;

public class LargestNumberArray {
  public static void main(String[] args) {
    // Declare variables
    Integer numberList[] = new Integer[1000];
    int answer;

    // Declare and create Scanner objects
    Scanner sc = new Scanner(System.in);

    // Input
    for (int i = 0; i < 1000; i++) {
      numberList[i] = (int) (Math.random() * 800);
    }

    // Set start time of algorithms
    long startTime = System.nanoTime();

    // Output
    answer = numberList[0];
    for (int i = 1; i < 1000; i++) {
      if (numberList[i] > answer) {
        answer = numberList[i];
      }
    }

    System.out.println(answer);

    // Set end time of algorithms
    long endTime = System.nanoTime();

    // Calculate elapsed time(in nano seconds)
    long elapsedTime = (endTime - startTime);

    // Output the elapased time
    System.out.println(elapsedTime);

    sc.close();

  }
}