package com.office.dw.member;

// DB 접속 정보(주소·아이디·비밀번호)를 담는 클래스
public class DBConnectionInfo {

	private String url;
	private String userId;
	private String userPw;
	
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserPw() {
		return userPw;
	}
	public void setUserPw(String userPw) {
		this.userPw = userPw;
	}
	
}
