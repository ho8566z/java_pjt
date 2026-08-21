package mempjtcom.office.ex;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class MemberDao implements IMemberDao {

	@Override
	public int insertNewMember(MemberDto memberDto) {
		System.out.println("[MemberDao] insertNewMember()");
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		int result = -1;
		
		try {
			// 1.드라이버 로딩 at 메모리
			Class.forName(DRIVER);
			
			// 2.다리 건설
			conn = DriverManager.getConnection(URL, USER, PASSWORD);
			
			// 3.작업명세서(SQL)
			String sql = "insert into tbl_member(memId, memPw, memMail, memPhone) "
					+ "VALUES(?, ?, ?, ?)";
			
			// 4.일꾼 섭외 == PreparedStatement
			pstmt = conn.prepareStatement(sql);
			
			// 5.일꾼에게 데이터 주입
			pstmt.setString(1, memberDto.getMemId());
			pstmt.setString(2, memberDto.getMemPw());
			pstmt.setString(3, memberDto.getMemMail());
			pstmt.setString(4, memberDto.getMemPhone());
			
			// 6.작업지시
			result = pstmt.executeUpdate();		// 생성된 행(row) 개수 반환
			
			
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

	
	@Override
	public MemberDto selectMemberByMemId(String id) {
		System.out.println("[MemberDao] selectMemberByMemId()");

		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		List<MemberDto> memberDtos = new ArrayList<MemberDto>();
		
		try {
			// 1.드라이버 로딩 at 메모리
			Class.forName(DRIVER);
			
			// 2.다리 건설
			conn = DriverManager.getConnection(URL, USER, PASSWORD);
			
			// 3.작업명세서(SQL)
			String sql = "SELECT * FROM TBL_MEMBER "
						+ "WHERE memId =?";
			
			// 4.일꾼 섭외 == PreparedStatement
			pstmt = conn.prepareStatement(sql);
			
			// 5.일꾼에게 데이터 주입
			pstmt.setString(1, id);
			
			// 6.작업지시
			rs = pstmt.executeQuery();		// 생성된 행(row) 개수 반환
			
			while (rs.next()) {
				
				int memNo = rs.getInt("memNo");
				String memId = rs.getString("memId");
				String memPw = rs.getString("memPw");
				String memMail = rs.getString("memMail");
				String memPhone = rs.getString("memPhone");
				String memRegDate = rs.getString("memRegDate");
				String memModDate = rs.getString("memModDate");
				
				MemberDto dto = 
						new MemberDto(memNo, 
								memId, 
								memPw, 
								memMail, 
								memPhone, 
								memRegDate, 
								memModDate);
				
				memberDtos.add(dto);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
			
		} finally {
			
			// 7.외부자원 해제
			try {
				if (rs != null) rs.close();
				if (pstmt != null) pstmt.close();
				if (conn != null) conn.close();
				
			} catch (Exception e2) {
				e2.printStackTrace();
				
			}
		}
		
		return memberDtos.size() > 0 ? memberDtos.get(0) : null;
	}

}
