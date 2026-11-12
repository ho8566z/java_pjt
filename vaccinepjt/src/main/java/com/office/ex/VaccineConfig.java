package com.office.ex;

/** 예방접종 기능의 요청 경로(.vc)와 뷰 경로를 모아 둔 상수 클래스. */
public class VaccineConfig {

	final static public String HOME = "/";
	
	final static public String VACCINE_RESISTER_FORM = "/vaccine_resister_form.vc";
	final static public String VACCINE_RESISTER_CONFIRM = "/vaccine_resister_confirm.vc";
	
	final static public String VACCINE_LIST = "/vaccine_list.vc";
	
	final static public String VIEW_PREFIX = "views/";
	final static public String VIEW_SUFFIX = ".jsp";
	
	final static public String VACCINE_DELETE = "/vaccine_delete.vc";
	
}
