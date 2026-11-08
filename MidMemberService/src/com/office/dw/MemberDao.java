package com.office.dw;

import java.util.HashMap;

public class MemberDao {
	
//	java.util.ArrayList<MemberDto> memberDB = new java.util.ArrayList<MemberDto>();
	// 클래스 풀네임을 쓰는 방법(지양할 것)
	// ctrl + shift + o = 자동으로 import 하고, 사용하지 않는 import는 삭제한다.
	// 1145 이미지 참조
//	ArrayList<MemberDto> memberDB = new ArrayList<MemberDto>();
	
	HashMap<String, MemberDto> memberDB =  new HashMap<String, MemberDto>();

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
