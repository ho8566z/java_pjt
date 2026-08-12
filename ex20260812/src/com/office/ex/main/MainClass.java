package com.office.ex.main;

import com.office.ex.controller.CoolingController;
import com.office.ex.system.CoolingSystem;

public class MainClass {
	
	public static void main(String[] args) {
		
		CoolingSystem coolingSystem = 
				new CoolingSystem("white");
		
		CoolingController coolingController = 
				new CoolingController(coolingSystem);
		coolingController.control();
		
	}

}
