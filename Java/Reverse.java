
/**
 * Reverse.java
 * Kyungjin Cho
 * 15/11/22
 */
import javax.swing.JOptionPane;

public class Reverse {
  public static void main(String[] args) {
    String word;
    int start = 0;

    word = JOptionPane.showInputDialog(null, "Please enter the word", "Word Input", JOptionPane.PLAIN_MESSAGE);

    char[] input = word.toCharArray();
    char[] output = new char[input.length];

    for (int i = (input.length - 1); i >= 0; i--) {
      output[start] = input[i];
      start++;
    }

    String reversed = new String(output);

    System.out.println(reversed);

  }
}
