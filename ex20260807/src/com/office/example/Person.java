package com.office.example;

public class Person {
	
	// 속성
	String name = "Hong Gildong";		// 멤버 변수(전역변수) or 멤버 필드
	int regNum = 123;					// 멤버 변수(전역변수) or 멤버 필드
	int setAttribute = setData();		// 메서드를 이용한 초기화
	
	int setData() {
		name = "홍길동";
		this.name = name;
		regNum = 456;
		
		return 0;
	}

	// 기능
	void walk() {
		System.out.println("걷다");
		
//		int weight = 80;				// 변수(지역변수)
		
	}
	void run() {
		System.out.println("뛰다");
	
	}
	void runForApeople() {				// 특정 대상을 위한 메서드 맞춤화
		System.out.println("뛰다");
	
	}
}
