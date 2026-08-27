package com.office.dw.member.service;

import java.util.List;
import java.util.Map;

import com.office.dw.member.DBConnectionInfo;

public class EMSInformationService {

	private String info;
	private String copyRight;
	private String ver;
	private String sYear;
	private String sMonth;
	private String sDay;
	private String eYear;
	private String eMonth;
	private String eDay;
	private List<String> developers;
	private Map<String, String> administrators;
	private Map<String, DBConnectionInfo> dbInfos;
	
	public void printEMSInformation() {
		System.out.println("EMS INFORMATION START ====================");
		String devPeriod = sYear + "/" + sMonth + "/" + sDay + " ~ " + eYear + "/" + eMonth + "/" + eDay;
		System.out.println(info + "(" + devPeriod + ")");
		System.out.println(copyRight);
		System.out.println(ver);
		System.out.println("Developers: " + developers);
		System.out.println("Administrators: " + administrators);
		System.out.println("EMS INFORMATION END ====================");
	}

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}

	public String getCopyRight() {
		return copyRight;
	}

	public void setCopyRight(String copyRight) {
		this.copyRight = copyRight;
	}

	public String getVer() {
		return ver;
	}

	public void setVer(String ver) {
		this.ver = ver;
	}

	public String getsYear() {
		return sYear;
	}

	public void setsYear(String sYear) {
		this.sYear = sYear;
	}

	public String getsMonth() {
		return sMonth;
	}

	public void setsMonth(String sMonth) {
		this.sMonth = sMonth;
	}

	public String getsDay() {
		return sDay;
	}

	public void setsDay(String sDay) {
		this.sDay = sDay;
	}

	public String geteYear() {
		return eYear;
	}

	public void seteYear(String eYear) {
		this.eYear = eYear;
	}

	public String geteMonth() {
		return eMonth;
	}

	public void seteMonth(String eMonth) {
		this.eMonth = eMonth;
	}

	public String geteDay() {
		return eDay;
	}

	public void seteDay(String eDay) {
		this.eDay = eDay;
	}

	public List<String> getDevelopers() {
		return developers;
	}

	public void setDevelopers(List<String> developers) {
		this.developers = developers;
	}

	public Map<String, String> getAdministrators() {
		return administrators;
	}

	public void setAdministrators(Map<String, String> administrators) {
		this.administrators = administrators;
	}

	public Map<String, DBConnectionInfo> getDbInfos() {
		return dbInfos;
	}

	public void setDbInfos(Map<String, DBConnectionInfo> dbInfos) {
		this.dbInfos = dbInfos;
	}
	
}
