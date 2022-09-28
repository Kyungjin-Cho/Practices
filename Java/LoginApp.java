/* 
 * LoginApp.java
 * @author Kyungjin Cho
 * 28/09/22
 */
import java.util.Scanner;
import javax.swing.JOptionPane; 

public class LoginApp 
{
  public static void main(String[] args) 
  {
    
    // ID, Password 변수 설정
    String id = "jinnie";
    String password = "123456";

    // Scanner 클래스 객체 생성
    Scanner sc = new Scanner(System.in);

    // Scanner로 ID, Password 입력
    System.out.println("Please enter the ID");
    String inputId = sc.next();

    System.out.println("Please enter the Password");
    String inputPass1 = sc.next();

    // ID, Password 값 확인
    if(inputId.equals(id)) 
    {
      if(inputPass1.equals(password)) 
      {
        // ID, Password 일치시 보여줄 메시지
        JOptionPane.showMessageDialog(null, "Master! Congratulation", "Login Completed", JOptionPane.PLAIN_MESSAGE); 
      } 
      else 
      {
        // ID는 일치하나 Password 불일치시 Password 재입력 문구 팝업 
        String inputPass2 = JOptionPane.showInputDialog(null, "Enter the password again!", "Wrong Password", JOptionPane.ERROR_MESSAGE);

        if(inputPass2.equals(password)) 
        {
          // 재입력된 Password 일치시 보여줄 메시지
          JOptionPane.showMessageDialog(null, "Master! Congratulation", "Login COmpleted", JOptionPane.PLAIN_MESSAGE);
        } 
        else 
        {
          // 재입력된 Password 불일치시 에러 메시지 팝업
          JOptionPane.showMessageDialog(null, "Who are you?", "Wrong Password", JOptionPane.ERROR_MESSAGE);
        }

      }
    } 
    else 
    {
      // ID 불일치시 에러 메시지 팝업
      JOptionPane.showMessageDialog(null,"Who are you?", "Wrong ID", JOptionPane.ERROR_MESSAGE);
    }
  }
}
