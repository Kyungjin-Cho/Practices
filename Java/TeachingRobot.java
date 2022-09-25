/* 
 * TeachingRobot.java
 * @author Kyungjin Cho
 * 23/09/22
 */
import java.util.Scanner;

public class TeachingRobot {
  public static void main(String[] args) {
  
  // Set required variables
  int temperature;
  int milk;
  int cup;
  
  Scanner sc = new Scanner(System.in);
  
  // Open the Cupboard
  System.out.println("1. Open the Cubboard, and close it after getting a cup and a teabag.");

  // Close the Cupboard after getting cup and teabag
  System.out.println(" ");
  System.out.println("2. Put a teabag in the cup");
  
  System.out.println(" ");
  System.out.println("Do you want to wash your cup?(1 = Yes / 2 = No)");
  cup = sc.nextInt();

  if (cup == 1) {
    System.out.println(" ");
    System.out.println("* Turn on the water tap and clean the cup");
  } else {
    System.out.println(" ");
    System.out.println("* Great! we can start it now!");
  }

  // Fill Kettle
  System.out.println(" ");
  System.out.println("3. Turn on the water tap and pour 200ml water into kettle. After then, turn off the water tap");
  
  // Boil Kettle
  System.out.println(" ");
  System.out.println("4. Turn on the electric kettle after plug the cord into an outlet");
  
  // Check temperature of water
  System.out.println(" ");
  System.out.println("Please enter the temperature of water");
  temperature = sc.nextInt();
  
  if (temperature >= 100){
    System.out.println(" ");
    System.out.println("5. Turn off the kettle and pour water into cup");
  } else {
    System.out.println("* Keep boiling the water until the temperature is 100");
    System.out.println(" ");
    System.out.println("Please enter temperature of water again");
    temperature = sc.nextInt();
  } 


  // Add milk
  System.out.println(" ");
  System.out.println("Do you want to add milk?(1 = Yes / 2 = No)");
  milk = sc.nextInt();

  if (milk == 1) {
    System.out.println(" ");
    System.out.println("6. Please add 20ml milk and stir it for 5 seconds");
  } else {
    System.out.println(" ");
    System.out.println("6. You don't have to add milk. Just stir it");
  }

  sc.close();

  // Drink
  System.out.println(" ");
  System.out.println("7. You can drink it now. Enjoy your tea~");

  }
}