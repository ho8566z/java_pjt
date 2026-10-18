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
	
	
	/**
	 * 전달받은 계산 방식(ICalculator 구현체)으로 두 정수를 계산해 결과를 출력한다.
	 * 전략 패턴이라 연산을 추가해도 이 메서드는 바뀌지 않는다.
	 */
	public void calculate(int firstNum, int secondNum, ICalculator calculator) {
		int value = calculator.doOperation(firstNum, secondNum);
		System.out.println("result : " + value);
	}

}
