package com.office.ex.overloading;

public class Greet {
	
	/*
	public void printGreetWord() {
		System.out.println("안녕하세요.");
		
	}
	
	public void printGreetWordByName(String name) {
		System.out.println(name + "님, 안녕하세요.");
		
	}
	*/
	
	public void printGreetWord() {
		System.out.println("안녕하세요.");
		
	}
	
	public void printGreetWord(String name) {
		System.out.println(name + "님, 안녕하세요.");
		
	}
	
	public void printGreetWord(char c) {
		System.out.println(c + "님, 안녕하세요.");
		
	}
	
	public void printGreetWord(String name, String word) {
		System.out.println(name + "님" + word);
		
	}
	
	// 매개변수 목록의 개수나 타입이 달라야 메서드 오버로딩이 가능하다.
	
}
