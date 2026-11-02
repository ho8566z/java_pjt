package com.office.dw;

/**
 * 두 정수의 연산 방식을 정의하는 인터페이스.
 * 각 연산 클래스(CalAdd, CalSub 등)가 doOperation() 을 구현한다.
 */
public interface ICalculator {
	
	public int doOperation(int firstNum, int secondNum);

}
