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
	
	
	// 전략패턴
	public void calculate(int firstNum, int secondNum, ICalculator calculator) {
		int value = calculator.doOperation(firstNum, secondNum);
		System.out.println("result : " + value);
	}
	
	/*
	public void calAdd(int firstNum, int secondNum, CalAdd calAdd) {
		
//		ICalculator iCalculator = new CalAdd();
//		int value = iCalculator.doOperation(firstNum, secondNum);
		
		int value = calAdd.doOperation(firstNum, secondNum);
		System.out.println("result : " + value);
		
	}
	
	public void calSub(int firstNum, int secondNum, CalSub calSub) {
			
//		ICalculator iCalculator = new CalSub();
//		int value = iCalculator.doOperation(firstNum, secondNum);
		
		int value = calSub.doOperation(firstNum, secondNum);
		System.out.println("result : " + value);
			
		}
	
	public void calMul(int firstNum, int secondNum, CalMul calMul) {
		
//		ICalculator iCalculator = new CalMul();
//		int value = iCalculator.doOperation(firstNum, secondNum);
		
		int value = calMul.doOperation(firstNum, secondNum);
		System.out.println("result : " + value);
		
	}
	
	public void calDiv(int firstNum, int secondNum, CalDiv calDiv) {
		
//		ICalculator iCalculator = new CalDiv();
//		int value = iCalculator.doOperation(firstNum, secondNum);
		
		int value = calDiv.doOperation(firstNum, secondNum);
		System.out.println("result : " + value);
		
	}
	*/
}
