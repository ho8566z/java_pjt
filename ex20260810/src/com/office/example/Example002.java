package com.office.example;

/**
 * 생성자 오버로딩으로 OurStudent 객체를 만드는 실습 클래스.
 * 매개변수의 개수에 따라 다른 생성자가 호출된다.
 */
public class Example002 {
	
	public static void main(String[] args) {
		
		// 1번째 학생
		//1학년, 1반, 5번, 박찬호, false
//		OurStudent ourStudent01 = new OurStudent();
//		ourStudent01.grade = 1;
//		ourStudent01.classNo = 1;
//		ourStudent01.studentNo = 5;
//		ourStudent01.studentName = "박찬호";
//		ourStudent01.absence = false;
		
//		OurStudent ourStudent01 = new OurStudent(1, 1, 2, "박찬호", false);
//		ourStudent01.printInfo();
//		
//		OurStudent ourStudent02 = new OurStudent(1, 2, 5, "박지성", false);
//		ourStudent02.printInfo();
		
		
		OurStudent ourStudent01 = new OurStudent(1, 2, "박찬호");
		ourStudent01.printInfo();
		
		OurStudent ourStudent02 = new OurStudent(2, 5, "박지성");
		ourStudent02.printInfo();
		
		// 박세리 2학년 전학
		OurStudent ourStudent03 = new OurStudent(2, 5, 10, "박세리");
		ourStudent03.printInfo();
		
		OurStudent ourStudent04 = new OurStudent(0, 0, 0, null, false);
		ourStudent04.printInfo();

	}

}
