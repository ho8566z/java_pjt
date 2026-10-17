package com.office.ex;

/**
 * 뺄셈을 수행하는 ICal 구현체.
 * 첫 번째 정수에서 두 번째 정수를 뺀 값을 출력한다.
 */
public class SubCal implements ICal {
	
	@Override
	public void doCal(int n1, int n2) {
		System.out.println("SUB Result : " + (n1 - n2));
		
	}

}
