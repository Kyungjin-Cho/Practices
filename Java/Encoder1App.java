/*
 * Encoder1App.java
 * @Kyungjin Cho
 * 29 / 11 / 2022 
 */

import java.util.Scanner;

public class Encoder1App {
  public static void main(String[] args) {
    // Declare variables
    String word, newWord;

    // Declare and create objects
    Encoder1 myE = new Encoder1();

    // Declare and create Scanner objects
    Scanner sc = new Scanner(System.in);

    // Input
    System.out.println("Please enter a word.");
    word = sc.next();
    myE.setWord(word);

    // Process
    myE.compute();

    // Output
    newWord = myE.getNewWord();
    System.out.println("The word: " + word + "\nEndcoded word: " + newWord);

    // Close Scanner
    sc.close();
  }
}
