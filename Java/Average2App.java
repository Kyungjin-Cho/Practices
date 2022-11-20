
/**
 * Average2App.java
 * Kyungjin Cho
 * 10/11/22
 */

import javax.swing.JOptionPane;

public class Average2App {
  public static void main(String[] args) {
    // Declare variables
    int nums[] = new int[5];
    int min, max;
    double average;

    // Declare and create objects
    AvgMaxMin myA = new AvgMaxMin();

    // Input
    for (int i = 0; i < nums.length; i++) {
      nums[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Please enter a number"));
    }

    myA.setNums(nums);

    // Process
    myA.computeAvg();
    myA.computeMax();
    myA.computeMin();

    average = myA.getAverage();
    max = myA.getMax();
    min = myA.getMin();

    // Output
    JOptionPane.showMessageDialog(null, "The average is " + average);
    JOptionPane.showMessageDialog(null, "The maximum is " + max);
    JOptionPane.showMessageDialog(null, "The minimum is " + min);

  } // main
} // class
