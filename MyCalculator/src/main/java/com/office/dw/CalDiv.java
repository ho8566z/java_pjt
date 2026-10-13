package com.office.dw;

/**
 * 나눗셈 계산기. 나누는 수가 0이면 0을 반환한다.
 */
public class CalDiv implements ICalculator {

	@Override
	public int doOperation(int firstNum, int secondNum) {

		return secondNum !=0 ? (firstNum / secondNum) : 0;
	}

}
