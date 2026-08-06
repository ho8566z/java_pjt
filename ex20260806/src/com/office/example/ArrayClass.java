package com.office.example;

import java.util.Arrays;

public class ArrayClass {

	public static void main(String[] args) {
		
		/*
		 * 배열
		 * 여러 개의 데이터를 묶어서 저장하고 관리하는 것
		 * -> 데이터 집합체
		 * 
		 * 배열 이미지 만들기
		 * '데이터 손실, 메모리 낭비'와 같이 네모칸 묶음을 사용해서
		 * 
		 * 
		 * 배열 선언 <- 이미지 만들기
		 * 변수명에 '[]'을 명시해 나타낸다.
		 * ex)
		 * int[] students = {10, 20, 30};
		 * int students[] = {10, 20, 30};
		 * 
		 * 배열을 선언할때 명시한 데이터 타입은 배열에 들어 있는 데이터의 타입을 의미한다
		 * 
		 * 
		 * 배열 생성
		 * 3가지 방법 <- 이미지 만들기
		 */
		
		// 배열 선언 -1 <-많이사용
		int[] myScores = {90, 50, 100};
		
		System.out.println("myScores: " + myScores);
		System.out.println("myScores[0]: " + myScores[0]);
      
		for (int i = 0; i < myScores.length; i++) {
			System.out.println(myScores[i]);
		}
      
		for (int score : myScores) {      // 90 50 100
			System.out.println("score: " + score);
		}
      
		System.out.println(Arrays.toString(myScores));      //[90, 50, 100]
      
//	    System.out.println(myScores[10]);      // ArrayIndexOutOfBoundsException 발생
      
		myScores[2] = 1000;
		System.out.println(myScores[2]);

		
		// 배열 선언 -2
		String[] myTools = new String[3];		// [ , , ]
		myTools[0] = "지우개";
		myTools[1] = "공책";
		myTools[2] = "만년필";
				
		// 배열 선언 -3
		float[] myFloats = new float[] {3.14f, 3.141592f, 3.141592876f};
				
				
		/*
		 * 인덱스를 이용한 데이터 조회 <- 개념 찾기
		 */
				
				
		// 학급 학생의 시험에 시험 성적과 평균을 출력하는 프로그램
		int[] studentScores = {80, 95, 100, 70, 68, 74, 88, 98, 100, 76};	// 학생점수
		
		int total = 0;
		float average = 0.0f;
		
		for (int i = 0; i < studentScores.length; i++) {
			System.out.printf("studentScores[%d] score : %d\n", i, studentScores[i]);
//			studentScores[0] score : 80 
//			studentScores[1] score : 95 
//			studentScores[2] score : 100 
//			...
//			studentScores[9] score : 76
			
			total += studentScores[i];
		}
		// 
		
		System.out.println("총합 : " + total);		// 총합 : 849
				
		average = total / (float)studentScores.length;
		System.out.println("평균 : " + average);		// 평균 : 84.9
				
		// --------------------------------------------------------------------------
		
		// 메모리의 배열 형태 <- 개념 찾기, 이미지 만들기
		
		// --------------------------------------------------------------------------
		
		/*
		 * 배열 복사 <- 이미지 만들기
		 * 
		 * ex)
		 * int num1 = 10;
		 * int num2 = num1;
		 * 
		 * system.out.println("num1 : " + num1);	// num1 : 10
		 * system.out.println("num2 : " + num2);	// num2 : 10
		 * num1의 값이 10을 num2도 복사받아 10의 데이터를 지닌다.
		 * num1의 값이 바뀌어도 num2의 값은 바뀌지 않는다.
		 * python과 달리 java는 데이터를 참조하지 않고, 데이터 자체를 복사하기 때문이다.
		 */
		
		int[] numbers = {10, 20, 30};
		System.out.println("numbers : " + Arrays.toString(numbers));	// numbers : [10, 20, 30]
		
		int[] numCopys = numbers;
		System.out.println("numCopys : " + Arrays.toString(numCopys));	// numCopys : [10, 20, 30]
		
		
		numbers[1] = 999;		// numCopys의 데이터도 변경됨
		System.out.println("numbers : " + Arrays.toString(numbers));	// numbers : [10, 999, 30]
		System.out.println("numCopys : " + Arrays.toString(numCopys));	// numCopys : [10, 999, 30]
		
		
	}
	
}
