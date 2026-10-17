package com.office.ex.worker;

/**
 * 대리 직급의 급여 정보를 가진 클래스.
 * 급여(money)는 private 이라 CEO 권한의 setMoney() 로만 변경할 수 있다.
 */
public class Daeri {
	
	public String name = "Kim Daeri";
	private int money;
	
	public Daeri() {
		money = 1000000;
		
	}
	
	/**
	 * 대리의 급여 지급 내역을 출력한다.
	 */
	public void pay() {
		System.out.println(name + "님 노고에 감사드립니다.");
		System.out.println(money + "원, 지급완료");
		
	}
	
	/**
	 * 급여를 변경한다. 직급이 CEO 일 때만 변경된다.
	 */
	public void setMoney(int money, String grade) {
		if (grade.equals("CEO")) {
			
			this.money = money;
		}
		
	}

}
