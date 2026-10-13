package com.office.dw;

/**
 * 덧셈 계산기.
 */
public class CalAdd implements ICalculator {

	@Override
	public int doOperation(int firstNum, int secondNum) {

		return firstNum + secondNum;
	}

}
