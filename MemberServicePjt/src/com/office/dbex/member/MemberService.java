package com.office.dbex.member;

import com.office.dbex.session.SessionClass;

public class MemberService implements IMember {
	/*
	IMemberDao memberDao = new MemberDao();
	IMemberDao memberDao = new MemberDaoForOracle();
	*/
	
	IMemberDao memberDao;
	
	public MemberService(IMemberDao iMemberDao) {
		this.memberDao = iMemberDao;
	}
	
	// Sign_Up
	public int doSignUp(MemberDto memberDto) {
		System.out.println("[MemberService] doSignUp()");
		
		int result = memberDao.insertNewMember(memberDto);
		/*
		if (result > 0) {
			System.out.println("[MemberService] NEW MEMBER SIGN_UP SUCCESS");
		
		} else {
			System.out.println("[MemberService] NEW MEMBER SIGN_UP FAIL");
			
		}
		*/
		
		switch (result) {
		case MEMBER_SIGN_UP_SUCCESS:
			System.out.println("[MemberService] MEMBER_SIGN_UP_SUCCESS");	// =1
			
			break;
			
		case MEMBER_SIGN_UP_FAIL:
			System.out.println("[MemberService] MEMBER_SIGN_UP_FAIL");		// =0
			
			break;
			
		default:
			System.out.println("[MemberService] MEMBER_SIGN_UP_FAIL");
			
			break;
			
		}

		return result;
	}

	// Sign_In
	public boolean doSignIn(MemberDto memberDto) {
		System.out.println("[MemberService] doSignIn()");
		
		// ID, PW
		MemberDto selectedMemberDto = 
				memberDao.selectMemberByMemId(memberDto.getMemId());	// By => WHERE
		/*
		if (selectedMemberDto != null) {
			System.out.println("[MemberService] MEMBER SIGN_IN SUCCESS");
			return MEMBER_SIGN_IN_SUCCESS;
			
		} else {
			System.out.println("[MemberService] MEMBER SIGN_IN FAIL");
			return MEMBER_SIGN_IN_FAIL;
		}
		*/
		
		if (selectedMemberDto != null) {
			if (selectedMemberDto.getMemPw().equals(memberDto.getMemPw())) {
				System.out.println("[MemberService] MEMBER SIGN_IN SUCCESS");
			
				return MEMBER_SIGN_IN_SUCCESS;
				
			} else {
				System.out.println("[MemberService] MEMBER SIGN_IN FAIL");
				System.out.println("[MemberService] PW NG");
				
				return MEMBER_SIGN_IN_FAIL;
			}
			
		} else {
			System.out.println("[MemberService] MEMBER SIGN_IN FAIL");
			System.out.println("[MemberService] ID NG");
			
			return MEMBER_SIGN_IN_FAIL;
			
		}
	
	}

	// Modify
	public int doModify(MemberDto memberDtoForModify) {
		System.out.println("[MemberService] doModify()");
		
		memberDtoForModify.setMemId(SessionClass.getInstance().getSignInedMemId());
		
		int result = memberDao.updateMembere(memberDtoForModify);
		
		if (result > 0) {
			System.out.println("[MemberService] MEMBER MODIFY SUCCESS");
		
		} else {
			System.out.println("[MemberService] MEMBER MODIFY FAIL");
		}
		
		return result;
	}

	// DELETE
	public int doRemove() {
		System.out.println("[MemberService] doRemove()");
		
		int result = memberDao.deleteMemberByMemId(SessionClass.getInstance().getSignInedMemId());

		if (result > 0) {
			System.out.println("[MemberService] MEMBER DELETE SUCCESS");
			
		} else {
			System.out.println("[MemberService] MEMBER DELETE FAIL");
			
		}
		
		return result;
	}

}
