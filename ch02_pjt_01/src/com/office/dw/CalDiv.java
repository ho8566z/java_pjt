package com.office.dw;

/**
 * 나눗셈을 수행하는 ICalculator 구현체.
 * 두 번째 수가 0 이면 오류를 피하기 위해 0 을 돌려준다.
 */
public class CalDiv implements ICalculator {

	@Override
	public int doOperation(int firstNum, int secondNum) {

		return secondNum !=0 ? (firstNum / secondNum) : 0;
	}

}
