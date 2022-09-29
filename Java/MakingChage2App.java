/* 
 * MakingChange2App.java
 * @author Kyungjin Cho
 * 29/09/22
 */
import java.util.Scanner;
import javax.swing.JOptionPane;

public class MakingChage2App {

  public static void main(String[] args) {

    // Declare variables
    int cost, cash, cashAgain;

    int change, totalChange;

    int num50, num20, num10, num5, num2, num1;

    // Scanner class
    Scanner sc = new Scanner(System.in);

    // Input
    System.out.println("Please enter the total cost");
    cost = sc.nextInt();

    System.out.println("Please enter the payment amount");
    cash = sc.nextInt();

    // Process 1) calculate total change amount
    if (cash < cost) {
      cashAgain = Integer.parseInt(JOptionPane.showInputDialog(null, "Please enter the payment amount again.\nIt must be greater than cost", "Less Payment Amount", JOptionPane.ERROR_MESSAGE));

      totalChange = cashAgain - cost;

      JOptionPane.showMessageDialog(null, "Thank you for your payment ;)\nYour payment amount is " + cashAgain, "Thank you", JOptionPane.PLAIN_MESSAGE);

    } else {

      totalChange = cash - cost;

      JOptionPane.showMessageDialog(null, "Thank you for your payment ;)\nYour payment amount is " + cash, "Thank you", JOptionPane.PLAIN_MESSAGE);
    }

    // Process 2) check the required coins and paper moneys

    num50 = totalChange / 50;
    change = totalChange % 50;

    num20 = change / 20;
    change = change % 20;

    num10 = change / 10;
    change = change % 10;

    num5 = change / 5;
    change = change % 5;

    num2 = change / 2;
    change = change % 2;

    num1 = change / 1;
    change = change % 1;

    // Output

    JOptionPane.showMessageDialog(null, "Cost: " + cost + ", Total Change: " + totalChange + "\n€50: " + num50 + "\n€20: " + num20 + "\n€10: " + num10 + "\n€5: " + num5 + "\n€2: " + num2 + "\n€1: " + num1, "Change", JOptionPane.PLAIN_MESSAGE);

  } // main

} // class
