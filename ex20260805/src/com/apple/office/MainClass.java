package com.apple.office;

import java.util.Scanner;

public class MainClass {
	
	public static void main(String[] args) {
		
//		/*
//		 * 데이터 출력
//		 */
//		
//		System.out.println("안녕하세요.");		// 출력
//		
//		int num = 100;
//		System.out.println("num : " + num);	// num : 100
//		
//		System.out.println("Hello " + num);	// string + int = "string" -> Hello 100
		
		// ---------------------------------------------------------------
//		System.out.println("num " + num);
//		System.out.println("num " + num);
		
//		num 100
//		num 100
		
		// ---------------------------------------------------------------
//		System.out.print("num " + num);
//		System.out.print("num " + num);
		
//		num 100num 100
		
		// ---------------------------------------------------------------
//		System.out.print("num \t\n" + num + "\n");
//		System.out.print("num " + num);
		
//		100
//		num 100
		
		// ---------------------------------------------------------------
		
		/*
		 * 자주 쓰는 특수문자들
		 * 1. \n : 개행
		 * 2. \t : 탭
		 * 3. \' : 작은 따음표(')
		 * 4. \" : 큰 따음표(")
		 * 5. \\ : 역 슬래시(/)
		 */
		
//		System.out.println("이름\t학번\n");				// 이름	학번
//		System.out.println("Mr. H\t2020_000123\n");		// Mr. H	2020_000123
//		System.out.println("Mr. K\t2020_000124\n");		// Mr. K	2020_000124
		
		// 어머님께서는 "밥 먹고 설거지 해놔라"라고 하셨다.
//		System.out.println("어머님께서는 \"밥 먹고 설거지 해놔라\"라고 하셨다.\n");
		// 어머님께서는 "밥 먹고 설거지 해놔라"라고 하셨다.
		
		// ///////////////////////////\
		// //// 2026-08-05 ////\
		// ///////////////////////////\
//		System.out.println("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\n");
//		System.out.println("\\\\ 2026-08-05 \\\\n");
//		System.out.println("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\n");
//		
//		\\\\\\\\\\\\\\\\n
//		\\ 2026-08-05 \\n
//		\\\\\\\\\\\\\\\\n
		
		// ---------------------------------------------------------------
		// ---------------------------------------------------------------
		
		/*
		 * 데이터 입력
		 * 데이터를 출력 System.out.println();
		 * 데이터를 입력 System.in.read(); => Scanner
		 */
		
		Scanner scanner = new Scanner(System.in);
//		
//		String str = scanner.nextLine();
//		
//		System.out.println("str : " + str);
		
//		Hello, World!
//		str : Hello, World!

		// ---------------------------------------------------------------
		
		/*
		 * Scanner에서 제공되는 메서드들은 무엇이 있는지?
		 * 
		 * nextByte()		: 정수(byte type) 입력
		 * nxstInt()		: 정수(Int type) 입력
		 * nextLong()		: 정수(Long type) 입력
		 * nextFloat()		: 실수(Float type) 입력
		 * nextDouble()		: 실수(Double type) 입력
		 * nextLine()		: 문자열(String type) 입력
		 * nextBoolean()	: 논리(boolean type) 입력
		 */

//		Byte byteNum = scanner.nextByte();
//		System.out.println("byteNum : " + byteNum);
//		
//		int intNum = scanner.nextInt();
//		System.out.println("intNum : " + intNum);
//		
//		long longNum = scanner.nextLong();
//		System.out.println("longNum : " + longNum);
//		
//		float floatNum = scanner.nextFloat();
//		System.out.println("floatNum : " + floatNum);
//
//		boolean booleanData = scanner.nextBoolean();
//		System.out.println("booleanData : " + booleanData);

//		10
//		byteNum : 10
//		100
//		intNum : 100
//		1000
//		longNum : 1000
//		3.14
//		floatNum : 3.14
//		true
//		booleanData : true
		
		// ---------------------------------------------------------------
		
		scanner.close();
//		"scanner.close();"를 선언하지 않으면, 자원이 게속 새어나가는 중으로 문제가 발생될 수 있다.
		
		
	}
	
}
