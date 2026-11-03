package com.office.example;

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
