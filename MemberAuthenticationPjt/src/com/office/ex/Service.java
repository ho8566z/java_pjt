package com.office.ex;

public class Service {
	
	/**
	 * 전달받은 인증 방식(IAuthentication 구현체)으로 회원 정보를 인증한다.
	 */
	public void doutentication(IAuthentication iAuthentication, AuthenticationDto authenticationDto) {
		
		iAuthentication.autentication(authenticationDto);
		
	}	
	
}
