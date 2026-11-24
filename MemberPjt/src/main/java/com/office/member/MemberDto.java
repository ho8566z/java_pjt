package com.office.member;

/**
 * 회원 한 명의 정보를 담는 DTO.
 * 번호, 아이디, 비밀번호, 메일, 전화번호와 등록·수정일을 가진다.
 */
public class MemberDto {
	
	private int memNo;
	private String memId;
	private String memPw;
	private String memMail;
	private String memPhone;
	private String memRegDate;
	private String memModDate;
	
	
	/**
	 * 값이 없는 빈 회원 객체를 만든다.
	 */
	public MemberDto() {
		
	}
	
	
	/**
	 * 아이디와 비밀번호만 가진 회원 객체를 만든다. 로그인할 때 쓴다.
	 */
	public MemberDto(String memId, String memPw) {
		this.memId = memId;
		this.memPw = memPw;
	}


	/**
	 * 가입할 때 입력받는 아이디, 비밀번호, 메일, 전화번호로 회원 객체를 만든다.
	 */
	public MemberDto(String memId, String memPw, String memMail, String memPhone) {
		this.memId = memId;
		this.memPw = memPw;
		this.memMail = memMail;
		this.memPhone = memPhone;
	}


	/**
	 * 번호와 등록·수정일까지 모든 필드를 채운 회원 객체를 만든다. DB 조회 결과를 담을 때 쓴다.
	 */
	public MemberDto(int memNo, String memId, String memPw, String memMail, String memPhone, String memRegDate,
			String memModDate) {
		this.memNo = memNo;
		this.memId = memId;
		this.memPw = memPw;
		this.memMail = memMail;
		this.memPhone = memPhone;
		this.memRegDate = memRegDate;
		this.memModDate = memModDate;
	}
	
	
	/** 회원 번호 값을 돌려준다. */
	public int getMemNo() {
		return memNo;
	}
	/** 회원 번호 값을 설정한다. */
	public void setMemNo(int memNo) {
		this.memNo = memNo;
	}
	/** 회원 아이디 값을 돌려준다. */
	public String getMemId() {
		return memId;
	}
	/** 회원 아이디 값을 설정한다. */
	public void setMemId(String memId) {
		this.memId = memId;
	}
	/** 회원 비밀번호 값을 돌려준다. */
	public String getMemPw() {
		return memPw;
	}
	/** 회원 비밀번호 값을 설정한다. */
	public void setMemPw(String memPw) {
		this.memPw = memPw;
	}
	/** 회원 메일 값을 돌려준다. */
	public String getMemMail() {
		return memMail;
	}
	/** 회원 메일 값을 설정한다. */
	public void setMemMail(String memMail) {
		this.memMail = memMail;
	}
	/** 회원 전화번호 값을 돌려준다. */
	public String getMemPhone() {
		return memPhone;
	}
	/** 회원 전화번호 값을 설정한다. */
	public void setMemPhone(String memPhone) {
		this.memPhone = memPhone;
	}
	/** 회원 등록일 값을 돌려준다. */
	public String getMemRegDate() {
		return memRegDate;
	}
	/** 회원 등록일 값을 설정한다. */
	public void setMemRegDate(String memRegDate) {
		this.memRegDate = memRegDate;
	}
	/** 회원 수정일 값을 돌려준다. */
	public String getMemModDate() {
		return memModDate;
	}
	/** 회원 수정일 값을 설정한다. */
	public void setMemModDate(String memModDate) {
		this.memModDate = memModDate;
	}
	
	
	

}
