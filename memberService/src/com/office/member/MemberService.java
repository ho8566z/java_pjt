package com.office.member;

import com.office.member.MemberDao;
import com.office.member.MemberDto;

public class MemberService {
	
MemberDao memberDao = new MemberDao();
	
	// Sign-Up
	public void doSignUp(MemberDto memberDto) {
		System.out.println("[MemberSerive] doSignUp");
		
		// 회원가입 진행
//		MemberDao memberDao = new MemberDao();
		memberDao.insertMember(memberDto);
		
	}

	// Sign-In
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
