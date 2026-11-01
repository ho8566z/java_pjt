package com.office.ex;

/**
 * 싱글톤 패턴 예제 클래스.\n처음 getInstance() 를 호출할 때 한 번만 객체를 만들고, 이후에는 같은 객체를 돌려준다.
 */
public class Singleton {
	
	private static Singleton singleton;
	private int count = 0;
	
	private Singleton() {}
	
	public static Singleton getInstance() {
		if (singleton == null) {
			singleton = new Singleton();
		}
		return singleton;
	}
	
	
	
	public void inceaseCount() {
		count++;
	}

	
	public int getCount() {
		return count;
	}

	
}
