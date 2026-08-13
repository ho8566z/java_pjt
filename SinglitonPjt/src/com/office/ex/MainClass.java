package com.office.ex;

public class MainClass {
	
	public static void main(String[] args) {
		
		Singleton singleton1 = Singleton.getInstance();
		
		Singleton singleton2 = Singleton.getInstance();
		
		System.out.println(singleton1 == singleton1);		// true
		
		
		singleton1.inceaseCount(); 		// count : 1
		singleton1.inceaseCount(); 		// count : 2
		System.out.println(singleton1.getCount()); 		// 2
		
		
		singleton2.inceaseCount();		// count : 3
		System.out.println(singleton1.getCount()); 		// 3
		System.out.println(singleton2.getCount()); 		// 3
		
		
	}

}
