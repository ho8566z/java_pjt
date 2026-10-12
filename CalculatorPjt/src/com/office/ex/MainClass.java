package com.office.ex;

public class MainClass {
	
	public static void main(String[] args) {
		
		Calculator calculator = new Calculator();
		
		calculator.cal(new AddCal(), 10, 20);
		calculator.cal(new SubCal(), 10, 20);
		calculator.cal(new MulCal(), 10, 20);
		calculator.cal(new DivCal(), 10, 20);
		
	}

}
