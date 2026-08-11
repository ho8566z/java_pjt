package com.office.dw;

import java.util.Scanner;

public class MemberController {
	
	final int MEMBER_SIGN_UP 		= 1;
	final int MEMBER_SIGN_IN 		= 2;
	final int MEMBER_MODIFY 		= 3;
	final int MEMBER_DELETE 		= 4;
	final int MEMBER_SYSTEM_OUT 	= 99;
	
	
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
			System.out.println("1.SIGIN_UP  2.SIGN_IN  3.MODIFY  4.DELETE  99.SYSTEM_OUT");
			
			int userSelectedMenuNumber = scanner.nextInt();
			scanner.nextLine();
			
			switch (userSelectedMenuNumber) {
			case MEMBER_SIGN_UP:			// SIGIN_UP
				
				System.out.println("Please Input new Member ID");
				memId = scanner.nextLine();
				
				System.out.println("Please Input new Member PW");
				memPw = scanner.nextLine();
				
				System.out.println("Please Input new Member Mail");
				memMail = scanner.nextLine();
				
				System.out.println("Please Input new Member Phone");
				memPhone = scanner.nextLine();
				
//				memberService = new MemberService();
				memberService.doSignUp(new MemberDto(memId, memPw, memMail, memPhone));
				
				break;
				
				
			case MEMBER_SIGN_IN:			// SIGN_IN
				System.out.println("Please Input Member ID");
				memId = scanner.nextLine();
				
				System.out.println("Please Input Member PW");
				memPw = scanner.nextLine();
				
//				memberService = new MemberService();
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
