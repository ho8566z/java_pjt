package com.office.ex.worker;

public class Gwajang {
	
	public String name = "Kim Gwajang";
	private int money;
	
	public Gwajang() {
		money = 2000000;
		
	}
	
	/**
	 * 과장의 급여 지급 내역을 출력한다.
	 */
	public void pay() {
		System.out.println(name + "님 노고에 감사드립니다.");
		System.out.println(money + "원, 지급완료");
		
	}

}
