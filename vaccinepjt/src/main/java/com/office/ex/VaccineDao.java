package com.office.ex;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class VaccineDao implements IVaccineDao {

	final private String CLASS_NAME = "[VaccineDao] ";
	
	@Override
	public int insertVaccineInjection(VaccineDto vaccineDto) {
		System.out.println(CLASS_NAME.concat("insertVaccineInjection()"));
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		int result = -1;
		
		try {
			Class.forName(DRIVER);
			conn = DriverManager.getConnection(URL, USER, PASSWORD);
			String sql = "INSERT INTO tbl_flu_vaccin_person("
							+ "fvp_name, "
							+ "ss_number, "
							+ "fvp_mail, "
							+ "fvp_phone, "
							+ "fv_location_no, "
							+ "fv_type) "
						+ "VALUES(?, ?, ?, ?, ?, ?)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, vaccineDto.getFvp_name());
			pstmt.setString(2, vaccineDto.getSs_number());
			pstmt.setString(3, vaccineDto.getFvp_mail());
			pstmt.setString(4, vaccineDto.getFvp_phone());
			pstmt.setString(5, vaccineDto.getFv_location_no());
			pstmt.setString(6, vaccineDto.getFv_type());
			result = pstmt.executeUpdate();
					
		} catch (Exception e) {
			e.printStackTrace();
			
		} finally {
			try {
				if (pstmt != null) pstmt.close();
				if (conn != null) conn.close();
				
			} catch (Exception e2) {
				e2.printStackTrace();
				
			}
			
		}
		
		return result;
		
	}

	public List<VaccineDto> selectVaccineInjections() {
		System.out.println(CLASS_NAME.concat("selectVaccineInjections()"));
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		List<VaccineDto> vaccineDtos = new ArrayList<VaccineDto>();
		
		try {
			Class.forName(DRIVER);
			conn = DriverManager.getConnection(URL, USER, PASSWORD);
			String sql =  "SELECT "
							+ "* "
						+ "FROM tbl_flu_vaccin_person fp "
							+ "JOIN tbl_fv_location fl "
								+ "ON fp.fv_location_no = fl.fv_location_no "
							+ "JOIN tbl_fv_type ft "
									+ "on fp.fv_type = ft.fv_type";
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				
				VaccineDto vaccineDto = new VaccineDto();
				
				// tbl_flu_vaccin_person
				vaccineDto.setFvp_no(rs.getInt("fvp_no"));
				vaccineDto.setFvp_name(rs.getString("fvp_name"));
				vaccineDto.setSs_number(rs.getString("ss_number"));
				vaccineDto.setFvp_mail(rs.getString("fvp_mail"));
				vaccineDto.setFvp_phone(rs.getString("fvp_phone"));
				vaccineDto.setFvp_reg_date(rs.getString("fvp_reg_date"));
				vaccineDto.setFvp_mod_date(rs.getString("fvp_mod_date"));
				
				// tbl_fv_location
				vaccineDto.setFv_location_no(rs.getString("fv_location_no"));
				vaccineDto.setFv_location_name(rs.getString("fv_location_name"));
				vaccineDto.setFv_location_addr(rs.getString("fv_location_addr"));
				vaccineDto.setFv_location_phone(rs.getString("fv_location_phone"));
				vaccineDto.setFv_location_manager(rs.getString("fv_location_manager"));
				
				// fv_type
				vaccineDto.setFv_type_no(rs.getInt("fv_type_no"));
				vaccineDto.setFv_type(rs.getString("fv_type"));
				vaccineDto.setFv_type_manuf_country(rs.getString("fv_type_manuf_country"));
				vaccineDto.setFv_type_manuf_date(rs.getString("fv_type_manuf_date"));
				
				vaccineDtos.add(vaccineDto);
				
			}
			
		} catch (Exception e) {
			e.printStackTrace();
			
		} finally {
			
			try {
				if (rs != null) rs.close();
				if (pstmt != null) pstmt.close();
				if (conn != null) conn.close();
				
			} catch (Exception e2) {
				e2.printStackTrace();
				
			}
			
		}
		 
		return vaccineDtos;
		
	}

	
	public int deleteVaccineInjectionByFvpNo(int fvp_no) {
		System.out.println(CLASS_NAME.concat("deleteVaccineInjectionByFvpNo()"));
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		int result = -1;
		
		try {
			Class.forName(DRIVER);
			conn = DriverManager.getConnection(URL, USER, PASSWORD);
			String sql = "DELETE FROM "
							+ "tbl_flu_vaccin_person "
						+ "WHERE "
							+ "fvp_no = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, fvp_no);
			result = pstmt.executeUpdate();
					
		} catch (Exception e) {
			e.printStackTrace();
			
		} finally {
			try {
				if (pstmt != null) pstmt.close();
				if (conn != null) conn.close();
				
			} catch (Exception e2) {
				e2.printStackTrace();
				
			}
			
		}
		
		return result;
	}

}
