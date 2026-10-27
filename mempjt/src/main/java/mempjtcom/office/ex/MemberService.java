package mempjtcom.office.ex;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

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
		
		int result = memberDao.insertNewMember(memberDto);
		
		if (result > 0) {
			System.out.println("[MemberService] NEW MEMBER SIGNUP SUCCESS!!");
			
		} else {
			System.out.println("[MemberService] NEW MEMBER SIGNUP FAIL!!");
			
		}
		
		return result;
		
	}

	public String searchMember(HttpServletRequest request, HttpServletResponse response) {
		System.out.println("[MemberService] searchMember()");
		
		String memId = request.getParameter("memId");
		String memPw = request.getParameter("memPw");
		
		// MemberDto memberDto = new MemberDto(memId, memPw);
		
		MemberDto selectedMemberDtoByMemId = memberDao.selectMemberByMemId(memId);
		
		if (selectedMemberDtoByMemId != null) {
			
			if (selectedMemberDtoByMemId.getMemPw().equals(memPw)) {
				System.out.println("[MemberService] MEMBER SIGNIN SUCCESS!!");
				return selectedMemberDtoByMemId.getMemId();
				
			} else {
				System.out.println("[MemberService] MEMBER SIGNIN FAIL!!");
				return null;
				
			}
			
		} else {
			System.out.println("[MemberService] MEMBER SIGNIN FAIL!!");
			return null;
			
		}
		
	}

	public MemberDto getCurrentSigninedMember(String signinedMemId) {
		System.out.println("[MemberService] getCurrentSigninedMember()");
		
		MemberDto signinedMemberDto = memberDao.selectMemberByMemId(signinedMemId);
		
		return signinedMemberDto;
		
	}

	public int modifyMemberByMemNo(HttpServletRequest request, HttpServletResponse response) {
		System.out.println("[MemberService] modifyMemberByMemNo()");
		
		int memNo = Integer.parseInt(request.getParameter("memNo"));
//		String memId = request.getParameter("memId");
		
		HttpSession session = request.getSession();
		Object object = session.getAttribute(MemberConfig.SINGINED_MEMBERID);
		String memId = String.valueOf(object);
		
		String memPw = request.getParameter("memPw");
		String memMail = request.getParameter("memMail");
		String memPhone = request.getParameter("memPhone");
		
		MemberDto memberDto = new MemberDto(memNo, memId, memPw, memMail, memPhone, null, null);
		int result = memberDao.updateMemberByMemNo(memberDto);
		
		if (result > 0) {
			System.out.println("[MemberService] MEMBER UPDATE SUCCESS!!");
			
		} else {
			System.out.println("[MemberService] MEMBER UPDATE FAIL!!");
			
		}
		
		return result;
		
	}

}