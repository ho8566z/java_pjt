package com.office.dbex.member;

/** 회원 서비스에서 쓰는 메뉴 번호와 가입·로그인 결과 상수를 모아 둔 인터페이스. */
public interface IMember {
	
	// MENU
	final public int MEMBER_SIGN_UP		= 1;
	final public int MEMBER_SIGN_IN		= 2;
	final public int MEMBER_MODIFY		= 3;
	final public int MEMBER_DELETE		= 4;
	final public int MEMBER_SIGN_OUT	= 5;
	
	// SIGN_UP RESULT
	final public int MEMBER_SIGN_UP_SUCCESS = 1;
	final public int MEMBER_SIGN_UP_FAIL = 0;

	// SIGN_IN RESULT
	final public boolean MEMBER_SIGN_IN_SUCCESS = true;
	final public boolean MEMBER_SIGN_IN_FAIL 	= false;
		
}
