/* 
 * Guess.java
 * @author Kyungjin Cho
 * 20/10/22
 */

import java.lang.Math;

public class Guess {
  // Declare variables
  private int random;
  private int guessing;
  private String message;

  // Create constructor

  public Guess() {
  }

  // Compute method & round off

  public void compute() {
    // Generate random number
    random = (int) (Math.random() * 10) + 1;

    // Check answers
    if (random == guessing) {
      message = "Congratulations, you guessed correctly!";
    } else if (random < guessing) {
      message = "You guessed too high, sorry!";
    } else if (random > guessing) {
      message = "You guessed too low, sorry!";
    }

  }

  // Getter and setter

  public void setGuessing(int guessing) {
    this.guessing = guessing;
  }

  public String getMessage() {
    return message;
  }

  public int getRandom() {
    return random;
  }

} // class