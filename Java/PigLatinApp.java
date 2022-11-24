/*
 * PigLatinApp.java
 * @Kyungjin Cho
 * 24 / 11 / 2022 
 */

import javax.swing.JOptionPane;

public class PigLatinApp {
  public static void main(String[] args) {
    // Declare variables
    String word, pigLatinWord;

    // Declare and create objects
    PigLatin myP = new PigLatin();

    // Input
    word = JOptionPane.showInputDialog(null, "Please enter a word");
    myP.setWord(word);

    // Process
    myP.compute();

    // Output
    pigLatinWord = myP.getPigLatinWord();
    JOptionPane.showMessageDialog(null, "The word: " + word + "\nThe translated word: " + pigLatinWord);
  }
}
