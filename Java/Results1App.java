import javax.swing.JOptionPane;

public class Results1App {
  public static void main(String[] args) {
    int arr[];
    arr = new int[5];

    for (int i = 0; i < arr.length; i++) {
      arr[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter a result"));
    }

    JOptionPane.showMessageDialog(null, "The first result is " + arr[0]);
    JOptionPane.showMessageDialog(null, "The last result is " + arr[4]);
  }
}