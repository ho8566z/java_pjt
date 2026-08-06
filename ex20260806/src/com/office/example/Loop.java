package com.office.example;

import java.util.Scanner;

public class Loop {
	
	public static void main(String[] args) {
		
		/*
		 * for문 & while문
		 * 
		 * for (int i = 0; i < 11; i++)
		 * for (시작(초기화); 여기까지(조건식); 단계(증감식)) {
		 * 		System.out.println("i : " + i); <-실행구문
		 * }
		 * 
		 * for문 이미지 만들기
		 * 바로 위의 설명을 참조해서
		 */
		
//		for (int i = 0; i < 11; i++) {
//			System.out.println("i : " + i);
//		}
//		i : 0
//		i : 1
//		i : 2
//		...
//		i : 10
		
		// 초기화 부분을 for문 바깥으로
//		int i = 0;
//		
//		for (; i < 11; i++) {
//			System.out.println("i : " + i);
//		}
		// 결과는 동일하다
		
		// --------------------------------------------------------------------------
		
//		for (int i = 0, j = 10; i < 11 && j < 20; i++, j++) {
//			System.out.printf("i : %d \t / j : %d \n", + i, j);
//		}
//		i : 0 	 / j : 10 
//		i : 1 	 / j : 11 
//		i : 2 	 / j : 12 
//		...
//		i : 10 	 / j : 20 
		
		
		/*
		 * K마트에서 고객 감사 할인행사를 진행한다.
		 * 5% 할인쿠폰 증정
		 * 쿠폰 개수는 사용자가 원하는 만큼
		 * 단, 최대 쿠폰 수는 1인당 5개로 제한한다.
		 */
		
		Scanner scanner = new Scanner(System.in);
//		int couponNum = scanner.nextInt();

//		for (int i = 0, j = 5; i < couponNum && j > 0; i++, j--) {
//			System.out.println("쿠폰 발행");
//		}
		
		// 전위 연산자
//		for (int i = 0; i < couponNum; i++) {
//			if (i >= 5) break;
//			System.out.println("쿠폰 발행");
//		}
		
		// 후위 연산자
//		for (int i = 0; i < couponNum; ++i) {
//			if (i >= 5) break;
//			System.out.println("쿠폰 발행");
//		}
		
		// for문에서 전위연산자와 후위연산자는 동일한 결과를 나타낸다.
		
		
		// --------------------------------------------------------------------------
		
		// 지양해야하는 코드
//		for (double d = 0.0; d < 1; d += 0.1) {
//			System.out.printf("d : %f \n", d);
//		}
//		d : 0.000000 
//		d : 0.100000 
//		d : 0.200000 
//		d : 0.300000 
//		...
//		d : 1.000000 
		
		// --------------------------------------------------------------------------
		
		/*
		 * while문
		 * 
		 * for문이 횟수에 의한 반복이라면, while문은 조건에 의한 반복이다.
		 * 
		 * ex) for문: PT 10번 / while문: 100KG -> 80KG까지
		 * 
		 * while문 이미지 만들기
		 * for문과 같이
		 */
		
//		int num = 10;
//		while (num > 0) {
//		while (true) {
//		// 조건식 = true
//			System.out.println("조건식에 만족했다.");
//			num--;
//			if (num <= 5) break;
//			// 증감식 or break로 whiie문을 제어해야 함
//		}
		
		// --------------------------------------------------------------------------
		
		// do ~ while
		// 조건식과 별개로 무조건 딱 한번은 실행한다.
		
		/*
		 * 1. 시음으로 처음 1회는 무료
		 * 2. 마시고 맛있으면, 구독해라
		 * 3. 계속하다가 질려서 구독을 중단하려
		 */
//		int condition = 0;
//		do {
//			System.out.println("우유 배송");
//			System.out.println("정기배송 결정여부");
//			System.out.println("1.계속 구독 / 2.구독 취소");
//			
//			condition = scanner.nextInt();
//		} while(condition == 1);
		
		scanner.close();
		
	}

}
