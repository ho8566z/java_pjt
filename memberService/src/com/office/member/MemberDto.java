package com.office.member;

/**
 * 회원 정보를 담는 DTO.
 * 아이디, 비밀번호, 메일을 생성자로 받아 보관한다.
 */
public class MemberDto {
	
//	final int MEMID = 1;
//	final int MEMPW = 2;
//	final int MEMMAIL = 3;
	
	String memId;
	String memPw;
	String memMail;
	
	public MemberDto(String memId, String memPw, String memMail) {
		super();
		this.memId = memId;
		this.memPw = memPw;
		this.memMail = memMail;
	}

}
