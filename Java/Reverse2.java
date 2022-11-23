/*
 * Reverse2.java
 * @Kyungjin Cho
 * 22 / 11 / 2022 
 */

public class Reverse2 {
  // Declare Variables
  private String word;
  private String newWord;
  private StringBuffer strBuff;

  // Constructor
  public Reverse2() {
    word = " ";
    newWord = " ";
    strBuff = new StringBuffer();
  }

  // Compute
  public void compute() {
    for (int i = word.length() - 1; i >= 0; i--) {
      strBuff.append(word.charAt(i));
    } // for
    newWord = strBuff.toString();
  } // compute

  // Getters and Setters
  public void setWord(String word) {
    this.word = word;
  }

  public String getNewWord() {
    return newWord;
  }
}