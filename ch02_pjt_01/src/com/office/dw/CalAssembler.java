package com.office.dw;

public class CalAssembler {
	
	MyCalculator myCalculator;
	CalAdd calAdd;
	CalSub calSub;
	CalMul calMul;
	CalDiv calDiv;
	
	public CalAssembler() {
		myCalculator = new MyCalculator();
		calAdd = new CalAdd();
		calSub = new CalSub();
		calMul = new CalMul();
		calDiv = new CalDiv();
		
		assemble();
	}

	private void assemble() {
		
		myCalculator.calculate(10, 5, calAdd);
		myCalculator.calculate(10, 5, calSub);
		myCalculator.calculate(10, 5, calMul);
		myCalculator.calculate(10, 5, calDiv);
	}
	
}
