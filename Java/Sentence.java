
/**
 * Sentence.java
 * Kyungjin Cho
 * 15/11/22
 */

public class Sentence {
  // Declare variables
  String sentence;
  int count;

  // Create constructor

  public Sentence() {
  }

  // Compute method & round off

  public void computeCnt() {
    String[] strArr = sentence.split(" ");
    count = strArr.length;
  };

  // Getter and setter
  public void setString(String sentence) {
    this.sentence = sentence;
  };

  public int getCnt() {
    return count;
  };

}
