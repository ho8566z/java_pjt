package com.office.ex;

public class Calculator {
	
	/**
	 * 전달받은 계산기(ICal 구현체)에 두 정수의 연산을 맡긴다.
	 * 연산 종류는 ICal 구현체가 결정하므로 새 연산을 추가해도 이 메서드는 바뀌지 않는다.
	 */
	public void cal(ICal iCal, int n1, int n2) {
		iCal.doCal(n1, n2);
	}

}
