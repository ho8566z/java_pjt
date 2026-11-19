package com.office.example;

/**
 * 멤버 필드 실습 클래스.
 * 객체를 만들어 name 필드 값을 출력한다.
 */
public class Example02 {
	
	// 멤버 필드
	String name = "홍길동";
	
	public static void main(String[] args) {
		
		Example02 axample02 = new Example02();
		
		System.out.println("name : " + axample02.name);
		
	}

}
