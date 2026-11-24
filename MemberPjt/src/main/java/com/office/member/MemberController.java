package com.office.member;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("*.dw")
/**
 * 회원 관련 요청(*.dw)을 받아 서비스로 넘기고 결과 화면으로 이동시키는 서블릿.
 */
public class MemberController extends HttpServlet {
	private static final long serialVersionUID = 1L;

    
    public MemberController() {
        
    }

	
	/**
	 * 요청 주소에서 명령(command)을 뽑아 해당 서비스를 실행하고, 결과에 맞는 JSP 로 포워딩한다.
	 */
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
		String nextPage = null;
		
		if (command.equals("/member_signup_confirm.dw")) {
			System.out.println("Sign UP");
			
			memberService = new MemberService();
			int result = memberService.memberRegistConfirm(request, response);
			
			if (result > 0) {
				System.out.println("[MemberController] NEW MEMBER SIGNUP SUCCESS");
				nextPage = "views/member_signup_ok.jsp";
				
			} else {
				System.out.println("[MemberController] NEW MEMBER SIGNUP FAIL");
				nextPage = "views/member_signup_ng.jsp";
			}
			
		} else if (command.equals("/member_signin_confirm.dw")) {
			System.out.println("Sign IN");
		}
		
		RequestDispatcher dispatcher = request.getRequestDispatcher(nextPage);
		dispatcher.forward(request, response);
		
	}

	
	/**
	 * 한글이 깨지지 않도록 인코딩을 utf-8 로 지정한 뒤 doGet 으로 처리를 넘긴다.
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		doGet(request, response);
	}

}
