package com.office.ex;

import java.util.Scanner;

public class MainClass {

   public static void main(String[] args) {
      
      Scanner scanner = new Scanner(System.in);
      
      Service service = new Service();
      
      // 2 ID, PW, MAIL
      System.out.print("Enter ID & PW");
      String id = scanner.nextLine();
      String pw = scanner.nextLine();
      String mail = scanner.nextLine();
      
      service.doutentication(
    		  new AuthenticationByIdPwMail(), 
    		  new AuthenticationDto(id, pw, mail));
      
  
      
      // 입력이 끝났으므로 Scanner 자원 해제
      scanner.close();
   }
   
}
