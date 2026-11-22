package com.office.example;

import java.util.ArrayList;

/**
 * DwStudent 3명을 ArrayList 에 등록하고 이름으로 찾아 출력하는 실습 클래스.
 */
public class Example005 {
	
	public static void main(String[] args) {
		
		// 1.학생 등록 - 3명
		ArrayList<DwStudent> dwStudents = new ArrayList<DwStudent>();
		
		DwStudent student01 = new DwStudent("박찬호", 20);
		dwStudents.add(student01);
		
		DwStudent student02 = new DwStudent("박지성", 25);
		dwStudents.add(student02);
		
		DwStudent student03 = new DwStudent("박세리", 26);
		dwStudents.add(student03);
		
		
		// 박지성 학생의 정보 찾기
		for (int i = 0; i < dwStudents.size(); i++) {
			DwStudent dwStudent = dwStudents.get(i);
			if (dwStudent.name.equals("박지성")) {
				System.out.println("이름 : " + dwStudent.name);
				System.out.println("나이 : " + dwStudent.age);
				
			}
		}
		
		
		
	}

}
