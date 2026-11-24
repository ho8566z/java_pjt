package com.office.dw;

/**
 * EMS 에서 쓰는 학생 샘플 데이터를 보관한다.
 * 학번, 아이디, 이름 등 항목별 배열을 getter/setter 로 주고받는다.
 */
public class InitSampleData {

	/*
	private String[] sNums = {"hbs001", "hbs002", "hbs003", "hbs004", "hbs005"}; 
	private String[] sIds = {"rabbit", "hippo", "raccoon", "elephant", "lion"};
	private String[] sPws = {"96539", "64875", "15284", "48765", "28661"};
	private String[] sNames = {"agatha", "barbara", "chris", "doris", "elva"};
	private int[] sAges = {19, 22, 20, 27, 19};
	private char[] sGenders = {'M', 'W', 'W', 'M', 'M'}; 
	private String[] sMajors = {
			"English Literature",
			"Korean Language and Literature", 
			"French Language and Literature",
			"Philosophy", 
			"History"};
	*/
	
	private String[] sNums; 
	private String[] sIds;
	private String[] sPws;
	private String[] sNames;
	private int[] sAges;
	private char[] sGenders;
	private String[] sMajors;
	
	/** 학번 샘플 배열을 돌려준다. */
	public String[] getsNums() {
		return sNums;
	}
	/** 학번 샘플 배열을 설정한다. */
	public void setsNums(String[] sNums) {
		this.sNums = sNums;
	}
	/** 아이디 샘플 배열을 돌려준다. */
	public String[] getsIds() {
		return sIds;
	}
	/** 아이디 샘플 배열을 설정한다. */
	public void setsIds(String[] sIds) {
		this.sIds = sIds;
	}
	/** 비밀번호 샘플 배열을 돌려준다. */
	public String[] getsPws() {
		return sPws;
	}
	/** 비밀번호 샘플 배열을 설정한다. */
	public void setsPws(String[] sPws) {
		this.sPws = sPws;
	}
	/** 이름 샘플 배열을 돌려준다. */
	public String[] getsNames() {
		return sNames;
	}
	/** 이름 샘플 배열을 설정한다. */
	public void setsNames(String[] sNames) {
		this.sNames = sNames;
	}
	/** 나이 샘플 배열을 돌려준다. */
	public int[] getsAges() {
		return sAges;
	}
	/** 나이 샘플 배열을 설정한다. */
	public void setsAges(int[] sAges) {
		this.sAges = sAges;
	}
	/** 성별 샘플 배열을 돌려준다. */
	public char[] getsGenders() {
		return sGenders;
	}
	/** 성별 샘플 배열을 설정한다. */
	public void setsGenders(char[] sGenders) {
		this.sGenders = sGenders;
	}
	/** 전공 샘플 배열을 돌려준다. */
	public String[] getsMajors() {
		return sMajors;
	}
	/** 전공 샘플 배열을 설정한다. */
	public void setsMajors(String[] sMajors) {
		this.sMajors = sMajors;
	}
	
}
