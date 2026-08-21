package com.office.member;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class MemberService {
	
	MemberDao memberDao = null;

	public int memberRegistConfirm(HttpServletRequest request, HttpServletResponse response) {
		System.out.println("[MemberService] memberRegistConfirm()");
		
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
		
		if (result > 0) {
			System.out.println("[MemberService] NEW MEMBER SIGNUP SUCCESS");
			
		} else {
			System.out.println("[MemberService] NEW MEMBER SIGNUP FAIL");
			
		}
		
		return result;
		
	}
	
	

}
