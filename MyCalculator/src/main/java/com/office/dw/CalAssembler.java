package com.office.dw;

public class CalAssembler {
	
	MyCalculator myCalculator;
	CalAdd calAdd;
	CalSub calSub;
	CalMul calMul;
	CalDiv calDiv;
	
	public CalAssembler(MyCalculator myCalculator, 
			CalAdd calAdd,
			CalSub calSub,
			CalMul calMul,
			CalDiv calDiv) {
		
		this.myCalculator = myCalculator;
		this.calAdd = calAdd;
		this.calSub = calSub;
		this.calMul = calMul;
		this.calDiv = calDiv;
	}

	public void assemble() {
		
		myCalculator.calculate(10, 5, calAdd);
		myCalculator.calculate(10, 5, calSub);
		myCalculator.calculate(10, 5, calMul);
		myCalculator.calculate(10, 5, calDiv);
	}
	
}
