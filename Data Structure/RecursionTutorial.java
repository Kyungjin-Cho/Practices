package Recursion;

public class RecursionTutorial {
  public static void main(String[] args) {
    RecursionTutorial recursionTutorial = new RecursionTutorial();
    System.out.println(recursionTutorial.endX("xhixixamxdom "));
    System.out.println(recursionTutorial.sumDigits(121));
    System.out.println(recursionTutorial.changeXY("xxxhixxlsxx"));
    System.out.println(recursionTutorial.stringClean("yyzzza"));
  }

  public int countHi(String str) {
    System.out.println("working on the string " + str);
    // base case(when will be know we are finished?)
    if (str.length() < 2) {
      System.out.println("String: " + str + " was too small to recurse on");
      return 0;
    } else if (str.substring(0, 2).equals("hi")) {
      System.out.println("String: " + str + " started with hi");
      // we found hi at the start of the string
      return 1 + countHi(str.substring(2));
    } else {
      System.out.println("String: " + str + " did NOT start with hi, so we throw away " + str.charAt(0));

      // we didn't find hi, so what character can we discount?
      return countHi(str.substring(1));
    }
  }

  public String removeX(String str) {
    // base case is sthat the string is empty
    if (str.length() == 0) {
      return "";
    } else if (str.charAt(0) == 'x') {
      // we need to remove x from the string
      return removeX(str.substring(1));
    } else {
      // the string is not empty and the first char is not an x
      return str.charAt(0) + removeX(str.substring(1));
    }
  }

  public boolean containsTimes10(int[] arr, int index) {
    System.out.println("index is " + index);
    // base case
    if (index >= (arr.length - 1)) {
      return false;
    } else if ((arr[index] * 10) == arr[index + 1]) {
      return true;
    } else {
      return containsTimes10(arr, ++index);
    }
  }

  public String endX(String str) {
    if (str.length() <= 1) {
      return str;
    } else if (str.charAt(0) == 'x') {
      return endX(str.substring(1)) + str.charAt(0);
    } else {
      return str.charAt(0) + endX(str.substring(1));
    }
  }

  public int sumDigits(int n) {
    if (n < 10) {
      return n;
    } else {
      return (n % 10) + sumDigits(n / 10);
    }
  }

  public String changeXY(String str) {
    if (str.length() == 0) {
      return str;
    } else if (str.charAt(0) == 'x') {
      return 'y' + changeXY(str.substring(1));
    } else {
      return str.charAt(0) + changeXY(str.substring(1));
    }
  }

  public String stringClean(String str) {
    if (str.length() <= 1) {
      return str;
    } else {
      String sub = str.substring(0, 2);
      if (sub.charAt(0) == sub.charAt(1)) {
        return stringClean(str.substring(1));
      } else {
        return sub.charAt(0) + stringClean(str.substring(1));
      }
    }
  }
}
