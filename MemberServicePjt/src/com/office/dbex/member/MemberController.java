package com.office.dbex.member;

import java.util.Scanner;

import com.office.dbex.IConfig;
import com.office.dbex.session.SessionClass;

public class MemberController implements IMember, IConfig {
	
	public void execute() {
	
		Scanner scanner = new Scanner(System.in);
		boolean systemFlag = true;
		MemberService memberService = new MemberService(new MemberDao());

		while (systemFlag) {
			
			if (SessionClass.getInstance().getSignInedMemId() == null) {
				System.out.println("1.SIGN_UP  2.SIGN_IN  99.SYSTEM_OUT");
				
			} else {
				System.out.println("3.MODIFY  4.DELETE  5.Sign_Out  99.SYSTEM_OUT");
			}
		
			int userSelectedMenuNumber = scanner.nextInt();
			scanner.nextLine();
			
			String memId = null;
			String memPw = null;
			String memMail = null;
			String memPhone = null;
			
			switch (userSelectedMenuNumber) {
			case MEMBER_SIGN_UP:
				
				System.out.println("Please input new member ID");
				memId = scanner.nextLine();
				
				System.out.println("Please input new member PW");
				memPw = scanner.nextLine();
				
				System.out.println("Please input new member MAIL");
				memMail = scanner.nextLine();
				
				System.out.println("Please input new member PHONE");
				memPhone = scanner.nextLine();
				
				MemberDto memberDtoForSignUp = new MemberDto(memId, memPw, memMail, memPhone);
				
				int resultForSignUp = memberService.doSignUp(memberDtoForSignUp);	// 0:fail, 1:success
				
				if (resultForSignUp > MEMBER_SIGN_UP_FAIL) {
					System.out.println("[MemberController] NEW MEMBER SIGN_UP SUCCESS");
				
				} else {
					System.out.println("[MemberController] NEW MEMBER SIGN_UP FAIL");
					
				}
				
				break;

			case MEMBER_SIGN_IN:
				
				System.out.println("Please input member ID");
				memId = scanner.nextLine();
				
				System.out.println("Please input member PW");
				memPw = scanner.nextLine();
				
				MemberDto memberDtoForSignIn = new MemberDto(memId, memPw);
				
				boolean resultForSignIn = memberService.doSignIn(memberDtoForSignIn);
				
				if (resultForSignIn) {
					System.out.println("[MemberController] MEMBER SIGN_IN SUCCESS");
				
					SessionClass session = SessionClass.getInstance();
					session.setSignInedMemId(memId);
					
				} else {
					System.out.println("[MemberService] MEMBER SIGN_IN FAIL");
					
					SessionClass session = SessionClass.getInstance();
					session.setSignInedMemId(null);
					
				}
				
				break;
				
			case MEMBER_MODIFY:
				
				System.out.println("Please input new member PW");
				memPw = scanner.nextLine();
				
				System.out.println("Please input new member MAIL");
				memMail = scanner.nextLine();
				
				System.out.println("Please input new member PHONE");
				memPhone = scanner.nextLine();
				
				MemberDto memberDtoForModify = new MemberDto(memId, memPw, memMail, memPhone);
				
				int resultForModify = memberService.doModify(memberDtoForModify);	// 0:fail, 1:success
				
				if (resultForModify > 0) {
					System.out.println("[MemberController] NEW MEMBER MODIFY SUCCESS");
				
				} else {
					System.out.println("[MemberController] NEW MEMBER MODIFY FAIL");
					
				}
				
				break;
				
			case MEMBER_DELETE:
				
				int resultForRemove = memberService.doRemove();
				
				if (resultForRemove > 0) {
					System.out.println("[MemberController] NEW MEMBER DELETE SUCCESS");
					
					SessionClass.getInstance().setSignInedMemId(null);
				
				} else {
					System.out.println("[MemberController] NEW MEMBER DELETE FAIL");
					
				}
				
				break;
				
			case MEMBER_SIGN_OUT:
				
					SessionClass.getInstance().setSignInedMemId(null);
				
				break;
				
			case SYSTEM_OUT:
				systemFlag = false;
				System.out.println("Say GoodBye");
				
				break;
			
			}
			
		}
		
		scanner.close();
		
	}

}
