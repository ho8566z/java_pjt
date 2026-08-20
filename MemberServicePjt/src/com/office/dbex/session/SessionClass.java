package com.office.dbex.session;

public class SessionClass {
	
	private static SessionClass session;
	
	private String signInedMemId = null;
	
	private SessionClass() {}
	
	public static SessionClass getInstance() {
		
		if (session == null) {
			session = new SessionClass();
		}
		
		return session;
	}

	
	public String getSignInedMemId() {
		return signInedMemId;
	}
	public void setSignInedMemId(String signInedMemId) {
		this.signInedMemId = signInedMemId;
	}
	

}
