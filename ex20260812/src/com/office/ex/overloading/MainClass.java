package com.office.ex.overloading;

public class MainClass {
	
	public static void main(String[] args) {
		
		Greet greet = new Greet();
		
//		greet.printGreetWord();
//		greet.printGreetWordByName("박찬호");
		
		greet.printGreetWord("박찬호");
		greet.printGreetWord();
		
	}

}
