package com.office.ex;

public class AuthenticationByIdPw implements IAuthentication {

   @Override
   public void autentication(AuthenticationDto authenticationDto) {
      
      // gildong, 1234면 인증 완료
      if (authenticationDto.getId().equals("gildong") 
            && 
            authenticationDto.getPw().equals("1234")) {
         System.out.println("authentication SUCCESS!!");
         
      } else {
         System.out.println("authentication FAIL!!");
         
      }
      
   }
   
}
