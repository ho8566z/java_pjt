package com.office.dw.member;

// DB 접속 정보(주소·아이디·비밀번호)를 담는 클래스
public class DBConnectionInfo {

	private String url;
	private String userId;
	private String userPw;
	
	/** DB 접속 주소 값을 돌려준다. */
	public String getUrl() {
		return url;
	}
	/** DB 접속 주소 값을 설정한다. */
	public void setUrl(String url) {
		this.url = url;
	}
	/** DB 접속 아이디 값을 돌려준다. */
	public String getUserId() {
		return userId;
	}
	/** DB 접속 아이디 값을 설정한다. */
	public void setUserId(String userId) {
		this.userId = userId;
	}
	/** DB 접속 비밀번호 값을 돌려준다. */
	public String getUserPw() {
		return userPw;
	}
	/** DB 접속 비밀번호 값을 설정한다. */
	public void setUserPw(String userPw) {
		this.userPw = userPw;
	}
	
}
