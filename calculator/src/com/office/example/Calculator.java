package com.office.example;

public class Calculator {		// 4칙연산(+, -, *, /)
	
	CalculatorAdd calculatorAdd = new CalculatorAdd();
	calculatorSub calculatorSub = new calculatorSub();
	calculatorMul calculatorMul = new calculatorMul();
	calculatorDiv calculatorDiv = new calculatorDiv();
	
	void calculatorAdd(int n1, int n2) {
		System.out.println("[Calculator] calculatorAdd() called");
		
//		CalculatorAdd calculatorAdd = new CalculatorAdd();
		calculatorAdd.addOperator(n1, n2);
		
	}
	
	void calculatorSub(int n1, int n2) {
		System.out.println("[Calculator] calculatorSub() called");
		
//		calculatorSub calculatorSub = new calculatorSub();
		calculatorSub.subOperator(n1, n2);
		
	}
	
	void calculatorMul(int n1, int n2) {
		System.out.println("[Calculator] calculatorMul() called");
		
//		calculatorMul calculatorMul = new calculatorMul();
		calculatorMul.mulOperator(n1, n2);
		
	}
	
	void calculatorDiv(int n1, int n2) {
		System.out.println("[Calculator] calculatorDiv() called");
		
//		calculatorDiv calculatorDiv = new calculatorDiv();
		calculatorDiv.divOperator(n1, n2);
		
	}
}
