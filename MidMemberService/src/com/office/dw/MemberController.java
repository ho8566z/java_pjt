package com.office.dw;

import java.util.Scanner;

/**
 * 콘솔 메뉴로 회원 가입·로그인·수정·삭제를 입력받아 MemberService 에 전달하는 컨트롤러.
 */
public class MemberController {
	
	final int MEMBER_SIGN_UP 		= 1;
	final int MEMBER_SIGN_IN 		= 2;
	final int MEMBER_MODIFY 		= 3;
	final int MEMBER_DELETE 		= 4;
	final int MEMBER_SYSTEM_OUT 	= 99;
	
	
	/**
	 * 99(SYSTEM_OUT)를 입력할 때까지 메뉴를 반복해서 보여주고 선택에 맞는 기능을 실행한다.
	 */
	public void execute() {
		System.out.println("[MemberController] execute()");
		
		Scanner scanner = new Scanner(System.in);
		
		boolean systemFlag = true;
		
		String memId = null;
		String memPw = null;
		String memMail = null;
		String memPhone = null;
		
		MemberService memberService = new MemberService();
		
		while (systemFlag) {
			System.out.println("1.SIGN_UP  2.SIGN_IN  3.MODIFY  4.DELETE  99.SYSTEM_OUT");
			
			int userSelectedMenuNumber = scanner.nextInt();
			scanner.nextLine();
			
			switch (userSelectedMenuNumber) {
			case MEMBER_SIGN_UP:			// SIGN_UP
				
				System.out.println("Please Input new Member ID");
				memId = scanner.nextLine();
				
				System.out.println("Please Input new Member PW");
				memPw = scanner.nextLine();
				
				System.out.println("Please Input new Member Mail");
				memMail = scanner.nextLine();
				
				System.out.println("Please Input new Member Phone");
				memPhone = scanner.nextLine();
				
				memberService.doSignUp(new MemberDto(memId, memPw, memMail, memPhone));
				
				break;
				
				
			case MEMBER_SIGN_IN:			// SIGN_IN
				System.out.println("Please Input Member ID");
				memId = scanner.nextLine();
				
				System.out.println("Please Input Member PW");
				memPw = scanner.nextLine();
				
				memberService.doSignIn(new MemberDto(memId, memPw, null, null));
				
				break;
				
				
			case MEMBER_MODIFY:			// MODIFY
				
				// 1. 사용자가 ID, PW, Mail, Phone를 입력한다.
				// 2. 그럼, ID, PW를 가지고 인증한다.
				// 3. 인증이 되면, Mail, Phone 정보를 업데이트한다.
				
				System.out.println("Please Input Member ID");
				memId = scanner.nextLine();
				
				System.out.println("Please Input Member PW");
				memPw = scanner.nextLine();
				
				System.out.println("Please Input Member Mail");
				memMail = scanner.nextLine();
				
				System.out.println("Please Input Member Phone");
				memPhone = scanner.nextLine();
				
				memberService.modify(new MemberDto(memId, memPw, memMail, memPhone));
				
				break;
				
				
			case MEMBER_DELETE:			// DELETE
				
				// 1. 사용자가 ID, PW, Mail, Phone를 입력한다.
				// 2. 그럼, ID, PW를 가지고 인증한다.
				// 3. 인증이 되면, 삭제한다.
				
				System.out.println("Please Input Member ID");
				memId = scanner.nextLine();
				
				System.out.println("Please Input Member PW");
				memPw = scanner.nextLine();
				
				memberService.delete(new MemberDto(memId, memPw, null, null));
				
				break;
				
				
			case MEMBER_SYSTEM_OUT:		// SYSTEM_OUT
				systemFlag = false;
				System.out.println("SYSTEM_OUT");
				
				break;
			}
			
		}
		
		scanner.close();
		
	}

}
