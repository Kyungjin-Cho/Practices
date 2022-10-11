/*
 * StudentsUnion.java
 * @author Kyungjin Cho
 * 11/10/22
 */

 public class StudentsUnion{
  /// Declare variables
  private int qtyCaps, qtyShirts, qtyHoodies, totalCost;
  private final int priceCap = 5;
  private final int priceShirt = 10;
  private final int priceHoodie = 20;

  // Create constructor

  public StudentsUnion(){
  }

  // Compute method & round off

  public void compute(){
    totalCost = (qtyCaps * priceCap) + (qtyShirts * priceShirt) + (qtyHoodies * priceHoodie);
  };
  // Getter and setter
  public void setQtyCaps(int qtyCaps){
    this.qtyCaps = qtyCaps;
  }
  public void setQtyShirts(int qtyShirts){
    this.qtyShirts = qtyShirts;
  }
  public void setQtyHoodies(int qtyHoodies){
    this.qtyHoodies = qtyHoodies;
  }
  public int getTotalCost(){
    return totalCost;
  }

} // class
