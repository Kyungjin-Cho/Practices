/* 
 * BorrowingApp.java
 * @author Kyungjin Cho
 * 5/10/22
 */
import javax.swing.JOptionPane;

public class BorrowingApp {
  public static void main(String[] args) {
    // Declare variables
    int numMonth;
    double amtOriginal, amtInterest, amtTotal;

    // Declare and create objects.
    // Create & link between the 2 classes.
    Borrowing myB = new Borrowing();

    // Input
    amtOriginal = Double.parseDouble(JOptionPane.showInputDialog(null, "Please enter the amount of money you will borrow from your sister/brother.", "The Amount of Borrowed Money", JOptionPane.PLAIN_MESSAGE));

    numMonth = Integer.parseInt(JOptionPane.showInputDialog(null, "Please enter the number of months.", "The Number of Months", JOptionPane.PLAIN_MESSAGE));
    // -> It will be saved only in this file.

    myB.setNumMonth(numMonth);
    myB.setAmtOriginal(amtOriginal);
    // send them to Borrowing.java

    // Process
    // Call the Borrowing method
    myB.compute(); // the message is stored in the Borrowing.java

    // Output
    amtInterest = myB.getAmtInterest(); 
    amtTotal= myB.getAmtTotal(); 
    // fetch the value of message from Borrowing.java

    // If you inserted abnormal value(numMonth or amtOriginal) -> warning message
    if((numMonth <= 0) || (amtOriginal <= 0) ) {
      JOptionPane.showMessageDialog(null, "Both the number of months and amount of borrowed money should be grater than zero.\nYou inserted the number of months( " + numMonth + " ) and borrowed amount( " + amtOriginal +" ).", "Abnormal Amount", JOptionPane.WARNING_MESSAGE);
    }

    // Output message
    JOptionPane.showMessageDialog(null, "The Amount of Borrowed Money : € " + amtOriginal + "\nThe Number of Months : " + numMonth + " months\n\nThe Amount of Interest : € " + amtInterest +  "\n\nTotal Amount You Owe : € " + amtTotal, "The Total Amount You Owe", JOptionPane.PLAIN_MESSAGE);

  } // main
} // class
