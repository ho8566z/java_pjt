package com.office.example;

/** 사칙연산 클래스(Add, Sub, Mul, Div)를 하나씩 보관하고 호출을 넘겨 주는 계산기. */
public class Calculator {		// 4칙연산(+, -, *, /)
	
	CalculatorAdd calculatorAdd = new CalculatorAdd();
	calculatorSub calculatorSub = new calculatorSub();
	calculatorMul calculatorMul = new calculatorMul();
	calculatorDiv calculatorDiv = new calculatorDiv();
	
	/** 덧셈 연산을 CalculatorAdd 에 맡긴다. */
	void calculatorAdd(int n1, int n2) {
		System.out.println("[Calculator] calculatorAdd() called");
		
//		CalculatorAdd calculatorAdd = new CalculatorAdd();
		calculatorAdd.addOperator(n1, n2);
		
	}
	
	/** 뺄셈 연산을 calculatorSub 에 맡긴다. */
	void calculatorSub(int n1, int n2) {
		System.out.println("[Calculator] calculatorSub() called");
		
//		calculatorSub calculatorSub = new calculatorSub();
		calculatorSub.subOperator(n1, n2);
		
	}
	
	/** 곱셈 연산을 calculatorMul 에 맡긴다. */
	void calculatorMul(int n1, int n2) {
		System.out.println("[Calculator] calculatorMul() called");
		
//		calculatorMul calculatorMul = new calculatorMul();
		calculatorMul.mulOperator(n1, n2);
		
	}
	
	/** 나눗셈 연산을 calculatorDiv 에 맡긴다. */
	void calculatorDiv(int n1, int n2) {
		System.out.println("[Calculator] calculatorDiv() called");
		
//		calculatorDiv calculatorDiv = new calculatorDiv();
		calculatorDiv.divOperator(n1, n2);
		
	}
}
