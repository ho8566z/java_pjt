package com.office.dw;

/**
 * 뺄셈을 수행하는 ICalculator 구현체.
 * 첫 번째 수에서 두 번째 수를 뺀 값을 돌려준다.
 */
public class CalSub implements ICalculator {

	@Override
	public int doOperation(int firstNum, int secondNum) {

		return firstNum - secondNum;
	}

}
