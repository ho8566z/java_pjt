package com.office.ex;

/**
 * 곱셈을 수행하는 ICal 구현체.
 * 두 정수의 곱을 출력한다.
 */
public class MulCal implements ICal {

	@Override
	public void doCal(int n1, int n2) {
		System.out.println("MUL Result : " + (n1 * n2));
		
	}
	
}
