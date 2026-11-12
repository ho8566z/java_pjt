package com.office.example;

/** 두 정수의 나눗셈 결과를 출력하는 연산 클래스. */
public class calculatorDiv {
	
	/** n1 을 n2 로 나눈다. 소수점을 살리려고 n2 를 float 으로 바꿔 계산한다. */
	void divOperator(int n1, int n2) {
		System.out.println("n1 / n2 = " + (n1 / (float) n2));
	}

}
