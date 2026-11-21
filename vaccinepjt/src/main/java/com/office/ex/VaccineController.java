package com.office.ex;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * *.vc 요청을 받아 명령에 맞는 VaccineService 를 호출하고 화면으로 이동시키는 서블릿.
 */
@WebServlet("*.vc")
public class VaccineController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	private String CLASS_NAME = "[VaccineController] ";
	
    public VaccineController() {
        super();
    }


	/**
	 * 요청 주소에서 컨텍스트 경로를 뺀 명령(command)으로 등록 폼·등록 확인·목록·삭제 중 처리할 기능을 고른다.
	 * 결과 화면으로는 forward 하고, 삭제는 처리 뒤 목록 주소로 redirect 한다.
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String requestURI = request.getRequestURI();
		String contextPath = request.getContextPath();
		String command = requestURI.substring(contextPath.length());
		String nextPage = null;
		VaccineService vaccineService = null;

		
		switch (command) {
		case VaccineConfig.VACCINE_RESISTER_FORM:
			System.out.println(CLASS_NAME.concat(VaccineConfig.VACCINE_RESISTER_FORM));
			
			nextPage = generateView("vaccine_register_form");
			
			break;
			
		case VaccineConfig.VACCINE_RESISTER_CONFIRM:
			System.out.println(CLASS_NAME.concat(VaccineConfig.VACCINE_RESISTER_CONFIRM));
			
			vaccineService = new VaccineService();
			int resultForRegiste = vaccineService.registeVaccineInjection(request, response);
			
			if (resultForRegiste > 0) {
				System.out.println(CLASS_NAME.concat("VACCINE INJECTION SUCCESS!!"));
				nextPage = generateView("vaccine_register_ok");
				
			} else {
				System.out.println(CLASS_NAME.concat("VACCINE INJECTION FAIL!!"));
				nextPage = generateView("vaccine_register_ng");
			}
			
			break;
			
		case VaccineConfig.VACCINE_LIST:
			System.out.println(CLASS_NAME.concat(VaccineConfig.VACCINE_LIST));
			
			vaccineService = new VaccineService();
			vaccineService.getVaccineInjections(request, response);

			nextPage = generateView("vaccine_records");
			
			break;
			
		case VaccineConfig.VACCINE_DELETE:
			System.out.println(CLASS_NAME.concat(VaccineConfig.VACCINE_DELETE));
			
			vaccineService = new VaccineService();
			int resultForDelete = vaccineService.removeVaccineInjectionByFvpNo(request, response);
			
			if (resultForDelete > 0) {
				System.out.println(CLASS_NAME.concat("VACCINE INJECTION DELETE SUCCESS"));
			} else {
				System.out.println(CLASS_NAME.concat("VACCINE INJECTION DELETE FAIL"));
			}
			
			// 삭제 후 목록으로 리다이렉트
			response.sendRedirect(request.getContextPath().concat(VaccineConfig.VACCINE_LIST));
			
			return;

		}
		
		RequestDispatcher dispatcher = request.getRequestDispatcher(nextPage);
		dispatcher.forward(request, response);
		
	}


	/** POST 로 온 한글 입력이 깨지지 않도록 UTF-8 로 설정한 뒤 doGet 과 같은 방식으로 처리한다. */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		doGet(request, response);
	}
	
	/** 뷰 이름 앞뒤에 VIEW_PREFIX(views/), VIEW_SUFFIX(.jsp)를 붙여 화면 파일 경로를 만든다. */
	private String generateView(String viewName) {

		return VaccineConfig.VIEW_PREFIX
				.concat(viewName)
				.concat(VaccineConfig.VIEW_SUFFIX);
		
	}

}
