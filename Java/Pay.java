/* 
 * Pay.java
 * @author Kyungjin Cho
 * 6/10/22
 */

import java.lang.Math;

public class Pay {
  // Declare variables

  private double basicPayRate, hourBasic, hourOvertime;
  private double payBasic, payOvertime, payTotal;
  private final double RATE = 1.5; 

  // Create constructor

  public Pay(){
  }

  // Compute method & round off

  public void compute(){
    payBasic = Math.round(basicPayRate * hourBasic * 100.0) / 100.0; 
    payOvertime = Math.round(basicPayRate * RATE * hourOvertime * 100.0) / 100.0;
    payTotal = Math.round(payBasic + payOvertime * 100.0) / 100.0;
  }

  // Getter and setter
  public void setBasicPayRate(double basicPayRate){
    this.basicPayRate = basicPayRate;
  }
  public void setHourBasic(double hourBasic){
    this.hourBasic = hourBasic;
  }
  public void setHourOvertime(double hourOvertime){
    this.hourOvertime = hourOvertime;
  }
  public double getPayBasic(){
    return payBasic;
  }
  public double getPayOvertime(){
    return payOvertime;
  }
  public double getPayTotal(){
    return payTotal;
  }
} // class
