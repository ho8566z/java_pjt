package com.office.ex.controller;

import java.util.Scanner;

import com.office.ex.service.PayService;

/**
 * 사용자에게 급여를 지급할 월을 입력받아 PayService 에 지급을 요청한다.
 */
public class PayController {
	
	public void execute() {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Please enter the month : ");
		int thisMonth = scanner.nextInt();
		
		PayService payService = new PayService();
		payService.pay(thisMonth);
		
		scanner.close();
		
	}

}
