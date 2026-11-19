package com.office.ex.main;

import com.office.ex.controller.CoolingController;
import com.office.ex.system.CoolingSystem;

/**
 * 냉각 시스템 실습의 시작점.
 * CoolingSystem 을 만들어 CoolingController 에 전달하고 제어를 시작한다.
 */
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
