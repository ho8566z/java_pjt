package mempjtcom.office.ex;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("*.mem")
public class MemberController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	
    public MemberController() {
    	super();
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		StringBuffer stringBuffer = request.getRequestURL();
		System.out.println("stringBuffer : " + stringBuffer.toString());
		// stringBuffer : http://localhost:8090/mempjt/member_signup_form.mem
		
		String requestURI = request.getRequestURI();
		System.out.println("requestURI : " + requestURI);
		// requestURI : /mempjt/member_signup_form.mem
		
		String contextPath = request.getContextPath();
		System.out.println("contextPath : " + contextPath);
		// contextPath : /mempjt
		
		String command = requestURI.substring(contextPath.length());
		System.out.println("command : " + command);
		// command : /member_signup_form.mem
		
		String nextPage = null;
		MemberService memberService = null;
		
		switch (command) {
//		case "/member_signup_form.mem":
		case MemberConfig.MEMBER_SIGNUP_FORM:
			//sign-up_form
			
//			nextPage = MemberConfig.DEFAULT_VIEW_PATH + "/member_signup_form" + MemberConfig.DEFAULT_VIEW_SEFFIX;
			nextPage = generateViewName("/member_signup_form");
			
			break;
			
//		case "/member_signup_confirm.mem":
		case MemberConfig.MEMBER_SIGNUP_CONFIRM:
			//sign-up_confirm
			memberService = new MemberService(new MemberDao());
			int result = memberService.addNewMember(request, response);
			
			if (result > 0) {
				System.out.println("[MemberController] NEW MEMBER SIGNUP SUCCESS");
//				nextPage = MemberConfig.DEFAULT_VIEW_PATH + "/member_signup_ok" + MemberConfig.DEFAULT_VIEW_SEFFIX;
				nextPage = generateViewName("/member_signup_ok");
				
			} else {
				System.out.println("[MemberController] NEW MEMBER SIGNUP FAIL");
//				nextPage = MemberConfig.DEFAULT_VIEW_PATH + "/member_signup_ng" + MemberConfig.DEFAULT_VIEW_SEFFIX;
				nextPage = generateViewName("/member_signup_ng");
			}
			
			break;
			
		case MemberConfig.MEMBER_SIGNIN_FORM:
			
			// sign-in-form
			nextPage = generateViewName("/member_signin_form");
			
			break;
			
		case MemberConfig.MEMBER_SIGNIN_CONFIRM:
			
			// sign-in-confirm
			memberService = new MemberService(new MemberDao());
			String signinMemId = memberService.searchMember(request, response);
			
			if (signinMemId != null) {
				System.out.println("[MemberController] MEMBER SIGNIN SUCCESS");
				
				nextPage = generateViewName("/member_signin_ok");
				
				HttpSession session = request.getSession();
				session.setAttribute("signinedMemId", signinMemId);
				
				
			} else {
				System.out.println("[MemberController] MEMBER SIGNIN FAIL");
				
				nextPage = generateViewName("/member_signin_ng");
				
			}
			
			break;
		}
		
		RequestDispatcher dispatcher = request.getRequestDispatcher(nextPage);
		dispatcher.forward(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		doGet(request, response);
	}
	
	// 뷰 이름을 생성
	private String generateViewName(String viewName) {
		
//		return MemberConfig.DEFAULT_VIEW_PATH + viewName + MemberConfig.DEFAULT_VIEW_SEFFIX;
		return MemberConfig.DEFAULT_VIEW_PATH
				.concat(viewName)
				.concat(MemberConfig.DEFAULT_VIEW_SEFFIX);
		
	}

}
