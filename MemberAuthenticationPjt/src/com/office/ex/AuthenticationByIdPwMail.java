package com.office.ex;

/**
 * 아이디, 비밀번호, 메일을 모두 확인해 회원을 인증하는 IAuthentication 구현체.
 * gildong, 1234, gildong@gmail.com 이 모두 일치할 때만 인증에 성공한다.
 */
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
