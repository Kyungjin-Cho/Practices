/* 
 * StudentsUnionApp.java
 * @author Kyungjin Cho
 * 11/10/22
 */

import javax.swing.JOptionPane;

public class StudentsUnionApp {
  public static void main(String[] args){

    // Declare variables
    int qtyCaps, qtyShirts, qtyHoodies, totalCost;

    // Declare and create objects
    // Create & link between the 2 classes
    StudentsUnion myS = new StudentsUnion();

    // Input
    qtyCaps = Integer.parseInt(JOptionPane.showInputDialog(null, "Please enter the quantity of caps you want to buy.", "Quantity of Caps", JOptionPane.PLAIN_MESSAGE));

    qtyShirts = Integer.parseInt(JOptionPane.showInputDialog(null, "Please enter the quantity of shirts you want to buy.", "Quantity of Shirts", JOptionPane.PLAIN_MESSAGE));

    qtyHoodies = Integer.parseInt(JOptionPane.showInputDialog(null, "Please enter the quantity of hoodies you want to buy.", "Quantity of Hoodies", JOptionPane.PLAIN_MESSAGE));

    // -> It will be saved only in this file.
    myS.setQtyCaps(qtyCaps);
    myS.setQtyShirts(qtyShirts);
    myS.setQtyHoodies(qtyHoodies);

    // send them to Pay.java

    // Process
    // Call the Borrowing method
    myS.compute(); // the message is stored in the Pay.java

    // Output
    totalCost = myS.getTotalCost();
    // fetch the value of message from Pay.java

    // If you inserted abnormal value(basic pay rate or basic hour or overtime hour) -> warning message
    if((qtyCaps < 0) || (qtyShirts < 0) || (qtyHoodies < 0) ) {
      JOptionPane.showMessageDialog(null, "The quantity should not be less than 0.\nThe qty of Caps: " + qtyCaps + ", Shirts: " + qtyShirts + ", Hoodies: " + qtyHoodies, "Abnormal Value", JOptionPane.WARNING_MESSAGE);
    }

    // Output message
    JOptionPane.showMessageDialog(null, "Total Cost: €" + totalCost + "\nYou bought caps " + qtyCaps + "pcs, shirts " + qtyShirts + "pcs, hoodies " + qtyHoodies + "pcs.", "The Total Cost", JOptionPane.PLAIN_MESSAGE);

  } // main
} // class
