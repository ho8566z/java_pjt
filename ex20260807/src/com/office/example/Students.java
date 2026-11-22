package com.office.example;

/**
 * 학번과 이름을 저장하고 출력하는 학생 클래스.
 * 객체마다 자기 필드 값을 따로 가진다.
 */
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
