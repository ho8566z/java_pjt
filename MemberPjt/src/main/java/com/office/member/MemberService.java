package com.office.member;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class MemberService {
	
	// 회원 정보를 DB 에 저장하는 일은 MemberDao 에게 맡긴다
	MemberDao memberDao = null;

	public int memberRegistConfirm(HttpServletRequest request, HttpServletResponse response) {
		System.out.println("[MemberService] memberRegistConfirm()");
		
		// 회원가입 폼에서 넘어온 값을 요청에서 꺼낸다
		String memId = request.getParameter("memId");
		String memPw = request.getParameter("memPw");
		String memMail = request.getParameter("memMail");
		String memPhone = request.getParameter("memPhone");
		
		System.out.println("memId : " + memId);
		System.out.println("memPw : " + memPw);
		System.out.println("memMail : " + memMail);
		System.out.println("memPhone : " + memPhone);
		
		MemberDto memberDto = new MemberDto(memId, memPw, memMail, memPhone);
		
		memberDao = new MemberDao();
		int result = memberDao.insertNewMember(memberDto);
		
		// 저장된 행이 1개 이상이면 가입 성공이다
		if (result > 0) {
			System.out.println("[MemberService] NEW MEMBER SIGNUP SUCCESS");
			
		} else {
			System.out.println("[MemberService] NEW MEMBER SIGNUP FAIL");
			
		}
		
		return result;
		
	}
	
	

}
