package com.office.ex;

/**
 * 나눗셈을 수행하는 ICal 구현체.
 * 소수점 이하가 버려지지 않도록 float 으로 계산한 결과를 출력한다.
 */
public class DivCal implements ICal {

	@Override
	public void doCal(int n1, int n2) {
		System.out.println("DIV Result : " + (n1 / (float) n2));
		
	}
	
}
