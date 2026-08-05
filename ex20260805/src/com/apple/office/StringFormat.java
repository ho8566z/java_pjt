package com.apple.office;

import java.util.Scanner;

public class StringFormat {

	public static void main(String[] args) {
		
		/*
		 * 1. 형식 문자열 출력
		 * 1-1. String.out.printf();
		 */
		
//		String name = "Mr. Lee";
//		System.out.println("name : " + name);	// name : Mr. Lee <-사용률 낮음
//		System.out.printf("name : %s\n", name);	// name : Mr. Lee <- 사용률 높음
//		
//		System.out.printf("name : %s", name);	// name : Mr. Lee
//		System.out.printf("name : %s", name);	// name : Mr. Leename : Mr. Lee
		
		// %s -> 지정자
		
		/*
		 * 지정자 종료
		 * 1. %d 		: 정수형 출력		많이사용
		 * 2. %f		: 문자형 출력		많이사용
		 * 3. %c		: 논리형 출력		많이사용
		 * 4. %b		: 논리형 출력		많이사용
		 * 5. %o		: 8진수형 출력		사용않음
		 * 6. %x		: 16진수형 출력		사용않음
		 * 7. %n 		: 개행 == \n		\n사용
		 * 8. %x		: 문자열형 출력		많이사용ㄴ
		 */
		
//		System.out.printf("이름 : %s%n", "Mr. Lee");		// 이름 : Mr. Lee
//		System.out.printf("성구분 : %c%n", 'M');			// 성구분 : M
//		System.out.printf("나이 : %d%n", 26);				// 나이 : 26
//		System.out.printf("신장 : %f%n", 180.0);			// 신장 : 180.000000
//		System.out.printf("체중 : %f%n", 86.2);			// 체중 : 86.200000
//		System.out.printf("결혼 : %b%n", false);			// 결혼 : false
//		
//		System.out.printf("10진수 %d > 8진수 %o\n", 123, 123);		// 10진수 123 > 8진수 173
//		// 10진수 vs 8진수 이미지 참조
//		
//		System.out.printf("10진수 %d > 8진수 %x\n", 123, 123);		// 10진수 123 > 8진수 7b
//		// 10진수 vs 8진수_2 이미지 참조
//		
//		
//		// 키와 몸무게는 180cm, 86.2kg이고, 결혼은 false이다.
//		System.out.printf("키와 몸무게는 %dcm, %fkg이고, 결혼은 %b이다.", 180, 86.2, false);
//		
//		// 키와 몸무게는 180cm, 86.200000kg이고, 결혼은 false이다.
		
		// ---------------------------------------------------------------
		
		/*
		 * 1-2. 지정자 옵션 지정하기
		 * 1-2-1. 소수점 아래 자리수를 지정하기
		 */
		
//		float rate = 3.141592f;
//		System.out.printf("rate : %f \n", rate);	// rate : 3.141592
//		
//		System.out.printf("rate : %.2f \n", rate);	// rate : 3.14
//		System.out.printf("rate : %.4f \n", rate);	// rate : 3.1416 
//		
//		/*
//		 * 1-2-2. 전체 출력 자리수를 지정하고, 오른쪽으로 정렬한다.
//		 */
//		
//		int num1 = 1;
//		int num2 = 12;
//		int num3 = 123;
//		
//		// 왼쪽 정렬
//		System.out.printf("num1 : %d\n", num1);		// num1 : 1
//		System.out.printf("num2 : %d\n", num2);		// num2 : 12
//		System.out.printf("num3 : %d\n", num3);		// num3 : 123
//		
//		// 오른쪽 정렬
//		System.out.printf("num1 : %3d\n", num1);	// num1 :   1
//		System.out.printf("num2 : %3d\n", num2);	// num2 :  12
//		System.out.printf("num3 : %3d\n", num3);	// num3 : 123
//
//		// 왼쪽 정렬 + 5칸 공백
//		System.out.printf("num1 : %-5d\n", num1);	// num1 : 1    '
//		System.out.printf("num2 : %-5d\n", num2);	// num2 : 12   '
//		System.out.printf("num3 : %-5d\n", num3);	// num3 : 123  '
//
//		// 오른쪽 정렬 + 공백은 '0'으로
//		System.out.printf("num1 : %05d\n", num1);	// num1 : 00001
//		System.out.printf("num2 : %05d\n", num2);	// num2 : 00012
//		System.out.printf("num3 : %05d\n", num3);	// num3 : 00123
		
		
//		double dou = 123.456789;
//		System.out.printf("dou : %10.3f\n", dou);
//		// dou : '   123.457' : ''사이가 10칸, 소수점은 3자리까지
//		
//		System.out.printf("dou : %010.3f\n", dou);
//		// dou : 000123.457
//		
//		System.out.printf("dou : %-10.3f\n", dou);
//		// dou : 123.457   '
//		
//		System.out.printf("dou : %-010.3f\n", dou);
//		// Exception in thread "main" java.util.IllegalFormatFlagsException: Flags = '-0'
//		// 왼쪽 정렬과 공백을 '0'으로 채우는 것은 불가능하다.
		
		
		// ---------------------------------------------------------------
		
		/*
		 * 2. 형식 문자열 반환하기
		 * 2-1. String.format() == javascript의 템플릿 문자열('')
		 */
		
//		String res;
//		
//		res = "abcdefg";
//		System.out.printf("res : %s\n", res);		// res : abcdefg
//		
//		String result = String.format("res : %s\n", res);
//		System.out.println(result);					// res : abcdefg
//		// String.format()에서 format은 데이터를 반환만 하고, 화면에 출력하지 않는다.
//		// C:\lyh\daily_log\notion_res -> 'String.format 반환x.png'참조
		
		Scanner scanner = new Scanner(System.in);
		
//		String inputData = scanner.next();					// HongGildong
//		System.out.println("inputData : " + inputData);		// inputData : HongGildong
		
//		String inputData = scanner.next();					// 홍 길동
//		System.out.println("inputData : " + inputData);		// inputData : 홍
		
		// scanner.nextChar(X) -> scanner.nextLine(O)
		
		scanner.nextLine();
		// 개행문자(\n, 엔터) 처리 문제 : nextInt()나 next() 뒤에 nextLine()을 쓰면, 
		// 앞서 입력하고 남은 엔터(\n)를 nextLine()이 곧바로 읽어버려 입력 단계를 건너뛰는(스킵되는) 현상이 발생
		
		// 해결법 : nextInt() 등과 nextLine()을 섞어 쓸 때는 사이에 빈 scanner.nextLine();을 
		// 넣어 버퍼의 엔터를 미리 비워주어야 한다.
		
//		System.out.print("나이 : ");
//		int age = scanner.nextInt();
//		
//		System.out.println("age : " + age);
//		
//		System.out.print("이름 : ");
//		String userName = scanner.nextLine();
//		
//		System.out.println("userName : " + userName);
//		// C:\lyh\daily_log\notion_res -> 'nextLine 버그.png'참조
		
		System.out.print("나이 : ");
		int age = scanner.nextInt();
		
		System.out.println("age : " + age);
		
		System.out.print("이름 : ");
		scanner.nextLine();
		String userName = scanner.nextLine();
		
		System.out.println("userName : " + userName);
		// C:\lyh\daily_log\notion_res -> 'nextLine 버그수정.png'참조
		
		scanner.close();
		
		// ---------------------------------------------------------------
		

		
	}
	
}
