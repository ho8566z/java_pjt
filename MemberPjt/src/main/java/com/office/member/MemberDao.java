package com.office.member;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class MemberDao {

	String url = "jdbc:mysql://127.0.0.1:3306/db_member";
	String user = "root";
	String password = "1234";
	
	public int insertNewMember(MemberDto memberDto) {
		System.out.println("[MemberDao] insertNewMember()");
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		int result = -1;
		
		try {
			
			// 0.드라이버 로딩 at 메모리
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			// 1.다리 건설
			conn = DriverManager.getConnection(url, user, password);
			
			// 2.작업 명세서(SQL)
			String sql = "INSERT INTO "
							+ "tbl_member("
								+ "memId, "
								+ "memPw, "
								+ "memMail, "
								+ "memPhone) "
						+ "VALUES(?, ?, ?, ?)";
			
			// 3.일꾼
			pstmt = conn.prepareStatement(sql);
			
			// 4.일꾼에게 데이터를 주입
			pstmt.setString(1, memberDto.getMemId());
			pstmt.setString(2, memberDto.getMemPw());
			pstmt.setString(3, memberDto.getMemMail());
			pstmt.setString(4, memberDto.getMemPhone());
			
			// 5.작업지시
			result = pstmt.executeUpdate();		// 생성된 행(row)의 개수를 반환
			
		} catch (Exception e) {
			e.printStackTrace();
		
		} finally {
			
			// 6.외부 자원 해제
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
