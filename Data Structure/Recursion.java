package Recursion;

public class Recursion {
  public static void main(String[] args) {
    for (int i = 0; i < 11; i++) {
      System.out.println("Iterative solution for fib(" + i + ") is " + iterationFib(i));
    }

    for (int i = 0; i < 11; i++) {
      System.out.println("Recursive solution for fib(" + i + ") is " + recursionFib(i));
    }

    for (int i = 0; i < 11; i++) {
      System.out.println("Iterative solution for fact(" + i + ") is " + iterationFact(i));
    }

    for (int i = 0; i < 11; i++) {
      System.out.println("Recursive solution for fact(" + i + ") is " + recursionFact(i));
    }
  }

  public static int recursionFact(int n) {
    if (n == 0) {
      return 1;
    }
    return n * recursionFact(n - 1);
  }

  public static int iterationFact(int n) {
    int output = 1;
    for (int i = 1; i <= n; i++) {
      output *= i;
    }
    return output;
  }

  public static int recursionFib(int n) {
    if (n == 0 || n == 1) {
      return n;
    }
    return recursionFib(n - 1) + recursionFib(n - 2);
  }

  public static int iterationFib(int n) {
    if (n == 0) {
      return 0;
    }
    int a = 0, b = 1;
    for (int i = 2; i <= n; i++) {
      int c = a + b;
      a = b;
      b = c;
    }
    return b;
  }
}
