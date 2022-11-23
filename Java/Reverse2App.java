/*
 * ReverseApp.java
 * @Kyungjin Cho
 * 22 / 11 / 2022 
 */

import javax.swing.JOptionPane;

public class Reverse2App {
  public static void main(String[] args) {
    // Declare variables
    String word, newWord;

    // Declare and create objects
    Reverse2 myR = new Reverse2();

    // Input
    word = JOptionPane.showInputDialog(null, "Please enter a word");
    myR.setWord(word);

    // Process
    myR.compute();

    // Output
    newWord = myR.getNewWord();
    JOptionPane.showMessageDialog(null, "The word: " + word + "\nThe reversed word: " + newWord);
  }
}
