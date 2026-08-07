package com.office.example;

public class Students {
	
	// 생성자
	public Students() {
		System.out.println("aaaaa");
	}
	
	// 멤버 필드
	int id;
	String name;
	
	// 메서드
	void insertRecord(int id, String name) {
		this.id = id;
		this.name = name;
		
	}
	
	void printInfo() {
		System.out.println("아이디 : " + id);
		System.out.println("이름 : " + name);
	}

}
