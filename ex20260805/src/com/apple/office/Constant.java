package com.apple.office;

public class Constant {

	public static void main(String[] args) {
		
		/*
		 * 상수
		 * ppt로 변수처럼 이미지 만들기(변수 이미지와 같이)
		 * 
		 * final float RADIO_OF_CIRCLE = 3.141592f;
		 * RADIO_OF_CIRCLE: 상수, 3.141592f: 리터럴
		 */
		
		int num1 = 10;			// 변수 선언 및 초기화
		
		final int NUM2 = 20;	// 상수 선언 및 초기화
		
		System.out.println("num1 : " + num1);	// num1 : 10
		System.out.println("NUM2 : " + NUM2);	// NUM2 : 20
		
		num1 = 100;
//		NUM2 = 200;
		
		/*
		 * java에서는 딱 한번 초기화할 수 있다.
		 */
		
		final int Num3;		// 상수 선언
		
		Num3 = 30;			// 상수 초기화
		
//		Num3 = 300;			// 상수 재 초기화(X)
		
		final int PENCIL_PRICE = 1000;
		final float STUDENT_HEIGHT = 175.5f;
		final char GRADE = 'A';
		final String COUNTRY = "Korea";
		
		System.out.printf("PENCIL_PRICE : %d원 \n", PENCIL_PRICE);
		System.out.printf("STUDENT_HEIGHT : %.1f센티미터 \n", STUDENT_HEIGHT);
		System.out.printf("GRADE : %c등급 \n", GRADE);
		System.out.printf("COUNTRY : %s국가 \n", COUNTRY);
		
//		PENCIL_PRICE : 1000원 
//		STUDENT_HEIGHT : 175.5센티미터 
//		GRADE : A등급 
//		COUNTRY : Korea국가 
		
		/*
		 * 단축키
		 * 소문자에서 대문자로 : ctrl + shift + x
		 * 대문자에서 소문자로 : ctrl + shift + y
		 */
		
		/*
		 * 코딩 잘하는법
		 * 변수, 상수 등을 System.out.print()에 입력할때,
		 * 3글자 치고, 'ctrl' + 'space' 입력하기
		 */

		
	}
	
}
