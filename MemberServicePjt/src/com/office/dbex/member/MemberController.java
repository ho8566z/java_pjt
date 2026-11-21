package com.office.dbex.member;

import java.util.Scanner;

import com.office.dbex.IConfig;
import com.office.dbex.session.SessionClass;

/**
 * 콘솔 메뉴로 회원가입·로그인·정보 수정·탈퇴·로그아웃을 처리하는 컨트롤러.
 * 로그인 상태(SessionClass)에 따라 보여 주는 메뉴가 달라진다.
 */
public class MemberController implements IMember, IConfig {
	
	/** 시스템 종료 번호(99)를 입력하기 전까지 메뉴를 반복하며, 고른 번호에 맞는 MemberService 기능을 호출한다. */
	public void execute() {
	
		Scanner scanner = new Scanner(System.in);
		boolean systemFlag = true;
		MemberService memberService = new MemberService(new MemberDao());

		while (systemFlag) {
			
			// 로그인 전에는 가입·로그인 메뉴, 로그인 후에는 수정·탈퇴·로그아웃 메뉴를 보여 준다
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
					System.out.println("[MemberController] MEMBER SIGN_IN FAIL");
					
					SessionClass session = SessionClass.getInstance();
					session.setSignInedMemId(null);
					
				}
				
				break;
				
			case MEMBER_MODIFY:
				// 수정 대상은 로그인한 회원이다. 아이디는 입력받지 않고 MemberService 가 세션의 아이디로 채운다
				
				System.out.println("Please input new member PW");
				memPw = scanner.nextLine();
				
				System.out.println("Please input new member MAIL");
				memMail = scanner.nextLine();
				
				System.out.println("Please input new member PHONE");
				memPhone = scanner.nextLine();
				
				MemberDto memberDtoForModify = new MemberDto(memId, memPw, memMail, memPhone);
				
				int resultForModify = memberService.doModify(memberDtoForModify);	// 0:fail, 1:success
				
				if (resultForModify > 0) {
					System.out.println("[MemberController] MEMBER MODIFY SUCCESS");
				
				} else {
					System.out.println("[MemberController] MEMBER MODIFY FAIL");
					
				}
				
				break;
				
			case MEMBER_DELETE:
				
				int resultForRemove = memberService.doRemove();
				
				if (resultForRemove > 0) {
					System.out.println("[MemberController] MEMBER DELETE SUCCESS");
					
					SessionClass.getInstance().setSignInedMemId(null);
				
				} else {
					System.out.println("[MemberController] MEMBER DELETE FAIL");
					
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
