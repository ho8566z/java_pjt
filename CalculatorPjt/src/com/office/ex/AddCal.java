package com.office.ex;

/**
 * 덧셈을 수행하는 ICal 구현체.
 * 두 정수의 합을 출력한다.
 */
public class AddCal implements ICal {
	
	@Override
	public void doCal(int n1, int n2) {
		System.out.println("ADD Result : " + (n1 + n2));
		
	}

}
