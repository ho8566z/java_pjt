package com.office.member;

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
