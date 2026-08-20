package com.office.member;

import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("*.dw")
public class MemberController extends HttpServlet {
	private static final long serialVersionUID = 1L;

    
    public MemberController() {
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String requestURI = request.getRequestURI();
		System.out.println("requestURI : " + requestURI );
		// requestURI : /MemberPjt/member_signup_confirm.dw
		
		String contextPath = request.getContextPath();
		System.out.println("contextPath : " + contextPath);
		// contextPath : /MemberPjt
		
		String command = requestURI.substring(contextPath.length());
		System.out.println("command : " + command);
		// command : /member_signup_confirm.dw
		
		MemberService memberService = null;
		
		if (command.equals("/member_signup_confirm.dw")) {
			System.out.println("Sign UP");
			
			memberService = new MemberService();
			int result = memberService.memberRegistConfirm(request, response);
			
		} else if (command.equals("/member_signin_confirm.dw")) {
			System.out.println("Sign IN");
		}
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		doGet(request, response);
	}

}
