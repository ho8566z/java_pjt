package com.office.example;

/**
 * Calculator 의 덧셈·뺄셈·곱셈·나눗셈 메서드를 차례로 호출해 보는 시작점.
 */
public class MainClass {
	
	public static void main(String[] args) {
		
		Calculator calculator = new Calculator();
		
		calculator.calculatorAdd(10, 20);
		calculator.calculatorSub(20, 10);
		calculator.calculatorMul(10, 20);
		calculator.calculatorDiv(20, 10);
		
//		n1 + n2 = 30
//		[Calculator] calculatorSub() called
//		n1 - n2 = 10
//		[Calculator] calculatorMul() called
//		n1 * n2 = 200
//		[Calculator] calculatorDiv() called
//		n1 / n2 = 2.0
		
				
	}

}
