package com.office.dbex.session;

/**
 * 로그인한 회원의 ID 를 보관하는 세션 클래스.
 * 프로그램 전체에서 하나만 쓰도록 싱글톤으로 만들었다.
 */
public class SessionClass {
	
	private static SessionClass session;
	
	private String signInedMemId = null;
	
	private SessionClass() {}
	
	/**
	 * 하나뿐인 세션 객체를 돌려준다. 처음 호출할 때만 객체를 만든다.
	 */
	public static SessionClass getInstance() {
		
		if (session == null) {
			session = new SessionClass();
		}
		
		return session;
	}

	
	/**
	 * 로그인한 회원의 ID 를 돌려준다. 로그인하지 않았으면 null 이다.
	 */
	public String getSignInedMemId() {
		return signInedMemId;
	}
	/**
	 * 로그인한 회원의 ID 를 저장한다. null 을 넣으면 로그아웃 상태가 된다.
	 */
	public void setSignInedMemId(String signInedMemId) {
		this.signInedMemId = signInedMemId;
	}
	

}
