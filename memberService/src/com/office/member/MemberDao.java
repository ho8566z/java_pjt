package com.office.member;

import java.util.ArrayList;

import com.office.member.MemberDto;

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
