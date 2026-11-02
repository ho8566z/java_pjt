package com.office.dw;

/**
 * 계산기 실습의 시작점.
 * CalAssembler 가 객체를 만들어 연결하도록 맡겨 제어의 역전(IoC)을 보여준다.
 */
public class MainClass {
	
	public static void main(String[] args) {
		
//		MyCalculator myCalculator = new MyCalculator();
//		myCalculator.calculate(10, 5, new CalAdd());
//		myCalculator.calculate(10, 5, new CalSub());
//		myCalculator.calculate(10, 5, new CalMul());
//		myCalculator.calculate(10, 5, new CalDiv());
		
		// IoC : 제어의 역전
		new CalAssembler();
		
	}

}
