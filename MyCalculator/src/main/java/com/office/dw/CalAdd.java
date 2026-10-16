package com.office.dw;

/**
 * 덧셈 계산기.
 */
public class CalAdd implements ICalculator {
	
	public CalAdd() {
		System.out.println("called CalAdd");
	}

	@Override
	public int doOperation(int firstNum, int secondNum) {

		return firstNum + secondNum;
	}

}
