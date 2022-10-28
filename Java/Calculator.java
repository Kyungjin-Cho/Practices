/* 
 * Calculator.java
 * @author Kyungjin Cho
 * 27/10/22
 */

public class Calculator {
  // Declare variables
  private int operation;
  private double num1, num2, answer;

  public Calculator() {

  }

  public void compute() {
    if (operation == 1) {
      answer = num1 + num2;
    } else if (operation == 2) {
      answer = num1 - num2;
    } else if (operation == 3) {
      answer = num1 * num2;
    } else {
      answer = num1 / num2;
    }

  }

  // Getters and Setters
  public void setNum1(double num1) {
    this.num1 = num1;
  }

  public void setNum2(double num2) {
    this.num2 = num2;
  }

  public void setOperation(int operation) {
    this.operation = operation;
  }

  public double getAnswer() {
    return answer;
  }

} // class
