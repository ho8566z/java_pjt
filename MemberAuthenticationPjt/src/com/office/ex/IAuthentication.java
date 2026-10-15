package com.office.ex;

/**
 * 회원 인증 방식을 정의하는 인터페이스.
 * 인증 조건(ID/PW, ID/PW/메일 등)은 구현 클래스가 결정한다.
 */
public interface IAuthentication {

   public void autentication(AuthenticationDto authenticationDto);
   
}
