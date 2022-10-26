/* 
 * Cinema2.java
 * @author Kyungjin Cho
 * 25/10/22
 */

public class Cinema2 {

  // Declare variables
  private int age, fee;

  // Create constructor

  public Cinema2() {
  }

  // Compute method & round off

  public void compute() {
    if ((age < 5) || (age > 65)) {
      fee = 0;
    } else if ((age >= 5) && (age <= 14)) {
      fee = 5;
    } else {
      fee = 10;
    }
  };

  // Getter and setter
  public void setAge(int age) {
    this.age = age;
  }

  public int getFee() {
    return fee;
  }

} // class
