package com.office.ex;

public class Service {
	
	
	public void doutentication(IAuthentication iAuthentication, AuthenticationDto authenticationDto) {
		
		iAuthentication.autentication(authenticationDto);
		
	}	
	
}
