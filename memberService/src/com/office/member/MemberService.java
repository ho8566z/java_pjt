package com.office.member;

import com.office.member.MemberDao;
import com.office.member.MemberDto;

/**
 * 회원가입, 로그인, 수정, 삭제 절차를 처리하고 실제 저장은 MemberDao 에 맡기는 서비스 클래스.
 */
public class MemberService {
	
MemberDao memberDao = new MemberDao();
	
	// Sign-Up
	/**
	 * 입력받은 회원 정보를 MemberDao 에 넘겨 회원가입을 진행한다.
	 */
	public void doSignUp(MemberDto memberDto) {
		System.out.println("[MemberSerive] doSignUp");
		
		// 회원가입 진행
//		MemberDao memberDao = new MemberDao();
		memberDao.insertMember(memberDto);
		
	}

	// Sign-In
	/**
	 * 아이디가 존재하고 비밀번호가 같으면 로그인 성공, 아니면 실패 메시지를 출력한다.
	 */
	public void doSignIn(MemberDto memberDto) {
		System.out.println("[MemberService] doSignIn");
		
//		MemberDao memberDao = new MemberDao();
		MemberDto selectedMemberDto = memberDao.selectMemberByMemId(memberDto.memId);
		
		if (selectedMemberDto != null) {
			// 존재하는 ID
			if (memberDto.memPw.equals(selectedMemberDto.memPw)) {
				System.out.println("Sign-In SUCCESS");
			} else {
				System.out.println("Sorry. Sign-In FAIL");
			}
			
		} else {
			// 존재하지 않는 ID
			System.out.println("Sorry. Sign-In FAIL");
		}
		
	}

	/** 회원 정보를 MemberDao 를 통해 수정한다. */
	public void doModify(MemberDto memberDto) {
		System.out.println("[memberDao] doModify");
		
		// 회원정보 수정 진행
		memberDao.updateMember(memberDto);
		
	}

	public void doDelete(MemberDto memberDto) {
		System.out.println("[MemberService] doDelete");
		
//		MemberDao memberDao = new MemberDao();
		MemberDto selectedMemberDto = memberDao.deleteMemberByMemId(memberDto.memId);
		
		if (selectedMemberDto != null) {
			// 존재하는 ID
			if (memberDto.memPw.equals(selectedMemberDto.memPw)) {
				System.out.println("Delete SUCCESS");
			} else {
				System.out.println("Sorry. Delete FAIL");
			}
			
		} else {
			// 존재하지 않는 ID
			System.out.println("Sorry. Delete FAIL");
		}
		
	}

}
