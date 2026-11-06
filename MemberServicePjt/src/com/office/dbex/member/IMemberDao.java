package com.office.dbex.member;

public interface IMemberDao {
	
	// DB 접속에 쓰는 상수
	final String URL = "jdbc:mysql://localhost:3306/db_member";
	final String USER = "root";
	final String PASSWORD = "1234";

	
	// 새 회원을 저장하고 저장된 행 수를 돌려준다
	public int insertNewMember(MemberDto memberDto);

	// 아이디로 회원 한 명을 조회한다
	public MemberDto selectMemberByMemId(String memberId);

	// 회원 정보를 수정하고 수정된 행 수를 돌려준다
	public int updateMember(MemberDto memberDto);

	// 아이디로 회원을 삭제하고 삭제된 행 수를 돌려준다
	public int deleteMemberByMemId(String MemId);
	
}
