/* 
 * CalculatorApp.java
 * @author Kyungjin Cho
 * 27/10/22
 */

import javax.swing.JOptionPane;

public class CalculatorApp {
  public static void main(String[] args) {
    // Declare variables
    int operation;
    double num1, num2, answer;

    // Declare and Create objects
    Calculator myC = new Calculator();

    operation = 99; // Initiate variable operation

    do {

      // Input
      num1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Please enter the first number."));
      num2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Please enter the second number."));

      operation = Integer.parseInt(JOptionPane.showInputDialog(null,
          "Please enter the operation." + "\n1: Add" + "\n2: Sub" + "\n3: Mult" + "\n4: Div" + "\n0: Exit"));

      myC.setOperation(operation);
      myC.setNum1(num1);
      myC.setNum2(num2);

      // Process
      myC.compute();

      // Output
      answer = myC.getAnswer();

      JOptionPane.showMessageDialog(null, "The answer is " + answer);

    } while (operation != 0);

  } // main
} // class