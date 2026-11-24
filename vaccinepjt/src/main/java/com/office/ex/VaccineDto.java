package com.office.ex;

/**
 * 백신 접종자, 접종 장소, 백신 종류 테이블의 컬럼 값을 한데 담아 옮기는 DTO.
 */
public class VaccineDto {

	// tbl_flu_vaccin_person
	private int fvp_no;
	private String fvp_name;
	private String ss_number;
	private String fvp_mail;
	private String fvp_phone;
	private String fvp_reg_date;
	private String fvp_mod_date;
	
	// tbl_fv_location
	private String fv_location_no;
	private String fv_location_name;
	private String fv_location_addr;
	private String fv_location_phone;
	private String fv_location_manager;
	
	// fv_type
	private int fv_type_no;
	private String fv_type;
	private String fv_type_manuf_country;
	private String fv_type_manuf_date;
	
	
	public VaccineDto() {
		
	}
	
	public VaccineDto(String fvp_name, String ss_number, String fvp_mail, String fvp_phone,
			String fv_location_no, String fv_type) {
		this.fvp_name = fvp_name;
		this.ss_number = ss_number;
		this.fvp_mail = fvp_mail;
		this.fvp_phone = fvp_phone;
		this.fv_location_no = fv_location_no;
		this.fv_type = fv_type;
	}
	
	
	public VaccineDto(int fvp_no, String fvp_name, String ss_number, String fvp_mail, String fvp_phone,
			String fv_location_no, String fv_type, String fvp_reg_date, String fvp_mod_date) {
		this.fvp_no = fvp_no;
		this.fvp_name = fvp_name;
		this.ss_number = ss_number;
		this.fvp_mail = fvp_mail;
		this.fvp_phone = fvp_phone;
		this.fv_location_no = fv_location_no;
		this.fv_type = fv_type;
		this.fvp_reg_date = fvp_reg_date;
		this.fvp_mod_date = fvp_mod_date;
	}

	/** 접종자 번호 값을 돌려준다. */
	public int getFvp_no() {
		return fvp_no;
	}

	/** 접종자 번호 값을 설정한다. */
	public void setFvp_no(int fvp_no) {
		this.fvp_no = fvp_no;
	}

	/** 접종자 이름 값을 돌려준다. */
	public String getFvp_name() {
		return fvp_name;
	}

	/** 접종자 이름 값을 설정한다. */
	public void setFvp_name(String fvp_name) {
		this.fvp_name = fvp_name;
	}

	/** 주민등록번호 값을 돌려준다. */
	public String getSs_number() {
		return ss_number;
	}

	/** 주민등록번호 값을 설정한다. */
	public void setSs_number(String ss_number) {
		this.ss_number = ss_number;
	}

	/** 접종자 메일 값을 돌려준다. */
	public String getFvp_mail() {
		return fvp_mail;
	}

	/** 접종자 메일 값을 설정한다. */
	public void setFvp_mail(String fvp_mail) {
		this.fvp_mail = fvp_mail;
	}

	/** 접종자 전화번호 값을 돌려준다. */
	public String getFvp_phone() {
		return fvp_phone;
	}

	/** 접종자 전화번호 값을 설정한다. */
	public void setFvp_phone(String fvp_phone) {
		this.fvp_phone = fvp_phone;
	}

	/** 접종자 등록일 값을 돌려준다. */
	public String getFvp_reg_date() {
		return fvp_reg_date;
	}

	/** 접종자 등록일 값을 설정한다. */
	public void setFvp_reg_date(String fvp_reg_date) {
		this.fvp_reg_date = fvp_reg_date;
	}

	/** 접종자 수정일 값을 돌려준다. */
	public String getFvp_mod_date() {
		return fvp_mod_date;
	}

	/** 접종자 수정일 값을 설정한다. */
	public void setFvp_mod_date(String fvp_mod_date) {
		this.fvp_mod_date = fvp_mod_date;
	}

	/** 접종 장소 번호 값을 돌려준다. */
	public String getFv_location_no() {
		return fv_location_no;
	}

	/** 접종 장소 번호 값을 설정한다. */
	public void setFv_location_no(String fv_location_no) {
		this.fv_location_no = fv_location_no;
	}

	/** 접종 장소 이름 값을 돌려준다. */
	public String getFv_location_name() {
		return fv_location_name;
	}

	/** 접종 장소 이름 값을 설정한다. */
	public void setFv_location_name(String fv_location_name) {
		this.fv_location_name = fv_location_name;
	}

	/** 접종 장소 주소 값을 돌려준다. */
	public String getFv_location_addr() {
		return fv_location_addr;
	}

	/** 접종 장소 주소 값을 설정한다. */
	public void setFv_location_addr(String fv_location_addr) {
		this.fv_location_addr = fv_location_addr;
	}

	/** 접종 장소 전화번호 값을 돌려준다. */
	public String getFv_location_phone() {
		return fv_location_phone;
	}

	/** 접종 장소 전화번호 값을 설정한다. */
	public void setFv_location_phone(String fv_location_phone) {
		this.fv_location_phone = fv_location_phone;
	}

	/** 접종 장소 담당자 값을 돌려준다. */
	public String getFv_location_manager() {
		return fv_location_manager;
	}

	/** 접종 장소 담당자 값을 설정한다. */
	public void setFv_location_manager(String fv_location_manager) {
		this.fv_location_manager = fv_location_manager;
	}

	/** 백신 종류 번호 값을 돌려준다. */
	public int getFv_type_no() {
		return fv_type_no;
	}

	/** 백신 종류 번호 값을 설정한다. */
	public void setFv_type_no(int fv_type_no) {
		this.fv_type_no = fv_type_no;
	}

	/** 백신 종류 값을 돌려준다. */
	public String getFv_type() {
		return fv_type;
	}

	/** 백신 종류 값을 설정한다. */
	public void setFv_type(String fv_type) {
		this.fv_type = fv_type;
	}

	/** 백신 제조 국가 값을 돌려준다. */
	public String getFv_type_manuf_country() {
		return fv_type_manuf_country;
	}

	/** 백신 제조 국가 값을 설정한다. */
	public void setFv_type_manuf_country(String fv_type_manuf_country) {
		this.fv_type_manuf_country = fv_type_manuf_country;
	}

	/** 백신 제조일 값을 돌려준다. */
	public String getFv_type_manuf_date() {
		return fv_type_manuf_date;
	}

	/** 백신 제조일 값을 설정한다. */
	public void setFv_type_manuf_date(String fv_type_manuf_date) {
		this.fv_type_manuf_date = fv_type_manuf_date;
	}
	
	
	

}
