package com.office.dw;

/**
 * 곱셈을 수행하는 ICalculator 구현체.
 * 두 수의 곱을 돌려준다.
 */
public class CalMul implements ICalculator {

	@Override
	public int doOperation(int firstNum, int secondNum) {

		return firstNum * secondNum;
	}

}
