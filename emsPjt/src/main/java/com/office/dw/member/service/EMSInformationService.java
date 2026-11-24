package com.office.dw.member.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.office.dw.member.DBConnectionInfo;

/**
 * EMS 의 버전, 개발 기간, 개발자, 관리자, DB 접속 정보를 담아 두고 일부를 출력하는 서비스.
 * printEMSInformation() 은 소개 문구·저작권·버전·개발 기간·개발자·관리자만 콘솔에 보여 주며,
 * DB 접속 정보(dbInfos)는 보관만 하고 출력하지 않는다.
 */
public class EMSInformationService {

	private String info;			// EMS 소개 문구
	private String copyRight;		// 저작권 문구
	private String ver;				// 버전
	private String sYear;			// 개발 시작: 년
	private String sMonth;			// 개발 시작: 월
	private String sDay;			// 개발 시작: 일
	private String eYear;			// 개발 종료: 년
	private String eMonth;			// 개발 종료: 월
	private String eDay;			// 개발 종료: 일
	private List<String> developers;				// 개발자 이름 목록
	private Map<String, String> administrators;		// 관리자 정보(이름 → 연락처 등)
	private Map<String, DBConnectionInfo> dbInfos;	// DB 이름별 접속 정보
	
	/** 소개 문구와 개발 기간(시작 ~ 종료), 저작권, 버전, 개발자, 관리자를 콘솔에 차례로 출력한다. */
	public void printEMSInformation() {
		System.out.println("EMS INFORMATION START -------------");
		String devPeriod = sYear + "/" + sMonth + "/" + sDay + " ~ " + eYear + "/" + eMonth + "/" + eDay;
		System.out.println(info + "(" + devPeriod + ")");
		System.out.println(copyRight);
		System.out.println(ver);
		System.out.println("Developers: " + developers);
		System.out.println("Administrators: " + administrators);
		System.out.println("EMS INFORMATION END -------------");
	}

	/** EMS 소개 문구 값을 돌려준다. */
	public String getInfo() {
		return info;
	}

	/** EMS 소개 문구 값을 설정한다. */
	public void setInfo(String info) {
		this.info = info;
	}

	/** 저작권 문구 값을 돌려준다. */
	public String getCopyRight() {
		return copyRight;
	}

	/** 저작권 문구 값을 설정한다. */
	public void setCopyRight(String copyRight) {
		this.copyRight = copyRight;
	}

	/** 버전 값을 돌려준다. */
	public String getVer() {
		return ver;
	}

	/** 버전 값을 설정한다. */
	public void setVer(String ver) {
		this.ver = ver;
	}

	/** 개발 시작 년도 값을 돌려준다. */
	public String getsYear() {
		return sYear;
	}

	/** 개발 시작 년도 값을 설정한다. */
	public void setsYear(String sYear) {
		this.sYear = sYear;
	}

	/** 개발 시작 월 값을 돌려준다. */
	public String getsMonth() {
		return sMonth;
	}

	/** 개발 시작 월 값을 설정한다. */
	public void setsMonth(String sMonth) {
		this.sMonth = sMonth;
	}

	/** 개발 시작 일 값을 돌려준다. */
	public String getsDay() {
		return sDay;
	}

	/** 개발 시작 일 값을 설정한다. */
	public void setsDay(String sDay) {
		this.sDay = sDay;
	}

	/** 개발 종료 년도 값을 돌려준다. */
	public String geteYear() {
		return eYear;
	}

	/** 개발 종료 년도 값을 설정한다. */
	public void seteYear(String eYear) {
		this.eYear = eYear;
	}

	/** 개발 종료 월 값을 돌려준다. */
	public String geteMonth() {
		return eMonth;
	}

	/** 개발 종료 월 값을 설정한다. */
	public void seteMonth(String eMonth) {
		this.eMonth = eMonth;
	}

	/** 개발 종료 일 값을 돌려준다. */
	public String geteDay() {
		return eDay;
	}

	/** 개발 종료 일 값을 설정한다. */
	public void seteDay(String eDay) {
		this.eDay = eDay;
	}

	/** 개발자 이름 목록 값을 돌려준다. */
	public List<String> getDevelopers() {
		return developers;
	}

	/** 개발자 이름 목록 값을 설정한다. */
	public void setDevelopers(List<String> developers) {
		this.developers = developers;
	}

	/** 관리자 정보 값을 돌려준다. */
	public Map<String, String> getAdministrators() {
		return administrators;
	}

	/** 관리자 정보 값을 설정한다. */
	public void setAdministrators(Map<String, String> administrators) {
		this.administrators = administrators;
	}

	/** DB 이름별 접속 정보 값을 돌려준다. */
	public Map<String, DBConnectionInfo> getDbInfos() {
		return dbInfos;
	}

	/** DB 이름별 접속 정보 값을 설정한다. */
	public void setDbInfos(Map<String, DBConnectionInfo> dbInfos) {
		this.dbInfos = dbInfos;
	}
	
}
