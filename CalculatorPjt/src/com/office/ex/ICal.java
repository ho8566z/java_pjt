package com.office.ex;

/**
 * 계산기 동작을 정의하는 인터페이스.
 * 각 연산 클래스(AddCal, DivCal 등)가 doCal() 을 구현한다.
 */
public interface ICal {
	
	public void doCal(int n1, int n2);

}
