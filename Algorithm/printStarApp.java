import java.util.Scanner;

public class printStarApp {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    printStar(n);
    sc.close();

  }

  // define a recursive method to print star!
  static void printStar(int n) {
    if (n <= 0) {
      System.out.print("");
    } else {
      System.out.print("*");
      printStar(n - 1);
    }

  }
}
