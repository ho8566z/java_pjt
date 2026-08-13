package com.office.ex;

import java.util.Scanner;

public class MainClass {

   public static void main(String[] args) {
      
      Scanner scanner = new Scanner(System.in);
      
      // ID, PW == 1
      /*
      System.out.print("Enter ID & PW");
      String id = scanner.nextLine();
      String pw = scanner.nextLine();
      
      Service service = new Service();
      service.doutentication(1, new AuthenticationDto(id, pw, null));
      */
      
      // ID, PW, MAIL == 2
      /*
      System.out.print("Enter ID & PW");
      String id = scanner.nextLine();
      String pw = scanner.nextLine();
      String mail = scanner.nextLine();
      
      Service service = new Service();
      service.doutentication(2, new AuthenticationDto(id, pw, mail));
      */
      
      Service service = new Service();
      
      // 1 ID, PW
      /*
      System.out.print("Enter ID & PW");
      String id = scanner.nextLine();
      String pw = scanner.nextLine();
      
//      Service service = new Service();
      service.doutentication(
    		  new AuthenticationByIdPw(), 
    		  new AuthenticationDto(id, pw, null));
    	*/
      
      
      // 2 ID, PW, MAIL
      System.out.print("Enter ID & PW");
      String id = scanner.nextLine();
      String pw = scanner.nextLine();
      String mail = scanner.nextLine();
      
//      Service service = new Service();
      service.doutentication(
    		  new AuthenticationByIdPwMail(), 
    		  new AuthenticationDto(id, pw, mail));
      
  
      
      scanner.close();
   }
   
}
