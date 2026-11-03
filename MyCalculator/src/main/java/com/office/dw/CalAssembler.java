package com.office.dw;

// 계산기와 사칙연산 객체를 한곳에 모아 조립하는 클래스
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

	// 같은 두 수(10, 5)로 덧셈·뺄셈·곱셈·나눗셈을 차례로 실행한다
	public void assemble() {
		
		myCalculator.calculate(10, 5, calAdd);
		myCalculator.calculate(10, 5, calSub);
		myCalculator.calculate(10, 5, calMul);
		myCalculator.calculate(10, 5, calDiv);
	}
	
}
