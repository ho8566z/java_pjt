package com.office.dbex.member;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class MemberDao implements IMemberDao {
	
	@Override
	public int insertNewMember(MemberDto memberDto) {
		System.out.println("[MemberDao] insertNewMember()");
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		int result = -1;
		
		
		try {
			// 1.Connect 객체 생성(App과 DB서버 연결, 다리를 만드는)
			conn = DriverManager.getConnection(URL, USER, PASSWORD);
		
			// 2.작업 명세서(SQL)
			/*
			String sql = "INSERT INTO TBL_MEMBER(memId, memPw, memMail, memPhone) "
						+ "VALUES(" + memberDto.getMemId() + 
						", " + memberDto.getMemPw() + 
						", " + memberDto.getMemMail() + 
						", " + memberDto.getMemPhone() + ")";
			*/
			String sql = "INSERT INTO TBL_MEMBER(memId, memPw, memMail, memPhone) "
						+ "VALUES(?,?,?,?)";
			
			// 3.일꾼
			pstmt = conn.prepareCall(sql);
			
			// 4.데이터 주입
			pstmt.setString(1, memberDto.getMemId());
			pstmt.setString(2, memberDto.getMemPw());
			pstmt.setString(3, memberDto.getMemMail());
			pstmt.setString(4, memberDto.getMemPhone());
			
			// 5.작업 지시(run or execute)
			result = pstmt.executeUpdate();		// 0 또는 1
			
		} catch (SQLException e) {
			e.printStackTrace();
			
		} finally {
			
			// 6.외부자원 해제
			try {
				if (pstmt != null) pstmt.close();	// null point error
				if (conn != null) conn.close();
				
			} catch (SQLException e) {
				e.printStackTrace();
				
			}
		}
		
		return result;
	}

	
	@Override
	public MemberDto selectMemberByMemId(String memberId) {
		System.out.println("[MemberDao] selectMemberByMemId()");
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		ArrayList<MemberDto> dtos = new ArrayList<MemberDto>();
		
		
		try {
			// 1.Connect 객체 생성(App과 DB서버 연결, 다리를 만드는)
			conn = DriverManager.getConnection(URL, USER, PASSWORD);
		
			// 2.작업 명세서(SQL)
			String sql = "SELECT "
						+ 	"* "
						+ "FROM "
						+ 	"TBL_MEMBER "
						+ "WHERE "
						+ 	"memId = ?";
			
			// 3.일꾼
			pstmt = conn.prepareCall(sql);
			
			// 4.데이터 주입
			pstmt.setString(1, memberId);
			
			// 5.작업 지시(run or execute)
			rs = pstmt.executeQuery();
			// ResultSet 사진과 같이 설명 붙이기
			
			while (rs.next()) {		// ResultSet => DTO Mapping : RowMapper
				int memNo = rs.getInt("memNo");
				String memId = rs.getString("memId");
				String memPw = rs.getString("memPw");
				String memMail = rs.getString("memMail");
				String memPhone = rs.getString("memPhone");
				String memRegDate = rs.getString("memRegDate");
				String memModDate = rs.getString("memModDate");
				
				MemberDto dto = new MemberDto(memNo, memId, memPw, memMail, memPhone, memRegDate, memModDate);
				
				dtos.add(dto);
				
			}
			
			
		} catch (SQLException e) {
			e.printStackTrace();
			
		} finally {
			
			// 6.외부자원 해제
			try {
				if (rs != null) rs.close();
				if (pstmt != null) pstmt.close();
				if (conn != null) conn.close();
				
			} catch (SQLException e) {
				e.printStackTrace();
				
			}
		}
		
		return dtos.size() > 0 ? dtos.get(0) : null;
	}


	@Override
	public int updateMembere(MemberDto memberDto) {
		System.out.println("[MemberDao] updateMembere()");
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		int result = -1;
		
		
		try {
			// 1.Connect 객체 생성(App과 DB서버 연결, 다리를 만드는)
			conn = DriverManager.getConnection(URL, USER, PASSWORD);
		
			// 2.작업 명세서(SQL)
			String sql = "UPDATE "
							+ "TBL_MEMBER "
						+ "SET "
							+ "memPw = ?,"
							+ "memMail = ?,"
							+ "memPhone =? "
						+ "WHERE "
							+ "memId = ?";
			
			// 3.일꾼
			pstmt = conn.prepareStatement(sql);
			
			// 4.데이터 주입
			pstmt.setString(1, memberDto.getMemPw());
			pstmt.setString(2, memberDto.getMemMail());
			pstmt.setString(3, memberDto.getMemPhone());
			pstmt.setString(4, memberDto.getMemId());
			
			
			// 5.작업 지시(run or execute)
			result = pstmt.executeUpdate();		// 0 또는 1
			
		} catch (SQLException e) {
			e.printStackTrace();
			
		} finally {
			
			// 6.외부자원 해제
			try {
				if (pstmt != null) pstmt.close();
				if (conn != null) conn.close();
				
			} catch (SQLException e) {
				e.printStackTrace();
				
			}
		}
		
		return result;
		
	}


	@Override
	public int deleteMemberByMemId(String memId) {
		System.out.println("[MemberDao] deleteMemberByMemId");

		Connection conn = null;
		PreparedStatement pstmt = null;
		int result = -1;
		
		
		try {
			// 1.Connect 객체 생성(App과 DB서버 연결, 다리를 만드는)
			conn = DriverManager.getConnection(URL, USER, PASSWORD);
		
			// 2.작업 명세서(SQL)
			String sql = "DELETE FROM "
							+ "TBL_MEMBER "
						+ "WHERE "
							+ "memId = ?";
			
			// 3.일꾼
			pstmt = conn.prepareStatement(sql);
			
			// 4.데이터 주입
			pstmt.setString(1, memId);
			
			// 5.작업 지시(run or execute)
			result = pstmt.executeUpdate();		// 0 또는 1
			
		} catch (SQLException e) {
			e.printStackTrace();
			
		} finally {
			
			// 6.외부자원 해제
			try {
				if (pstmt != null) pstmt.close();
				if (conn != null) conn.close();
				
			} catch (SQLException e) {
				e.printStackTrace();
				
			}
		}
		
		return result;
		
	}
	
	

}
