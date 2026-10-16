package com.office.dw;

/**
 * 두 정수를 받아 사칙연산 중 하나를 수행하는 계산기 규격.
 */
public interface ICalculator {
	
	/**
	 * 두 정수에 연산을 적용한다.
	 *
	 * @param firstNum 첫 번째 정수
	 * @param secondNum 두 번째 정수
	 * @return 연산 결과
	 */
	public int doOperation(int firstNum, int secondNum);

}
