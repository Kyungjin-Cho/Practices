/*
 * Replace.java
 * @Kyungjin Cho
 * 22 / 11 / 2022 
 */

public class Replace {
  // Declare Variables
  private String name;
  private String newName;
  private StringBuffer strBuff;

  // Constructor
  public Replace() {
    name = " ";
    newName = " ";
    strBuff = new StringBuffer();
  }

  // Compute
  public void compute() {
    for (int i = 0; i < name.length(); i++) {
      if (name.charAt(i) == 'a') { // if you find a, replace it with a *
        strBuff.append('*');
      } // if
      else { // otherwise, use the original character
        strBuff.append(name.charAt(i));
      }
    } // for
    newName = strBuff.toString();
  } // compute

  // Getters and Setters
  public void setName(String name) {
    this.name = name;
  }

  public String getNewName() {
    return newName;
  }
}