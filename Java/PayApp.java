/* 
 * PayApp.java
 * @author Kyungjin Cho
 * 6/10/22
 */

import javax.swing.JOptionPane;

public class PayApp {
  public static void main(String[] args){

    // Declare variables
    double basicPayRate, hourBasic, hourOvertime;
    double payBasic, payOvertime, payTotal;

    // Declare and create objects
    // Create & link between the 2 classes
    Pay myP = new Pay();

    // Input
    basicPayRate = Double.parseDouble(JOptionPane.showInputDialog(null, "Please enter the amount of basic pay rate.", "The Amount of Basic Pay Rate", JOptionPane.PLAIN_MESSAGE));

    hourBasic = Double.parseDouble(JOptionPane.showInputDialog(null, "Please enter the number of basic hours work per week.", "The Number of Basic Hour", JOptionPane.PLAIN_MESSAGE));

    hourOvertime = Double.parseDouble(JOptionPane.showInputDialog(null, "Please enter the number of overtinme hours work per week.", "The Number of Overtime Hour", JOptionPane.PLAIN_MESSAGE));

    // -> It will be saved only in this file.

    myP.setBasicPayRate(basicPayRate);
    myP.setHourBasic(hourBasic);
    myP.setHourOvertime(hourOvertime);
    // send them to Pay.java

    // Process
    // Call the Borrowing method
    myP.compute(); // the message is stored in the Pay.java

    // Output
    payBasic = myP.getPayBasic();
    payOvertime = myP.getPayOvertime();
    payTotal = myP.getPayTotal();
    // fetch the value of message from Pay.java

    // If you inserted abnormal value(basic pay rate or basic hour or overtime hour) -> warning message
    if((basicPayRate <= 0) || (hourBasic < 0) || (hourOvertime < 0) ) {
      JOptionPane.showMessageDialog(null, "The basic pay rate should be greater than zero\nThe number of hours should not be less than zero", "Abnormal Value", JOptionPane.WARNING_MESSAGE);
    }

    // Output message
    JOptionPane.showMessageDialog(null, "For the week,\nThe Amount of Basic Pay : € " + payBasic + "\nThe Amount of Overtime Pay : € " + payOvertime + "\nThe Amount of Total Pay : € " + payTotal, "The Weekly Amount of Pay", JOptionPane.PLAIN_MESSAGE);

  } // main
} // class
