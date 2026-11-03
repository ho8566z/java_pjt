package com.office.ex.main;

import com.office.ex.controller.CoolingController;
import com.office.ex.system.CoolingSystem;

public class MainClass {
	
	public static void main(String[] args) {
		
		// 냉각 시스템을 만들어 컨트롤러에 넘겨 사용하게 한다
		CoolingSystem coolingSystem = 
				new CoolingSystem("white");
		
		CoolingController coolingController = 
				new CoolingController(coolingSystem);
		coolingController.control();
		
	}

}
