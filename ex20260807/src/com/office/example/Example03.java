package com.office.example;

/**
 * 객체마다 자기 정보를 따로 가지는지 확인하는 실습 클래스.
 * Students 객체를 두 개 만들어 각각 학번과 이름을 넣고 출력한다.
 */
public class Example03 {
	
	public static void main(String[] args) {
		
		// 학생 객체를 따로 만들면 각 객체가 자기 정보를 따로 가진다
		Students student01 = new Students();
		
		student01.insertRecord(20221004, "홀길순");
		student01.printInfo();
		
		
		Students student02 = new Students();
		
		student02.insertRecord(20221005, "홀길동");
		student02.printInfo();
		
	}

}
