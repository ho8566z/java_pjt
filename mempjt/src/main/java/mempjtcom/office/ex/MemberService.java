package mempjtcom.office.ex;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class MemberService {
	
	private IMemberDao memberDao;
	
	public MemberService(IMemberDao memberDao) {
		this.memberDao = memberDao;
		
	}

	public int addNewMember(HttpServletRequest request, HttpServletResponse response) {
		System.out.println("[MemberService] addNewMember()");
		
		String memId = request.getParameter("memId");
		String memPw = request.getParameter("memPw");
		String memMail = request.getParameter("memMail");
		String memPhone = request.getParameter("memPhone");
		
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

	public String searchMember(HttpServletRequest request, HttpServletResponse response) {
		System.out.println("[MemberService] searchMember()");
		
		String memId = request.getParameter("memId");
		String memPw = request.getParameter("memPw");
		
		MemberDto selectedMemberDtoByMemId = memberDao.selectMemberByMemId(memId);
		
		if (selectedMemberDtoByMemId != null) {
			
			if (selectedMemberDtoByMemId.getMemPw().equals(memPw)) {
				System.out.println("[MemberService] MEMBER SIGNIN SUCCESS");
				return selectedMemberDtoByMemId.getMemId();
				
			} else {
				System.out.println("[MemberService] MEMBER SIGNIN FAIL");
				return null;
			}
			
		} else {
			System.out.println("[MemberService] MEMBER SIGNIN FAIL");
			return null;
		}
	}
}
