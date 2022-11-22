/*
 * ReplaceApp.java
 * @Kyungjin Cho
 * 22 / 11 / 2022 
 */

import javax.swing.JOptionPane;

public class ReplaceApp {
  public static void main(String[] args) {
    // Declare variables
    String name, newName;

    // Declare and create objects
    Replace myR = new Replace();

    // Input
    name = JOptionPane.showInputDialog(null, "Please enter your name");
    myR.setName(name);

    // Process
    myR.compute();

    // Output
    newName = myR.getNewName();
    JOptionPane.showMessageDialog(null, "The name: " + name + "\nReplacing \'a\' with \'*\': " + newName);
  }
}
