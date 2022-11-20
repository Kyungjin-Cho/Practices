/**
 * Avg2.java
 * Kyungjin Cho
 * 10/11/22
 */

public class Avg2 {
  // Declare variables
  int nums[] = new int[5];
  double sum = 0, average;

  // Create constructor

  public Avg2() {
  }

  // Compute method & round off

  public void computeAvg() {
    for (int i = 0; i < nums.length; i++) {
      sum = sum + nums[i];
    }

    average = sum / nums.length;
  };

  // Getter and setter
  public void setNums(int[] nums) {
    this.nums = nums;
  };

  public double getAverage() {
    return average;
  };
}