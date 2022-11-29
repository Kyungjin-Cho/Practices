/*
 * Encoder1.java
 * @Kyungjin Cho
 * 29 / 11 / 2022 
 */

public class Encoder1 {
  // Declare Variables
  private String word, newWord;
  private StringBuffer strBuff;

  // Constructor
  public Encoder1() {
    word = " ";
    newWord = " ";
    strBuff = new StringBuffer();
  }

  // Compute
  public void compute() {
    for (int i = word.length() - 1; i >= 0; i--) {
      if (word.charAt(i) == 'a') {
        strBuff.append('1');
      } else if (word.charAt(i) == 'e') {
        strBuff.append('5');
      } else if (word.charAt(i) == 'i') {
        strBuff.append('9');
      } else if (word.charAt(i) == 'o') {
        strBuff.append("15");
      } else if (word.charAt(i) == 'u') {
        strBuff.append("21");
      } else {
        strBuff.append(word.charAt(i));
      }
    }

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
