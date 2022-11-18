
/**
 * SentenceApp.java
 * Kyungjin Cho
 * 15/11/22
 */

import javax.swing.JOptionPane;

public class SentenceApp {
  public static void main(String[] args) {
    // Declare variables
    String sentence;
    int count;

    // Declare and create objects
    Sentence myS = new Sentence();

    // Input
    sentence = JOptionPane.showInputDialog(null, "Please enter a sentence.");

    myS.setString(sentence);

    // Process
    myS.computeCnt();
    count = myS.getCnt();

    System.out.println(count);

  }
}
