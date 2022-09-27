/*
* ScannerPI.java
* @author Kyungjin Cho
* 27/09/22
*/
import java.util.Scanner;
import java.lang.Math;

public class ScannerPI 
{
  public static void main(String[] args) 
  {

    // 변수 선언
    double radius;
    double area, circumference;
    final double PI = 3.14;

    // Scanner 클래스 객체 생성
    Scanner sc = new Scanner(System.in);

    // 인풋 실행
    System.out.println("Print enter the radius");
    radius = sc.nextDouble();

    // 프로세스
    area = Math.round(PI * radius * radius);
    circumference = Math.round(PI * (radius + radius));

    // 아웃풋
    System.out.println("The circle with radius " + radius);
    System.out.println("Its area is " + area + " and circumference is " + circumference);


  } // main
} // class