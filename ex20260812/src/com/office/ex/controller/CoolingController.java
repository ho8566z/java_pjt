package com.office.ex.controller;

import java.util.Scanner;

import com.office.ex.system.CoolingSystem;

/**
 * 냉방 시스템의 전원과 희망 온도를 메뉴로 선택해 조작하는 컨트롤러 클래스.
 */
public class CoolingController {
	
	private CoolingSystem coolingSystem;
	
	public CoolingController(CoolingSystem coolingSystem) {
		this.coolingSystem = coolingSystem;
				
	}
	
	/**
	 * 메뉴(1.전원 켜기/끄기 2.온도 설정 3.종료)를 반복해서 보여 주고 선택한 기능을 실행한다.
	 */
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
