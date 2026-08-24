package com.office.ex;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("*.vc")
public class VaccineController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	private String CLASS_NAME = "[VaccineController] ";
	
    public VaccineController() {
        super();
    }


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
			
			break;
		}
		
		RequestDispatcher dispatcher = request.getRequestDispatcher(nextPage);
		dispatcher.forward(request, response);
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		doGet(request, response);
	}
	
	private String generateView(String viewName) {

		return VaccineConfig.VIEW_PREFIX
				.concat(viewName)
				.concat(VaccineConfig.VIEW_SUFFIX);
		
	}
	
	
}