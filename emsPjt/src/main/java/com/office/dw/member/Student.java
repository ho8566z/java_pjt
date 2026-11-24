package com.office.dw.member;

/**
 * EMS 에서 관리하는 학생 한 명의 정보.
 * 학번, 아이디, 비밀번호, 이름, 나이, 성별, 전공을 가진다.
 */
public class Student {

	private String sNum;
	private String sId;
	private String sPw;
	private String sName;
	private int sAge;
	private char sGender;
	private String sMajor;
	
	public Student(String sNum, String sId, String sPw, 
			String sName, int sAge, char sGender, String sMajor) {
		this.sNum = sNum;
		this.sId = sId;
		this.sPw = sPw;
		this.sName = sName;
		this.sAge = sAge;
		this.sGender = sGender;
		this.sMajor = sMajor;
	}

	/** 학번 값을 돌려준다. */
	public String getsNum() {
		return sNum;
	}

	/** 학번 값을 설정한다. */
	public void setsNum(String sNum) {
		this.sNum = sNum;
	}

	/** 아이디 값을 돌려준다. */
	public String getsId() {
		return sId;
	}

	/** 아이디 값을 설정한다. */
	public void setsId(String sId) {
		this.sId = sId;
	}

	/** 비밀번호 값을 돌려준다. */
	public String getsPw() {
		return sPw;
	}

	/** 비밀번호 값을 설정한다. */
	public void setsPw(String sPw) {
		this.sPw = sPw;
	}

	/** 이름 값을 돌려준다. */
	public String getsName() {
		return sName;
	}

	/** 이름 값을 설정한다. */
	public void setsName(String sName) {
		this.sName = sName;
	}

	/** 나이 값을 돌려준다. */
	public int getsAge() {
		return sAge;
	}

	/** 나이 값을 설정한다. */
	public void setsAge(int sAge) {
		this.sAge = sAge;
	}

	/** 성별 값을 돌려준다. */
	public char getsGender() {
		return sGender;
	}

	/** 성별 값을 설정한다. */
	public void setsGender(char sGender) {
		this.sGender = sGender;
	}

	/** 전공 값을 돌려준다. */
	public String getsMajor() {
		return sMajor;
	}

	/** 전공 값을 설정한다. */
	public void setsMajor(String sMajor) {
		this.sMajor = sMajor;
	}
	
}
