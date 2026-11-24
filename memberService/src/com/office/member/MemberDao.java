package com.office.member;

import java.util.ArrayList;

import com.office.member.MemberDto;

/**
 * 회원 정보를 ArrayList(memberDB)에 보관하는 메모리 기반 DAO 클래스.
 */
public class MemberDao {
	
ArrayList<MemberDto> memberDB = new ArrayList<MemberDto>();
	
	public void insertMember(MemberDto memberDto) {
		System.out.println("[MemberDao] insertMember");
		
		memberDB.add(memberDto);
		
		// 확인
		MemberDto dto = memberDB.get(0);
		System.out.println("아이디 : " + dto.memId);
		System.out.println("비밀번호 : " + dto.memPw);
		System.out.println("메일 : " + dto.memMail);
	}

	
	/**
	 * 아이디가 같은 회원을 찾아 돌려준다.
	 * 
	 * @param memId 찾을 회원 아이디
	 * @return 찾은 회원 정보. 없으면 null
	 */
	public MemberDto selectMemberByMemId(String memId) {
		System.out.println("[MemberDao] selectMemberByMemId()");
		
		for (int i = 0; i < memberDB.size(); i++) {
			MemberDto dto = memberDB.get(i);
			if (dto.memId.equals(memId)) {
				return dto;
			}
		}
		
		return null;
	}

	
	public void updateMember(MemberDto memberDto) {
		System.out.println("[MemberDao] updateMember()");
		
		for (int i = 0; i < memberDB.size(); i++) {
			MemberDto dto = memberDB.get(i);
			if (dto.memId.equals(memberDto.memId)) {
			
//				memberDto.memPw;
//				memberDto.memMail;
				
			}
		
		}
		
		// 확인
		MemberDto dto = memberDB.get(0);
		System.out.println("아이디 : " + dto.memId);
		System.out.println("비밀번호 : " + dto.memPw);
		System.out.println("메일 : " + dto.memMail);

	}

	
	public MemberDto deleteMemberByMemId(String memId) {
		System.out.println("[MemberDao] deleteMemberByMemId()");
		
		for (int j = 0; j < memberDB.size(); j++) {
			MemberDto dto = memberDB.get(j);
			if (dto.memId.equals(memId)) {
				memberDB.remove(memId);
			}
		}
		
		return null;
	}

}
