package com.office.ex;

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

	public int getFvp_no() {
		return fvp_no;
	}

	public void setFvp_no(int fvp_no) {
		this.fvp_no = fvp_no;
	}

	public String getFvp_name() {
		return fvp_name;
	}

	public void setFvp_name(String fvp_name) {
		this.fvp_name = fvp_name;
	}

	public String getSs_number() {
		return ss_number;
	}

	public void setSs_number(String ss_number) {
		this.ss_number = ss_number;
	}

	public String getFvp_mail() {
		return fvp_mail;
	}

	public void setFvp_mail(String fvp_mail) {
		this.fvp_mail = fvp_mail;
	}

	public String getFvp_phone() {
		return fvp_phone;
	}

	public void setFvp_phone(String fvp_phone) {
		this.fvp_phone = fvp_phone;
	}

	public String getFvp_reg_date() {
		return fvp_reg_date;
	}

	public void setFvp_reg_date(String fvp_reg_date) {
		this.fvp_reg_date = fvp_reg_date;
	}

	public String getFvp_mod_date() {
		return fvp_mod_date;
	}

	public void setFvp_mod_date(String fvp_mod_date) {
		this.fvp_mod_date = fvp_mod_date;
	}

	public String getFv_location_no() {
		return fv_location_no;
	}

	public void setFv_location_no(String fv_location_no) {
		this.fv_location_no = fv_location_no;
	}

	public String getFv_location_name() {
		return fv_location_name;
	}

	public void setFv_location_name(String fv_location_name) {
		this.fv_location_name = fv_location_name;
	}

	public String getFv_location_addr() {
		return fv_location_addr;
	}

	public void setFv_location_addr(String fv_location_addr) {
		this.fv_location_addr = fv_location_addr;
	}

	public String getFv_location_phone() {
		return fv_location_phone;
	}

	public void setFv_location_phone(String fv_location_phone) {
		this.fv_location_phone = fv_location_phone;
	}

	public String getFv_location_manager() {
		return fv_location_manager;
	}

	public void setFv_location_manager(String fv_location_manager) {
		this.fv_location_manager = fv_location_manager;
	}

	public int getFv_type_no() {
		return fv_type_no;
	}

	public void setFv_type_no(int fv_type_no) {
		this.fv_type_no = fv_type_no;
	}

	public String getFv_type() {
		return fv_type;
	}

	public void setFv_type(String fv_type) {
		this.fv_type = fv_type;
	}

	public String getFv_type_manuf_country() {
		return fv_type_manuf_country;
	}

	public void setFv_type_manuf_country(String fv_type_manuf_country) {
		this.fv_type_manuf_country = fv_type_manuf_country;
	}

	public String getFv_type_manuf_date() {
		return fv_type_manuf_date;
	}

	public void setFv_type_manuf_date(String fv_type_manuf_date) {
		this.fv_type_manuf_date = fv_type_manuf_date;
	}
	
	
	

}
