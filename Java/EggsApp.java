package Eggs;
/* 
 * EggsApp.java
 * @author Kyungjin Cho
 * 29/09/22
 */
import javax.swing.JOptionPane;

public class EggsApp {
  public static void main(String[] args){

    // Declare variables
    int total, totalAgain, box, leftover;
    int dozen = 12;

    total = Integer.parseInt(JOptionPane.showInputDialog(null, "Please enter the number of eggs.", "The number of collected eggs", JOptionPane.PLAIN_MESSAGE));

    // Process
    if (total <= 0) {
      totalAgain = Integer.parseInt(JOptionPane.showInputDialog(null, "Please enter the number of eggs again.\nThe number of eggs must be greater than 0", "Less amount", JOptionPane.ERROR_MESSAGE));

      box = totalAgain / dozen;
      leftover = totalAgain % dozen;

      JOptionPane.showMessageDialog(null, "Thank you for collecting the eggs today ;)", "Thank you", JOptionPane.PLAIN_MESSAGE);

      JOptionPane.showMessageDialog(null, "Total: " + totalAgain + " \nBox(12 eggs in a box): " + box + "\nLeftover: " + leftover, "Egg: Box & Leftover", JOptionPane.PLAIN_MESSAGE);
    

    } else {
      box = total / dozen;
      leftover = total % dozen;

      JOptionPane.showMessageDialog(null, "Thank you for collecting the eggs today ;)", "Thank you", JOptionPane.PLAIN_MESSAGE);

      JOptionPane.showMessageDialog(null, "Total: " + total + " \nBox(12 eggs in a box): " + box + "\nLeftover: " + leftover, "Egg: Box & Leftover", JOptionPane.PLAIN_MESSAGE);
    }
    
  } // main
} // class
