/*
 * CountingApp.java
 * @Kyungjin Cho
 * 24 / 11 / 2022 
 */

import javax.swing.JOptionPane;

public class CountingApp {
  public static void main(String[] args) {
    // Declare variables
    String sentence;
    int vowel, consonant, space;

    // Declare and create objects
    Counting myC = new Counting();

    // Input
    sentence = JOptionPane.showInputDialog(null, "Please enter a word");
    myC.setSentence(sentence);

    // Process
    myC.compute();

    // Output
    vowel = myC.getVowel();
    consonant = myC.getConsonant();
    space = myC.getSpace();
    JOptionPane.showMessageDialog(null, "vowel: " + vowel + "\nconsonant: " + consonant + "\nspace: " + space);
  }
}
