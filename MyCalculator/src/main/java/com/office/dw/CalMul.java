package com.office.dw;

/**
 * 곱셈 계산기.
 */
public class CalMul implements ICalculator {

	@Override
	public int doOperation(int firstNum, int secondNum) {

		return firstNum * secondNum;
	}

}
