package com.office.ex.overloading;

/**
 * Greet 의 오버로딩된 printGreetWord 메서드를 호출해 보는 실행 클래스.
 */
public class MainClass {
	
	public static void main(String[] args) {
		
		Greet greet = new Greet();
		
//		greet.printGreetWord();
//		greet.printGreetWordByName("박찬호");
		
		greet.printGreetWord("박찬호");
		greet.printGreetWord();
		
	}

}
