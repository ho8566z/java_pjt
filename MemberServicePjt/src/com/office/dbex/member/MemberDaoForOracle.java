package com.office.dbex.member;

/** Oracle 용 회원 DAO. 아직 구현 전이라 모든 메서드가 기본값(0, null)을 반환한다. */
public class MemberDaoForOracle implements IMemberDao {

	@Override
	public int insertNewMember(MemberDto memberDto) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public MemberDto selectMemberByMemId(String memberId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int updateMember(MemberDto memberDto) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteMemberByMemId(String MemId) {
		// TODO Auto-generated method stub
		return 0;
	}

}
