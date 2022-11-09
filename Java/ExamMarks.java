
/**
 * ExamMarks.java
 * Kyungjin Cho
 * 08/11/22
 */

import javax.swing.JOptionPane;

public class ExamMarks {

  public static void main(String args[]) {
    // Declare variables
    int mark, counter = 0;
    double sum = 0, average;
    String more = "yes"; // to be used in the repetition

    // Input
    do {
      do {
        mark = Integer.parseInt(JOptionPane.showInputDialog(null, "Please enter the mark"
            + "\nMark must be between 0 and 100"));
      } while (mark < 0 || mark > 100);

      sum = sum + mark;
      counter = counter + 1;

      more = JOptionPane.showInputDialog(null, "Have you more marks? yes or no");
    } while (more.equalsIgnoreCase("yes"));

    // Process
    average = sum / counter;

    // Output
    JOptionPane.showMessageDialog(null, "The average is: " + average);
  } // main
} // class