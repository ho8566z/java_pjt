package com.office.ex;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class VaccineService {

	final private String CLASS_NAME = "[VaccineService] ";
	
	private VaccineDao vaccineDao = new VaccineDao();
	
	public int registeVaccineInjection(HttpServletRequest request, HttpServletResponse response) {
		System.out.println(CLASS_NAME.concat("registeVaccineInjection()"));
		
		String fvp_name = request.getParameter("fvp_name");
		String ss_number = request.getParameter("ss_number");
		String fvp_mail = request.getParameter("fvp_mail");
		String fvp_phone = request.getParameter("fvp_phone");
		String fvp_location_no = request.getParameter("fvp_location_no");
		String fv_type = request.getParameter("fv_type");
		
		VaccineDto vaccineDto = 
				new VaccineDto(fvp_name, ss_number, fvp_mail, fvp_phone, fvp_location_no, fv_type);
		
		int result = vaccineDao.insertVaccineInjection(vaccineDto);
		
		if (result > 0) {
			System.out.println(CLASS_NAME.concat("VACCINE INJECTION SUCCESS!!"));
			
		} else {
			System.out.println(CLASS_NAME.concat("VACCINE INJECTION FAIl!!"));
			
		}
		
		return result;
		
	}

}
