package com.office.dw;

import java.util.HashMap;

public class MemberDao {
	
	// 클래스 풀네임 대신 import 를 쓴다. (ctrl + shift + o 로 import 정리)
	
	HashMap<String, MemberDto> memberDB =  new HashMap<String, MemberDto>();

	/ 새 회원을 아이디(memId)를 키로 해서 저장한다
	public void insertNewMember(MemberDto memberDto) {
		System.out.println("[MemberDao] insertNewMember()");
		
		memberDB.put(memberDto.memId, memberDto);
		
	}

	public MemberDto selectMemberDtoByMemId(String memId) {
		System.out.println("[MemberDao] selectMemberDtoByMemId()");
		
		MemberDto memberDto =  memberDB.get(memId);
		return memberDto;
		
	}

	public void updateMemberForMailAndPhone(MemberDto memberDto) {
		System.out.println("[MemberDao] updateMemberForMailAndPhone()");
		
		memberDB.put(memberDto.memId, memberDto);
		
	}

	public void deleteMemberByMemId(String memId) {
		System.out.println("[MemberDao] deleteMemberByMemId()");
		
		memberDB.remove(memId);
		
	}


}
