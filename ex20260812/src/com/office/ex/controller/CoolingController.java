package com.office.ex.controller;

import java.util.Scanner;

import com.office.ex.system.CoolingSystem;

public class CoolingController {
	
	private CoolingSystem coolingSystem;
	
	public CoolingController(CoolingSystem coolingSystem) {
		this.coolingSystem = coolingSystem;
				
	}
	
	public void control() {
		
		Scanner scanner = new Scanner(System.in);
		
		boolean systemFlag = true;
		
		while (systemFlag) {
			System.out.println("Choose the function you want.");
			System.out.println("1.Power On/Off   2.Temperature setting   3.The End");
			
			int selectedFunction = scanner.nextInt();
			
			switch(selectedFunction) {
			case 1:
//				boolean currentStatus = coolingSystem.isPower();
//				if (currentStatus) {
//					coolingSystem.setPower(false);
//				} else {
//					coolingSystem.setPower(true);
//				}
				coolingSystem.setPower(!coolingSystem.isPower());
				
				break;
				
				
			case 2:
				
				System.out.println("Enter the desired temperature.");
				int desiredTemperature = scanner.nextInt();
			
				coolingSystem.setTargetTemperature(desiredTemperature);
				
				break;
			
				
			case 3:
				
				systemFlag = false;
				
				break;
			}
			
			coolingSystem.printSystemInformation();
			
		}
		
		
		
		scanner.close();
		
	}

}
