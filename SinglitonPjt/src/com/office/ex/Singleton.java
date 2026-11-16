package com.office.ex;

/**
 * 싱글톤 패턴 예제 클래스.\n처음 getInstance() 를 호출할 때 한 번만 객체를 만들고, 이후에는 같은 객체를 돌려준다.
 */
public class Singleton {
	
	private static Singleton singleton;
	private int count = 0;
	
	private Singleton() {}
	
	/**
	 * 하나뿐인 Singleton 객체를 돌려준다. 처음 호출할 때만 객체를 만든다.
	 */
	public static Singleton getInstance() {
		if (singleton == null) {
			singleton = new Singleton();
		}
		return singleton;
	}
	
	
	
	/**
	 * 카운트를 1 늘린다.
	 */
	public void inceaseCount() {
		count++;
	}

	
	/**
	 * 지금까지 센 카운트를 돌려준다.
	 */
	public int getCount() {
		return count;
	}

	
}
