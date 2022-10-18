/* 
 * Theatre3.java
 * @author Kyungjin Cho
 * 18/10/22
 */

public class Theatre3 {
  // Declare variables
  private int fee;
  private String day;

  // Create constructor

  public Theatre3(){
  }

  // Compute method & round off

  public void compute(){
    switch (day) {
      case ("Monday"):
      case ("Tuesday"):
        fee = 5;
        break;
      case ("Wednesday"):
      case ("Thursday"):
        fee = 10;
        break;
      case ("Friday"):
        fee= 20;
        break;
      case ("Saturday"):
      case ("Sunday"):
        fee = 30;
        break;
      
    }
  };

  // Getter and setter

  public void setDay(String day){
    this.day = day;
  }

  public int getFee(){
    return fee;
  }


} // class