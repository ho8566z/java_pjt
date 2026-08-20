package com.office.dbex.member;

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

	// SIGN_UP RESULT
	final public boolean MEMBER_SIGN_IN_SUCCESS = true;
	final public boolean MEMBER_SIGN_IN_FAIL 	= false;
		
}
