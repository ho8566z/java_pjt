package com.office.member;

import java.util.Scanner;

import com.office.member.MemberDto;
import com.office.member.MemberService;

public class MemberContoller {
	
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
			System.out.println("1.Sign-Up   2.Sign-In   3.Modify   4.Delete   5.System-Out");
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
