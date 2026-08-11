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
		
//		memberDB.add(memberDto);
		memberDB.put(memberDto.memId, memberDto);
		
	}

	public MemberDto selectMemberDtoByMemId(String memId) {
		System.out.println("[MemberDao] selectMemberDtoByMemId()");
		
//		for (int i = 0; i < memberDB.size(); i++) {
//			MemberDto dto = memberDB.get(i);
//			if (dto.memId.equals(memId)) {
//				return dto;
//			}
//		}
//		
//		return null;
		
		MemberDto memberDto =  memberDB.get(memId);
		return memberDto;
		
	}

	public void updateMemberForMailAndPhone(MemberDto memberDto) {
		System.out.println("[MemberDao] updateMemberForMailAndPhone()");
		
//		for (int i = 0; i < memberDB.size(); i++) {
//			MemberDto dto = memberDB.get(i);
//			if (dto.memId.equals(memberDto.memId)) {
//				dto.memMail = memberDto.memMail;
//				dto.memPhone = memberDto.memPhone;
//				
//				System.out.println("Mail : " + dto.memMail);
//				System.out.println("Phone : " + dto.memPhone);
//				
//				break;
//			}
//		}
		
		memberDB.put(memberDto.memId, memberDto);
		
	}

	public void deleteMemberByMemId(String memId) {
		System.out.println("[MemberDao] deleteMemberByMemId()");
		
//		for (int i = 0; i < memberDB.size(); i++) {
//			MemberDto dto = memberDB.get(i);
//			if (dto.memId.equals(memId)) {
//				memberDB.remove(i);
//				
//				System.out.println("memberDB.size() : " + memberDB.size());
//				
//			}
//		}
		
		memberDB.remove(memId);
		
	}


}
