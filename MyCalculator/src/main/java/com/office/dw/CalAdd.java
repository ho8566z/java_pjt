package com.office.dw;

public class CalAdd implements ICalculator {
	
	public CalAdd() {
		System.out.println("called CalAdd");
	}

	@Override
	public int doOperation(int firstNum, int secondNum) {

		return firstNum + secondNum;
	}

}
