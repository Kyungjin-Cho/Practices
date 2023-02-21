import java.util.Scanner;
import java.math.BigInteger;
import java.util.LinkedList;

public class RecursionLab {
  public static void main(String[] args) {

    // Input
    Scanner sc = new Scanner(System.in);

    System.out.println("Please enter the number x");
    int x = sc.nextInt();
    System.out.println("Please enter the number y");
    int y = sc.nextInt();

    System.out.println("\nThe power with the iterative solution");
    System.out.println(iterativePower(x, y));

    System.out.println("\nThe power with the recursive solution");
    System.out.println(recursivePower(x, y));

    System.out.println("\nPlease enter the word to check(palindrome)");
    String word = sc.next();

    System.out.println("\nThe palidrome checking with the iterative solution");
    System.out.println("The word is: " + word + "\nThe palindrome is: " + iterativePalindrome(word));

    System.out.println("\nThe palidrome checking with the recursive solution");
    System.out.println("The word is: " + word + "\nThe palindrome is: " + recursivePalindrome(word));

    // Create a linkedlist
    LinkedList<String> list = new LinkedList<String>();

    list.add("a");
    list.add("b");
    list.add("c");
    list.add("d");
    list.add("e");
    list.add("f");
    list.add("g");
    list.add("h");
    list.add("i");
    list.add("j");

    System.out.println("\nThe linkedlist values checking with the iterative solution");
    iterativeLinkedlist(list);

    System.out.println("\nThe linkedlist values checking with the recursive solution");
    recursiveLinkedlist(list, 0);

    System.out.println("\n\nPlease enter pairs of parentheses to check");
    String parentheses = sc.next();

    System.out.println("\nThe parentheses checking with the iterative solution");
    System.out
        .println("The parenthese pair: " + parentheses + "\nThe validation is: " + iterativeParentheses(parentheses));

    System.out.println("\nThe parentheses checking with the iterative solution");
    System.out
        .println("The parenthese pair: " + parentheses + "\nThe validation is: " + iterativeParentheses(parentheses));

    System.out.println("\nPlease enter the nth number for Tribonacci calculation");
    int tribonacciNumber = sc.nextInt();
    System.out.println("\nThe Tribonacci calculation with the iterative solution");
    System.out.println(iterativeTribonacci(tribonacciNumber));
    System.out.println("\nThe Tribonacci calculation with the recursive solution");
    System.out.println(recursiveTribonacci(tribonacciNumber));

    sc.close();
  }

  static int iterativePower(int x, int y) {
    int answer = 1;
    for (int i = 1; i <= y; i++) {
      answer = answer * x;
    }
    return answer;
  }

  static int recursivePower(int x, int y) {
    if (y == 0) {
      return 1;
    } else {
      return recursivePower(x, y - 1) * x;
    }
  }

  static boolean iterativePalindrome(String word) {
    int length = word.length();
    int forward = 0;
    int backward = length - 1;

    while (backward > forward) {
      char forwardChar = word.charAt(forward++);
      char backwardChar = word.charAt(backward--);
      if (forwardChar != backwardChar) {
        return false;
      }
    }
    return true;
  }

  static boolean recursivePalindrome(String word) {
    if (word.length() == 0 || word.length() == 1) {
      return true;
    } else {
      return word.charAt(0) == word.charAt(word.length() - 1)
          && recursivePalindrome(word.substring(1, word.length() - 1));
    }
  }

  static void iterativeLinkedlist(LinkedList list) {
    for (int i = 0; i < list.size(); i++) {
      if (i < list.size() - 1) {
        System.out.print(list.get(i) + " ");
      } else {
        System.out.println(list.get(i));
      }
    }
  }

  static void recursiveLinkedlist(LinkedList list, int index) {
    if (index >= list.size()) {
      // do nothning(just continue)
    } else {
      System.out.print(list.get(index) + " ");
      recursiveLinkedlist(list, index + 1);
    }
  }

  static String iterativeParentheses(String parentheses) {
    int leftside = 0;
    int rightside = 0;
    if (parentheses.charAt(0) != '(' || parentheses.charAt(parentheses.length() - 1) != ')') {
      return "Invalid";
    }
    for (int i = 0; i < parentheses.length(); i++) {
      if (parentheses.charAt(i) == '(') {
        leftside++;
      } else if (parentheses.charAt(i) == ')') {
        rightside++;
      }
    }
    if (leftside == rightside) {
      return "Valid";
    } else {
      return "Invalid";
    }
  }

  static String recursiveParentheses(String parentheses) {
    if (parentheses.length() <= 1 || parentheses.charAt(0) != '('
        || parentheses.charAt(parentheses.length() - 1) != ')') {
      return "Invalid";
    }
    return "Valid";
  }

  static int iterativeTribonacci(int n) {
    int temp[] = { 0, 1, 1 };
    if (n <= 2)
      return temp[n];
    for (int i = 3; i <= n; ++i) {
      int a = temp[0] + temp[1] + temp[2];
      temp[0] = temp[1];
      temp[1] = temp[2];
      temp[2] = a;
    }
    return temp[2];
  }

  static int recursiveTribonacci(int n) {
    if (n == 0) {
      return 0;
    } else if (n == 1 || n == 2) {
      return 1;
    } else {
      return recursiveTribonacci(n - 1) + recursiveTribonacci(n - 2) + recursiveTribonacci(n - 3);
    }
  }

  public static BigInteger TribonacciFunc(int n) {
    if (n == 0) {
      return new BigInteger("0");
    } else if (n == 1 || n == 2) {
      return new BigInteger("1");
    } else {
      return TribonacciFunc(n - 1).add(TribonacciFunc(n - 2)).add(TribonacciFunc(n - 3));
    }
  }
}
