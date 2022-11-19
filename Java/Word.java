
/**
 * Word.java
 * Kyungjin Cho
 * 15/11/22
 */

public class Word {
  // Declare variables
  String input;
  int length;

  // Compute method & round off
  public void computeLen() {
    length = input.length();
  };

  // Getter and setter
  public void setInput(String input) {
    this.input = input;
  };

  public int getLen() {
    return length;
  };

}
