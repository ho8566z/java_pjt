package com.office.ex;

/**
 * 아이디와 비밀번호만으로 회원을 인증하는 IAuthentication 구현체.
 * 아이디가 gildong, 비밀번호가 1234 일 때만 인증에 성공한다.
 */
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
