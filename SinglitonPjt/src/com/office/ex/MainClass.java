package com.office.ex;

/**
 * 싱글톤 패턴 확인용 시작점.
 * getInstance() 를 두 번 불러도 같은 객체가 돌아오고, 카운트가 공유됨을 보여 준다.
 */
public class MainClass {
	
	public static void main(String[] args) {
		
		// getInstance() 는 언제나 같은 객체를 돌려주므로 두 변수는 한 객체를 가리킨다
		Singleton singleton1 = Singleton.getInstance();
		
		Singleton singleton2 = Singleton.getInstance();
		
		System.out.println(singleton1 == singleton2);		// true
		
		
		singleton1.inceaseCount(); 		// count : 1
		singleton1.inceaseCount(); 		// count : 2
		System.out.println(singleton1.getCount()); 		// 2
		
		
		singleton2.inceaseCount();		// count : 3
		System.out.println(singleton1.getCount()); 		// 3
		System.out.println(singleton2.getCount()); 		// 3
		
		
	}

}
