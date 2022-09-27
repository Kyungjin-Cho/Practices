/*
* SwingPI.java
* @author Kyungjin Cho
* 27/09/22
*/
import javax.swing.JOptionPane;
import java.lang.Math;

public class SwingPI 
{
  public static void main(String[] args) 
  {

    // 변수 선언
    double radius;
    double area, circumference;
    final double PI = 3.14;

    // 인풋 실행
    radius = Double.parseDouble(JOptionPane.showInputDialog(null, "Please enter the radius"));

    // 프로세스
    area = Math.round(PI * radius * radius);
    circumference = Math.round(PI * (radius + radius));

    // 아웃풋
    JOptionPane.showMessageDialog(null, "The circle with radius " + radius + ". Its area is " + area + " and circumference is " + circumference);

  } // main
} // class
