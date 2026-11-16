package com.office.dw;

/**
 * 회원 가입·로그인·수정·삭제 규칙을 처리하고 저장은 MemberDao 에 맡기는 서비스.
 */
public class MemberService {
	
	MemberDao memberDao = new MemberDao();

	// SIGN_UP
	public void doSignUp(MemberDto memberDto) {
		System.out.println("[MemberService] doSignUp()");
		
		memberDao.insertNewMember(memberDto);
		
	}

	// SIGN_IN (인증(Yes or No) : Autentication // 인가(권한) : Athurization)
	public boolean doSignIn(MemberDto memberDto) {
		System.out.println("[MemberService] doSignIn()");
		
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

	// MODIFY (ID, PW 인증에 성공하면 메일·전화번호를 수정)
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

	// DELETE (ID, PW 인증에 성공하면 회원을 삭제)
	public void delete(MemberDto memberDto) {
		System.out.println("[MemberService] delete()");
		
		// 인증 : ID, PW
		boolean resultForAutentication = verifyByMemIdAndMemPw(memberDto.memId, memberDto.memPw);
		
		if (resultForAutentication) {
			memberDao.deleteMemberByMemId(memberDto.memId);
		}
		
		
	}
	
	// 로그인 로직을 재사용해 ID, PW 일치 여부만 확인
	public boolean verifyByMemIdAndMemPw(String id, String pw) {
		System.out.println("[MemberService] verifyByMemIdAndMemPw()");
		
		return doSignIn(new MemberDto(id, pw, null, null));
		
	}
	

}
