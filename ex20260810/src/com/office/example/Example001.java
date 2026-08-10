package com.office.example;

public class Example001 {
	
	public static void main(String[] args) {
		
		/*
		 * 객체 초기화
		 * 클래스애서 생성된 객체의 초기화를 담당하는 메서드라고 합니다.
		 */
		
		Student student00 = new Student();
		student00.printInfo();
		// 매개변수를 넣지 않으면, 기본 생성자의 내용을 적용받는다.
		
		Student student01 = new Student("홍길동", 1, 20, "computer");
		student01.printInfo();
		// 매개변수를 입력한 대로 출력받는다.
		
		Student student02 = new Student("박찬호", 2, 21, "music");
		student02.printInfo();
		
		Student student03 = new Student("박세리", 1, 20, "sport");
		student03.printInfo();
		
		new Student("이병규", 1, 20, "low");
		// 사진 참조해서 이미지 만들기(표 형태의 기능명세서 일부)
		
		new Student(null, 0, 0, null);
		// 매개변수명도 속성명과 같게 하는게 관례

	}

}
