package com.office.dw;

public class MemberService {
	
	MemberDao memberDao = new MemberDao();

	// SIGIN_UP
	public void doSignUp(MemberDto memberDto) {
		System.out.println("[MemberService] doSignUp()");
		
//		memberDao = new MemberDao();
		memberDao.insertNewMember(memberDto);
		
	}

	// SIGN_IN (인증(Yes or No) : Autentication // 인가(권한) : Athurization)
	public boolean doSignIn(MemberDto memberDto) {
		System.out.println("[MemberService] doSignIn()");
		
//		memberDao = new MemberDao();
		MemberDto selectMemberDto = memberDao.selectMemberDtoByMemId(memberDto.memId);
		
		if (selectMemberDto != null) {
			if (selectMemberDto.memPw.equals(memberDto.memPw)) {
				System.out.println("[MemberService] SIGN_IN SUCCESS");
				return true;
				
			} else {
				System.out.println("[MemberService] SIGN_IN FAIL");
				return false;
			}
			
		} else {
			System.out.println("[MemberService] SIGN_IN FAIL");
			return false;
			
		}
		
	}

	public void modify(MemberDto memberDto) {
		System.out.println("[MemberService] modify()");
		
		// 인증 : ID, PW
		boolean resultForAutentication = verifyByMemIdAndMemPw(memberDto.memId, memberDto.memPw);
		
		// 업데이트 : Mail, Phone
		if (resultForAutentication) {
			// 업데이트 실시
			memberDao.updateMemberForMailAndPhone(memberDto);
			
		}
		
	}

	public void delete(MemberDto memberDto) {
		System.out.println("[MemberService] delete()");
		
		// 인증 : ID, PW
		boolean resultForAutentication = verifyByMemIdAndMemPw(memberDto.memId, memberDto.memPw);
		
		if (resultForAutentication) {
			memberDao.deleteMemberByMemId(memberDto.memId);
		}
		
		
	}
	
	public boolean verifyByMemIdAndMemPw(String id, String pw) {
		System.out.println("[MemberService] verifyByMemIdAndMemPw()");
		
		return doSignIn(new MemberDto(id, pw, null, null));
		
	}
	

}
