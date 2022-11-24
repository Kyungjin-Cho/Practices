/*
 * PigLatin.java
 * @Kyungjin Cho
 * 24 / 11 / 2022 
 */

public class PigLatin {
  // Declare Variables
  private String word, pigLatinWord;
  private StringBuffer strBuff;

  // Constructor
  public PigLatin() {
    word = " ";
    pigLatinWord = " ";
    strBuff = new StringBuffer(word);
  }

  // Compute
  public void compute() {
    for (int i = 1; i < word.length(); i++) {
      if (word.charAt(i) == 'a') {
        strBuff.append('$');
      } else if (word.charAt(i) == 'r') {
        strBuff.append('&');
      } else {
        strBuff.append(word.charAt(i));
      }
    } // for
    if (word.charAt(0) == 'a') {
      strBuff.append('$');
    } else if (word.charAt(0) == 'r') {
      strBuff.append('&');
    } else {
      strBuff.append(word.charAt(0));
    }

    strBuff.append('a');
    strBuff.append('y');

    pigLatinWord = strBuff.toString();

  } // compute

  // Getters and Setters
  public void setWord(String word) {
    this.word = word;
  }

  public String getPigLatinWord() {
    return pigLatinWord;
  }
}
