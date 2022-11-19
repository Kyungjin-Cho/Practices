
/**
 * WordApp.java
 * Kyungjin Cho
 * 15/11/22
 */
import javax.swing.JOptionPane;

public class WordApp {
  public static void main(String[] args) {
    // Declare variables
    String input;
    int length, count = 2;

    // Declare and create objects
    Word myW = new Word();

    // Input

    do {
      input = JOptionPane.showInputDialog(null, "Please enter a word");

      String[] strArr = input.split(" ");
      count = strArr.length;
    } while (count > 1);

    myW.setInput(input);

    // Process
    myW.computeLen();
    length = myW.getLen();

    System.out.println(length);

  }
}
