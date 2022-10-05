/* 
 * Borrowing.java
 * @author Kyungjin Cho
 * 5/10/22
 */
import java.lang.Math;

public class Borrowing {
  // Declare variables
  private int numMonth;
  private double amtOriginal, amtInterest, amtTotal;

  // Create constructor
  public Borrowing(){
  }
  
  // Compute method & round off
  public void compute(){
    amtInterest = Math.round((amtOriginal * 0.03) * numMonth * 100) / 100.0; 
    amtTotal = Math.round((amtOriginal + amtInterest)* 100) / 100.0;
  }

  // Getter and setter
  public void setNumMonth(int numMonth){
    this.numMonth = numMonth;
  }
  public void setAmtOriginal(double amtOriginal){
    this.amtOriginal = amtOriginal;
  }
  public double getAmtInterest(){
    return amtInterest;
  }
  public double getAmtTotal(){
    return amtTotal;
  }
} // class