package com.office.example;

import java.util.Scanner;

public class Condition {
	
	public static void main(String[] args) {
		
		/*
		 * if문
		 * if (조건식) {
		 * 조건식의 결과가 true인 경우, 실행되는 실행구문
		 * }
		 * 
		 * if문 이미지 만들기
		 * 속성 : if키워드, 조건식, 코드블록, 실행문
		 */
		
		Scanner scanner = new Scanner(System.in);
		
//		int num = scanner.nextInt();
//		if (num > 10) {
//			System.out.printf("%d은 10보다 크다. \n", num);
//		}
//		12
//		12은 10보다 크다. 
		
		// --------------------------------------------------------------------------
		
		/*
		 * if문 -> if ~ else문(양자택일), if ~ else if문(다중비교)
		 * 
		 * if ~ else문 이미지 만들기
		 * 속성 : if키워드, else키워드, 조건식, 코드블록, 실행문
		 * 
		 * if ~ else if문 이미지 만들기
		 * 속성 : if키워드, else if키워드, 조건식, 코드블록, 실행문
		 */
		
		// 시험 점수가 70점 이상이면, 합격을 출력하고, 그렇지 않으면 불합격을 출력한다.
		
//		int userScore = scanner.nextInt();
		
//		if (userScore >= 70) {
//			System.out.println("합격");
//		} 
//		if (userScore < 70) {
//			System.out.println("불합격");
//		}
		
		
//		if (userScore >= 70) {
//			System.out.println("합격");
//		} else {
//			System.out.println("불합격");
//		}
		
		
//		String result = userScore >= ? "합격" : "불합격";
//		System.out.println("result : " + result);
		
		// --------------------------------------------------------------------------
		
		/*
		 * 시험점수가 90점 이상이면 'A',
		 * 90점 미만에서 80점 이상이면 'B',
		 * 80점 미만에서 70점 이상이면 'C',
		 * 70점 미만에서 60점 이상이면 'D',
		 * 60점 미만이면 'F'
		 */
		
//		int studentScore = scanner.nextInt();
//		if (studentScore >= 90) {
//			System.out.println("A학점");
//		
//		} else if (studentScore >= 80) {
//			System.out.println("B학점");
//		
//		} else if (studentScore >= 70) {
//			System.out.println("C학점");
//		
//		} else if (studentScore >= 60) {
//			System.out.println("D학점");
//		
//		} else {
//			System.out.println("F학점");
//		}
		
//		int studentScore = scanner.nextInt();
//		if (studentScore >= 90) {
//			System.out.println("A학점");
//
//		} else if (studentScore >= 60 && studentScore < 70) {
//			System.out.println("D학점");
//			
//		} else if (studentScore >= 70 && studentScore < 80) {
//			System.out.println("C학점");
//		
//		} else if (studentScore >= 80 && studentScore < 90) {
//			System.out.println("B학점");
//		
//		} else {
//			System.out.println("F학점");
//		}
		
		// --------------------------------------------------------------------------
		
		/*
		 * switch ~ case문
		 * if ~ else if문과 비슷하게 다중 비교를 할 수 있다.
		 * 하지만, if ~ else if문과 동일하지는 않다.
		 * 
		 * switch(조건식) {
		 *   case 값:
		 *     실행문
		 *     break;
		 * }
		 * 
		 * switch ~ case문 이미지 만들기
		 * 간단한 부연설명을 붙이는 식으로
		 */
		
		// 메뉴 : 1.절전모드   2.시스템 종료   3.다시시작   4.잠금
//		System.out.println("1.절전모드   2.시스템 종료   3.다시시작   4.잠금");
//		
//		int selectNumber = scanner.nextInt();
//		
//		switch (selectNumber) {
//		case 1:
//			System.out.println("절전모드 중...");
//			break;
//			
//		case 2:
//			System.out.println("시스템 종료 중...");
//			break;
//			
//		case 3:
//			System.out.println("다시시작 중...");
//			break;
//			
//		case 4:
//			System.out.println("잠금 중...");
//			break;
//			
//		default:
//			System.out.println("잘못된 입력입니다.");
//			break;
//		}
		
		/*
		 * case의 경우, 중복으로도 사용이 가능하다
		 * case 4:
		 * case 5:
		 * 		System.out.println("잠금 중...");
				break;
		 */
		
		final int CASE1 = 1;
		final int CASE2 = 2;
		final int CASE3 = 3;
		final int CASE4 = 4;
		final int CASE5 = 5;
		
//		int case1 = 1;
		
//		System.out.println("1.절전모드   2.시스템 종료   3.다시시작   4.잠금");
//		
//		int selectNumber = scanner.nextInt();
//		
//		switch (selectNumber) {
//		case CASE1:
//			System.out.println("절전모드 중...");
//			break;
//			
//		case CASE2:
//			System.out.println("시스템 종료 중...");
//			break;
//			
//		case CASE3:
//			System.out.println("다시시작 중...");
//			break;
//			
//		case CASE4:
//		case CASE5:
//			System.out.println("잠금 중...");
//			break;
//			
//		default:
//			System.out.println("잘못된 입력입니다.");
//			break;
//		}
		
		// --------------------------------------------------------------------------
		
		// break : 선택사항
		
		
		System.out.println("고객등급 입력 : ");
		/*
		 * normal : 문자 50개 무료/월
		 * vip : normal + 영화권 1매/월
		 * vvip : vip + 해외여행 1회/년
		 */
		
		final String NORMAL = "normal";
		final String VIP = "vip";
		final String VVIP = "vvip";
		
		String userGrade = scanner.nextLine();
		
		switch (userGrade) {
		case VVIP:
			System.out.println("해외여행 1회/년");
//			System.out.println("영화권 1매/월");
//			System.out.println("문자 50개 무료/월");
			
		case VIP:
			System.out.println("영화권 1매/월");
//			System.out.println("문자 50개 무료/월");
		
		case NORMAL:
			System.out.println("문자 50개 무료/월");
			break;
			
		}
		
		// break가 없다면, 순서를 잘맞춰야 논리적인 오류없이 조건문을 실행가능하다.
	
		
		scanner.close();
		
	}

}
