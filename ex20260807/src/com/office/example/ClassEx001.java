package com.office.example;

public class ClassEx001 {
	
	public static void main(String[] args) {
		
		Cat cat1 = new Cat();		// 객체 생성 at 메모리
		// [new Cat() -> Cat 클래스 -> Cat 객체] <- ["이미지 만들기"] - 격자 메모리 구조에서
		// new cat은 격자 바깥, cat클래스와 cat객체는 격자 내부에
		
		// Cat cat1 = new Cat();에서 "Cat"은 같은 데이터 타입으로, 
		// int와 float와 내가 만든 데이터 타입이다.
		
		System.out.println("cat1 : " + cat1);	// cat1 : com.office.example.Cat@73a28541
		System.out.println(cat1.bread);			// 페르시안 : .bread는 Cat의 변수이다.
		
		cat1.eat();								// 먹다 : .eat()은 Cat의 메서드이다.
		
		
		Person person1 = new Person();
		
		System.out.println("person1 : " + person1);	
		// person1 : com.office.example.Person@3ada9e37
		System.out.println(person1.name);		// Hong Gildong
		
		person1.run();							// 뛰다

		System.out.println("setAttribute : " + person1.setAttribute);
		
	}

}
