package com.office.ex.inter;

/**
 * Parent 와 GrandParent 두 인터페이스를 함께 구현하는 클래스.
 * 상속은 하나만 가능하지만 인터페이스는 여러 개를 구현할 수 있다.
 */
public class Child implements Parent, GrandParent{

	// 상속과 달리 인터페이스를 사용하면, 여러개의 타입을 사용할 수 있다.
	
	// Parent
	@Override
	public void doPrint() {
		System.out.println("Hello");
		
	}

	// Parent
	@Override
	public void doRun() {
		// TODO Auto-generated method stub
		
	}

	
	// GrandParent
	@Override
	public void doEat() {
		System.out.println("Eat");
		
	}
	
	

}
