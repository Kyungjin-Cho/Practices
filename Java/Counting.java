/*
 * Counting.java
 * @Kyungjin Cho
 * 24 / 11 / 2022 
 */

public class Counting {
  // Declare Variables
  private String sentence;
  private int vowel, consonant, space;

  // Constructor
  public Counting() {
  }

  // Compute
  public void compute() {
    for (int i = 0; i < sentence.length(); i++) {
      if (sentence.charAt(i) == ' ') {
        space++;
      } else if (sentence.charAt(i) == 'a' || sentence.charAt(i) == 'e' || sentence.charAt(i) == 'i'
          || sentence.charAt(i) == 'u' || sentence.charAt(i) == 'o') {
        vowel++;
      } else {
        consonant++;
      }
    }
  } // compute

  // Getters and Setters
  public void setSentence(String sentence) {
    this.sentence = sentence;
  }

  public int getConsonant() {
    return consonant;
  }

  public int getVowel() {
    return vowel;
  }

  public int getSpace() {
    return space;
  }

}
