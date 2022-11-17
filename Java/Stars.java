
/**
 * Stars.java
 * Kyungjin Cho
 * 15/11/22
 */
import javax.swing.JOptionPane;

public class Stars {
  public static void main(String[] args) {
    String word;

    word = JOptionPane.showInputDialog(null, "Please enter a word", "Word Input", JOptionPane.PLAIN_MESSAGE);

    int index = word.length();

    char[] star = new char[index];

    for (int i = 0; i < index; i++) {
      star[i] = '*';
    }

    String star_string = new String(star);

    System.out.println(star_string);

  }
}
