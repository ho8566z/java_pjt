package com.office.dw;

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
