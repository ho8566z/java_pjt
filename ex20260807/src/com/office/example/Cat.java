package com.office.example;

/**
 * 고양이 클래스 실습.
 * 필드와 일반 메서드, static 메서드의 차이를 보여 준다.
 */
public class Cat {
	
	// 멤버 변수 == 속성 == attribute == 멤버 필드
	String bread;
	String color;
	int age = 10;
	
	// 일반 메서드
	// 멤버 메서드 == 기능 ==  method
	void eat() {
		// eat() 메서드 구현
		System.out.println("eat() called");
	
	}
		
	static void eatStatic() {
		// eatStatic() 메서드 구현
		System.out.println("eatStatic() called");
		
	}
	void scratch() {
		// scratch() 메서드 구현
		System.out.println("scratch() called");
		
	}
	void meow() {
		// meow() 메서드 구현
		
	}
}
