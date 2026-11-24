package com.office.ex.overloading;

/**
 * 인사말 출력 메서드를 매개변수 목록만 달리해 오버로딩하는 실습 클래스.
 */
public class Greet {
	
	/*
	public void printGreetWord() {
		System.out.println("안녕하세요.");
		
	}
	
	public void printGreetWordByName(String name) {
		System.out.println(name + "님, 안녕하세요.");
		
	}
	*/
	
	/** 기본 인사말을 출력한다. */
	public void printGreetWord() {
		System.out.println("안녕하세요.");
		
	}
	
	/** 이름을 받아 "이름님, 안녕하세요." 를 출력한다. */
	public void printGreetWord(String name) {
		System.out.println(name + "님, 안녕하세요.");
		
	}
	
	/** 문자 하나를 이름처럼 받아 인사말을 출력한다. */
	public void printGreetWord(char c) {
		System.out.println(c + "님, 안녕하세요.");
		
	}
	
	/** 이름 뒤에 원하는 문구를 붙여 출력한다. */
	public void printGreetWord(String name, String word) {
		System.out.println(name + "님" + word);
		
	}
	
	// 매개변수 목록의 개수나 타입이 달라야 메서드 오버로딩이 가능하다.
	
}
