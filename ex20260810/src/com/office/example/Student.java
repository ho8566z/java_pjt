package com.office.example;

public class Student {
	
	// 생성자(Constructor)	<- 기본 생성자(Default Constructor)
	public Student() {
		System.out.println("Student() Constructor CALLED");
		
		// 생성자를 이용한 초기화
		// 이렇게 '디폴트 생성자'에서 멤버 필드를 초기화하게 되면, 이제 디폴트 생성자는 
		// 더 이상 디폴트 생성자가 아닌, 이제 '일반 생성자'라고 한다.
		//
		// 그럼, 디폴트 생성자가 없으니, 컴파일러가 개발자를 대신해서 디폴트 생성자를 넣어줄까?
		// 아니다, 일반생성자가 하나라도 존재하면, 컴파일러는 디폴트 생성자를 넣어주지 않는다.
		// 기본 생성자와 일반 생성자는 동시에 존재할 수 없다.
		name = "홍길동";
		grade = 1;
		age = 20;
		major = "computer";
		
	}
	// 이미지 만들기 : 사진 참조
	// [new Student(): 객체 생성 -> student 객체(인스턴스) 생성 -> student(생성자)초기화]
	
	
	// 생성자 매개변수 => 일반 생성자 == 생성자 오버로딩(overloading, 과적)
	// 매개변수 이름은 가독성이 뛰어난 이름 : 속성명과 동일하게 한다.
//	public Student(String n, int g, int a, String m) {
	public Student(String name, int grade, int age, String major) {
		this.name = name;
		this.grade = grade;
		this.age = age;
		this.major = major;
		// this는 속성명과 매개변수명이 같아서 오류가 발생할 때, 전역변수에 값을 할당할 때 사용한다.
	}
	
	/*
	 * 메서드 오버로딩(Method Overloading)이란 하나의 클래스 안에서 같은 
	 * 이름의 메서드를 여러 개 정의하는 것을 의미한다.
	 * 
	 * 단, 메서드의 이름은 같지만 매개변수(Parameter)의 개수, 
	 * 자료형 또는 순서가 달라야 한다.
	 */
	
	
	
	// 속성 == 멤버 필드
	String name;		// null
	int grade;			// 0
	int age;			// 0
	String major;		// null
	
	
	// 기능 == 멤버 메서드
	public void printInfo() {
		System.out.println("Name : " + name);
		System.out.println("Grade : " + grade);
		System.out.println("Age : " + age);
		System.out.println("Major : " + major);
	}
	
}
