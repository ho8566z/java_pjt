package com.office.dw;

// 회원 한 명의 정보를 담아 옮기는 데이터 객체(DTO)
public class MemberDto {
	
	String memId;
	String memPw;
	String memMail;
	String memPhone;
	
	// 생성할 때 네 가지 값을 한꺼번에 받아 필드에 저장한다
	public MemberDto(String memId, String memPw, String memMail, String memPhone) {
		this.memId = memId;
		this.memPw = memPw;
		this.memMail = memMail;
		this.memPhone = memPhone;
		
	}

}
