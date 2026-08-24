package com.office.ex;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

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
							+ "fvp_location_no, "
							+ "fv_type) "
						+ "VALUES(?, ?, ?, ?, ?, ?)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, vaccineDto.getFvp_name());
			pstmt.setString(2, vaccineDto.getSs_number());
			pstmt.setString(3, vaccineDto.getFvp_mail());
			pstmt.setString(4, vaccineDto.getFvp_phone());
			pstmt.setString(5, vaccineDto.getFvp_location_no());
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

}
