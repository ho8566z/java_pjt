package com.office.ex.inter;

public class MainClass {
	
	public static void main(String[] args) {
		
		// Child 는 Parent 와 GrandParent 인터페이스를 구현하므로 두 인터페이스의 메서드를 모두 호출할 수 있다
		Child child = new Child();
		child.doPrint();
		child.doRun();
		child.doEat();
		
	}

}
