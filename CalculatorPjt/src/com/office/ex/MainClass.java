package com.office.ex;

/**
 * 계산기 실습의 시작점.
 * 10 과 20 으로 덧셈, 뺄셈, 곱셈, 나눗셈을 차례로 실행한다.
 */
public class MainClass {
	
	public static void main(String[] args) {
		
		Calculator calculator = new Calculator();
		
		calculator.cal(new AddCal(), 10, 20);
		calculator.cal(new SubCal(), 10, 20);
		calculator.cal(new MulCal(), 10, 20);
		calculator.cal(new DivCal(), 10, 20);
		
	}

}
