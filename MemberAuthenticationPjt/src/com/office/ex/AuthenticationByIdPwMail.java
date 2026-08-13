package com.office.ex;

public class AuthenticationByIdPwMail implements IAuthentication {

   @Override
   public void autentication(AuthenticationDto authenticationDto) {
	   
      // gildong, 1234, gildong@gmail.com면 인증 완료
      if (authenticationDto.getId().equals("gildong") 
            && 
            authenticationDto.getPw().equals("1234")
            &&
            authenticationDto.getMail().equals("gildong@gmail.com")) {
         System.out.println("authentication SUCCESS!!");
               
      } else {
         System.out.println("authentication FAIL!!");
               
      }
      
   }

}
