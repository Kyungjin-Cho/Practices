/* 
 * Cinema2App.java
 * @author Kyungjin Cho
 * 25/10/22
 */

import javax.swing.JOptionPane;

public class Cinema2App {
  public static void main(String[] args) {
    // Declare variables
    int age, fee;

    // Declare and create objects
    // Create & link between the 2 classes
    Cinema2 myC = new Cinema2();

    for (int i = 0; i < 2; i++) {
      // Input
      age = Integer.parseInt(JOptionPane.showInputDialog(null, "Please enter the age of the person " + (i + 1)));
      // -> It will be saved only in this file.

      myC.setAge(age);
      // send them to Calculator.java

      // Process
      // Call the Borrowing method
      myC.compute(); // the message is stored in the Cinema3.java

      // Output
      fee = myC.getFee();
      // fetch the value of message from Cinema3.java

      // Output message
      JOptionPane.showMessageDialog(null, "Your age is " + age + ".\nYour fee is €" + fee + ".", "Admission Fee",
          JOptionPane.PLAIN_MESSAGE);
    }

  } // main
} // class
