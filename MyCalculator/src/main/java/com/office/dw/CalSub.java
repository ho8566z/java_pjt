package com.office.dw;

/**
 * 뺄셈 계산기.
 */
public class CalSub implements ICalculator {

	@Override
	public int doOperation(int firstNum, int secondNum) {

		return firstNum - secondNum;
	}

}
