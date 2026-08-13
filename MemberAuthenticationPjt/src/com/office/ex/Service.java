package com.office.ex;

public class Service {
	
	/*
	public void doutentication(int num, AuthenticationDto authenticationDto) {
		
		switch (num) {
		case 1:		// id, pw 인증
			
			AuthenticationByIdPw authenticationByIdPw = new AuthenticationByIdPw();
			authenticationByIdPw.autentication(authenticationDto);
			
			break;
			
		case 2:		// id, pw, mail 인증
			
			AuthenticationByIdPwMail authenticationByIdPwMail = new AuthenticationByIdPwMail();
			authenticationByIdPwMail.autentication(authenticationDto);
			
			break;
			
		}
		
	}
	*/
	
	
	public void doutentication(IAuthentication iAuthentication, AuthenticationDto authenticationDto) {
		
		iAuthentication.autentication(authenticationDto);
		
	}	
	
}
