package com.office.member;

import java.util.Scanner;

import com.office.member.MemberDto;
import com.office.member.MemberService;

/**
 * 콘솔 메뉴로 회원 가입, 로그인, 수정, 삭제를 선택해 실행하는 컨트롤러.
 */
public class MemberContoller {
	
	/**
	 * 메뉴를 반복해서 보여주고 입력 번호에 맞는 기능을 실행한다.
	 * 99 를 입력하면 종료한다.
	 */
	public void execute() {
		System.out.println("[MemberController] execute()");
		
		boolean systemFlag = true;
		
		String memId;
		String memPw;
		String memMail;
		
		MemberDto memberDto = null;
		MemberService memberService = new MemberService();
		
		Scanner scanner = new Scanner(System.in);
		
		while (systemFlag) {
			System.out.println("1.Sign-Up   2.Sign-In   3.Modify   4.Delete   99.System-Out");
			System.out.println("Please MENU NUMBER");
			
			int selectedMenuNumber = scanner.nextInt();
			scanner.nextLine();
			
			
			switch (selectedMenuNumber) {
			case 1:			// Sign-Up
				System.out.println("Please new member ID");
				memId = scanner.nextLine();
				
				System.out.println("Please new member PW");
				memPw = scanner.nextLine();
				
				System.out.println("Please new member Mail");
				memMail = scanner.nextLine();
				
				memberDto = new MemberDto(memId, memPw, memMail);
				
//				memberService = new MemberService();
				memberService.doSignUp(memberDto);
				
				break;
				
			case 2:			// Sign-In
				System.out.println("Please member ID");
				memId = scanner.nextLine();
				
				System.out.println("Please member PW");
				memPw = scanner.nextLine();
			
				memberDto = new MemberDto(memId, memPw, null);
				
//				memberService = new MemberService();
				memberService.doSignIn(memberDto);
				
				break;
				
			case 3:			// Modify
				System.out.println("Please modify member ID");
				memId = scanner.nextLine();
				
				System.out.println("Please modify member PW");
				memPw = scanner.nextLine();
				
				System.out.println("Please modify member Mail");
				memMail = scanner.nextLine();
				
				memberDto = new MemberDto(null, memPw, memMail);
				
				memberService.doModify(memberDto);
				
				break;
		
			case 4:			// Delete
				System.out.println("Please delete member ID");
				memId = scanner.nextLine();
				
				System.out.println("Please delete member PW");
				memPw = scanner.nextLine();
			
				memberDto = new MemberDto(memId, memPw, null);
				
				memberService.doDelete(memberDto);
				
				break;
		
			case 99:		// System-Out
				systemFlag = false;
				System.out.println("Goob Bye.");
				
				break;
			}
		}
		
		scanner.close();
		
	}

}
