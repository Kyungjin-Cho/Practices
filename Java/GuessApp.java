/* 
 * GuessApp.java
 * @author Kyungjin Cho
 * 20/10/22
 */

import javax.swing.JOptionPane;

public class GuessApp {
  public static void main(String[] args) {
    // Declare variables
    int guessing;

    // Declare and create objects
    // Create & link between the 2 classes
    Guess myG = new Guess();

    // Input
    guessing = Integer.parseInt(JOptionPane.showInputDialog(null, "Please enter the number between 1 and 10."));
    myG.setGuessing(guessing);

    // Call compute
    myG.compute();

    // Output message
    String message = myG.getMessage();
    int random = myG.getRandom();

    JOptionPane.showMessageDialog(null, message + "\nThe secret number was " + random + '.',
        "Admission Fee",
        JOptionPane.PLAIN_MESSAGE);

  } // main
} // class