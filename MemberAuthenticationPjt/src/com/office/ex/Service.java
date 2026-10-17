package com.office.ex;

/**
 * 인증 요청을 받아 전달된 인증 방식에 위임하는 서비스.
 * 구체적인 인증 방식은 알지 못하고 IAuthentication 인터페이스에만 의존한다.
 */
public class Service {
	
	/**
	 * 전달받은 인증 방식(IAuthentication 구현체)으로 회원 정보를 인증한다.
	 */
	public void doutentication(IAuthentication iAuthentication, AuthenticationDto authenticationDto) {
		
		iAuthentication.autentication(authenticationDto);
		
	}	
	
}
