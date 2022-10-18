/* 
 * Theatre3App.java
 * @author Kyungjin Cho
 * 18/10/22
 */

import javax.swing.JOptionPane;

public class Theatre3App {
  public static void main(String[] args){
    // Declare variables
    int fee;
    String day;

    // Declare and create objects
    // Create & link between the 2 classes
    Theatre3 myT = new Theatre3();

    // Input
    day = JOptionPane.showInputDialog(null, "Please enter the day\nExample) Monday, Tuesday, Wednesday, etc.");
    // -> It will be saved only in this file.

    myT.setDay(day);
    // send them to Calculator.java

    // Process
    // Call the Borrowing method
    myT.compute(); // the message is stored in the Cinema3.java

    // Output
    fee = myT.getFee();
    // fetch the value of message from Cinema3.java


    // Output message
    JOptionPane.showMessageDialog(null, "Today is " + day + ".\nThe admission fee is €" + fee + ".", "Admission Fee", JOptionPane.PLAIN_MESSAGE);
    

  } // main
} // class
