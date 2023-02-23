import java.util.Scanner;

public class RecursionApp {
  static int[] memoizeSolutions;

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int n_factorial = factorial(n);

    System.out.println(n_factorial);
    printStar(n);

    int[] arr = { 1, 3, 5, 8, 13 };
    System.out.println("\nThe sum with the iterative solution");
    System.out.println(iterativeSum(arr));

    System.out.println("\nThe sum with the recursive solution");
    System.out.println(recursiveSum(arr, 0));

    boolean test1 = recursiveSearch(arr, 5, 0);

    boolean test2 = iterativeSearch(arr, 200);

    System.out.println("result of recursive search: " + test1);
    System.out.println("result of iterative search: " + test2);

    int nth_fib = iterativeFibonacci(n);

    System.out.println("the " + n + "th fibonacci number is: " + nth_fib);

    memoizeSolutions = new int[1000];
    int fib = memoizeRecursiveFibonacci(50);
    System.out.println("The 50th fibonocci is: " + fib);

    sc.close();

  }

  static int memoizeRecursiveFibonacci(int n) {
    if (n == 1 || n == 2) {
      memoizeSolutions[n] = 1;
      return memoizeSolutions[n];
    } else if (memoizeSolutions[n] != 0) {
      return memoizeSolutions[n];
    } else {
      memoizeSolutions[n] = recursiveFibonacci(n - 1) + recursiveFibonacci(n - 2);
      return memoizeSolutions[n];
    }
  }

  static int recursiveFibonacci(int n) {
    if (n == 1 || n == 2) {
      return 1;
    } else {
      return recursiveFibonacci(n - 1) + recursiveFibonacci(n - 2);
    }
  }

  static int iterativeFibonacci(int n) {
    int fibSum_n = 1;
    int fibSum_n_minus_1 = 1;
    for (int currentFibIndex = 2; currentFibIndex < n; currentFibIndex++) {
      int temp = fibSum_n;
      fibSum_n = fibSum_n + fibSum_n_minus_1;
      fibSum_n_minus_1 = temp;
    }
    return fibSum_n;
  }

  static boolean recursiveSearch(int[] arr, int query, int index) {
    if (index >= arr.length) {
      return false;
    } else if (arr[index] == query) {
      return true;
    } else {
      recursiveSearch(arr, query, index + 1);
    }
    return true;
  }

  static boolean iterativeSearch(int[] arr, int query) {
    for (int index = 0; index < arr.length; index++) {
      if (arr[index] == query) {
        return true;
      }
    }
    return false;
  }

  static int recursiveSum(int[] arr, int index) {
    if (index >= arr.length) {
      return 0;
    } else {
      return arr[index] + recursiveSum(arr, index + 1);
    }
  }

  static int iterativeSum(int[] arr) {
    int sum = 0;
    for (int index = 0; index < arr.length; index++) {
      sum = sum + arr[index];
    }
    return sum;
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

  // define a recursive method to calculate n!
  static int factorial(int n) {
    if (n == 0) {
      return 1;
    } else {
      return n * factorial(n - 1);
    }
  }

}