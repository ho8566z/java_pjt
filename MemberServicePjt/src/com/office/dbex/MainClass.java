package com.office.dbex;

import com.office.dbex.member.MemberController;

/**
 * 회원 서비스의 시작점. MemberController 를 만들어 실행한다.
 * 아래 주석 처리된 코드는 MySQL 접속을 시험하던 예제이다.
 */
public class MainClass {
	
	public static void main(String[] args) {
		
		new MemberController().execute();
		
		/*
		//MySQL Connect Test <- 정리할것
		String url = "jdbc:mysql://localhost:3306/db_member";
		String user = "root";
		String password = "1234";
		
		Connection conn = null;
		
		try {
			conn = DriverManager.getConnection(url, user, password);
			// unhandled : java에서 mysql에 대해 connection이 100% 이루어지지 않기 때문에 '예외처리'해야 한다.
			
			// conn =? !null || null
			
			System.out.println("Connection SUCCESS");
			
		} catch (Exception e) {
			System.out.println("Connection FAIL");
			
			e.printStackTrace();
		
		} finally {
			try {
				if(conn != null) conn.close();
				
				System.out.println("conn close");
				
			} catch (Exception e2) {
				e2.printStackTrace();
				
			}
			
		}
		*/

		
	}

}
