package mempjtcom.office.ex;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

/**
 * 회원 관련 비즈니스 로직을 담당하는 서비스.
 * 요청 파라미터로 MemberDto 를 만들고 실제 DB 작업은 IMemberDao 에 맡긴다.
 */
public class MemberService {

	private IMemberDao memberDao;
	
	/**
	 * @param memberDao 회원 DB 작업을 수행할 DAO
	 */
	public MemberService(IMemberDao memberDao) {
		this.memberDao = memberDao;
	}
	
	/**
	 * 요청 파라미터(memId, memPw, memMail, memPhone)로 신규 회원을 등록한다.
	 *
	 * @return 등록된 행 수(0보다 크면 성공)
	 */
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

	/**
	 * 요청 파라미터의 아이디와 비밀번호가 일치하는지 확인해 로그인 여부를 판단한다.
	 *
	 * @return 로그인 성공 시 회원 아이디, 실패 시 null
	 */
	public String searchMember(HttpServletRequest request, HttpServletResponse response) {
		System.out.println("[MemberService] searchMember()");
		
		String memId = request.getParameter("memId");
		String memPw = request.getParameter("memPw");
		
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

	/**
	 * 로그인 중인 회원 아이디로 회원 정보를 조회한다.
	 *
	 * @param signinedMemId 로그인한 회원 아이디
	 * @return 회원 정보, 없으면 null
	 */
	public MemberDto getCurrentSigninedMember(String signinedMemId) {
		System.out.println("[MemberService] getCurrentSigninedMember()");
		
		return memberDao.selectMemberByMemId(signinedMemId);
		
	}

	/**
	 * 요청 파라미터의 회원번호(memNo)에 해당하는 회원 정보를 수정한다.
	 * 아이디는 요청이 아니라 세션에 저장된 로그인 아이디를 사용한다.
	 *
	 * @return 수정된 행 수(0보다 크면 성공)
	 */
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