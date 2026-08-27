package com.office.dw;

public class MyCalculator {
	
	/*
	 * MyCalculator는 CalAdd, CalSub, CalMul, CalDiv의 기능을 이용하지만,
	 * 스프링에서는 각각의 기능을 이용하는게 아닌, 의존한다고 할 수 있다.
	 * 
	 * MyCalculator는 CalAdd, CalSub, CalMul, CalDiv의 기능을 이용한다.
	 * ->
	 * MyCalculator는 CalAdd, CalSub, CalMul, CalDiv의 기능에 의존한다.
	 */
	
	
	// 전략패턴
	public void calculate(int firstNum, int secondNum, ICalculator calculator) {
		int value = calculator.doOperation(firstNum, secondNum);
		System.out.println("result : " + value);
	}

}
