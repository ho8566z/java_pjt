package com.apple.office;

public class Operator01 {
	
	public static void main(String[] args) {
		
		/*
		 * 1. 연산자 란?
		 * 각종 연산을 수행할 때, 사용하는 '기호'이다.
		 * 
		 * 연산자 종류
		 * -1 산술 연산자
		 * +, -, *, /, %, ++, --
		 * 
		 * -2 할당 연산자
		 * =, +=, -=, *=, /=
		 * 
		 * -3 비교 연산자
		 * ==, !=, >, <, >=, <=
		 * (java에서 '==='가 없는 이유 : 변수 앞에 데이터 타입을 명시하기 때문)
		 * (javascript : 10 == '10' : true -> 10 === '10')
		 * 
		 * -4 논리 연산자
		 * &&, ||, !
		 * 
		 * 표에 명시한 연산자 말고도 조건 연산자, 비트 연산자, 그리고 시프트 연산자와 
		 * 관련한 몇 가지 메서드가 있지만, 웹개발과는 몰라도 상관없다.
		 * 
		 * 
		 * num1 + num2
		 * 연산식 : 전체
		 * num1, num2 : 피연산자
		 * + : 연산자
		 * 
		 * // ---------------------------------------------------------------
		 * 2. 산술 연산자
		 * -1 숫자 덧셈(+)
		 * 숫자를 덧셈할 때 사용한다.
		 * 
		 * -2 문자 덧셈(+)
		 * 문자열을 연결할 때 사용한다.
		 */
		
		int num1 = 10;
		int num2 = 20;
		
		System.out.println("num1 + num2 : " + num1 + num2);		// num1 + num2 : 1020
		// 연산자 우선순위에 따라 10을 문자열에 더하고, 20을 덧붙이는 방식
		
		System.out.println("num1 + num2 : " + (num1 + num2));	// num1 + num2 : 30
		
		
		float num3 = 0.1f;
		float num4 = 0.2f;
		
		System.out.println("num3 + num4 : " + (num3 + num4));	// num3 + num4 : 0.3
		
		
		String str1 = "Hello ";
		String str2 = "Java.";
		
		System.out.println("str1 + str2 : " + str1 + str2);		// str1 + str2 : Hello Java.
		// 문자열의 경우, 연산자 우선순위에 영향을 받더라도, 결과는 같다.

		System.out.println("str1 + str2 : " + (str1 + str2));	// str1 + str2 : Hello Java.
		
		
		/*
		 * -3 숫자와 문자열 덧셈(+)
		 * 이런경우 숫자가 문자열화 된다. number to String
		 */
		
		System.out.println(10 + "Hello");	// 10Hello
		
		
		/*
		 * -4 문자 덧셈
		 * 문자 덧셈은 문자가 유니코드로 변경되어 문자 덧셈된다.
		 */
		
		System.out.println('A' + 'B');		// 65 + 66 = 131
		System.out.println('가' + '나');		// 44032 + 45208 = 89240
		
		char charA = 'A';
		char charB = 'B';
		int charInt = charA + charB;
		
		
		/*
		 * -5 숫자 뺄셈
		 * 수학에서의 숫자 뺄셈과 동일하다.
		 */
		
		System.out.println("10 - 20 : " + (10 - 20));			// 10 - 20 : -10
		System.out.println("0.1f - 0.2f : " + (0.1f - 0.2f));	// 0.1f - 0.2f : -0.1
		
		
		/*
		 * -6 문자 뺄셈
		 * 문자열 뺄셈은 불가능하다.
		 */
		
//		System.out.println("Hello" - "Java");
		/*
		 * Exception in thread "main" java.lang.Error: Unresolved compilation problems: 
				The operator - is undefined for the argument type(s) java.lang.String, java.lang.String
				The operator - is undefined for the argument type(s) java.lang.String, java.lang.String
				The operator - is undefined for the argument type(s) java.lang.String, java.lang.String
			
				at com.apple.office.Operator01.main(Operator01.java:103)
		 */
		
		
		/*
		 * -7 숫자와 문자열 뺄셈
		 * 숫자와 문자열 뺄셈은 불가능하다.
		 */
		
//		System.out.println(10 - "Java");
		/*
		 * Exception in thread "main" java.lang.Error: Unresolved compilation problems: 
				The operator - is undefined for the argument type(s) int, String
				The operator - is undefined for the argument type(s) java.lang.String, java.lang.String
				The operator - is undefined for the argument type(s) java.lang.String, java.lang.String
				
				at com.apple.office.Operator01.main(Operator01.java:117)
		 */
		

		/*
		 * -8 문자 뺄셈
		 * 문자 뺄셈은 문자가 유니코드로 변경되어 뺄셈 연산한다.
		 */
		
		System.out.println('A' - 'B');		// -1
		System.out.println('가' - '나');		// -1176
		
		
		/*
		 * -9 숫자 곱셈
		 * 수학에서의 곱셈과 동일하다.
		 */
		
		System.out.println(10 * 3);		// 30
		System.out.println(0.2f * 3);	// 0.6
		
		
		/*
		 * -10 숫자와 문자열 곱셈
		 * 불가능하다.
		 */
		
//		System.out.println(3 * "Hello");
//		System.out.println("Hello" * 3);
		/*
		 * Exception in thread "main" java.lang.Error: Unresolved compilation problems: 
				The operator * is undefined for the argument type(s) int, String
				The operator * is undefined for the argument type(s) String, int
			
				at com.apple.office.Operator01.main(Operator01.java:153)
		 */
		

		// at Python : "Hello" * 5 = HelloHelloHelloHelloHello
		
		
		/*
		 * -11 숫자 나눗셈
		 * 수학과 동일하다.
		 */
		
		System.out.println(10 / 20);			// 0.5(X) -> 0(O)
		// 10과 20은 모두 정수형 데이터이기 때문에 0.5가 아닌 0으로 하고, .5의 데이터를 버려서 데이터 손실이 발생한다.
		
		System.out.println((float)10 / 20);		// 0.5
		// float(실수형)은 정수형 데이터 타입보다 우선하기 때문에 결과 값이 0.5로 나타난다.
		
		System.out.println(10.0f / 20);			// 0.5
		// float의 경우와 동일하다.
		
		
		/*
		 * -12 문자 나눗셈
		 * 유니코드를 이용한 연산이 가능하다.
		 */
		
		System.out.println((float) 'A' / 'B');		// 0.9848485
		
		
		/*
		 * -13 0으로 나눗셈
		 * 세상의 어떵 수도 0으로 나눌 수느 없다.
		 */
		
//		System.out.println(10 / 0);
		/*
		 * Exception in thread "main" java.lang.ArithmeticException: / by zero
				at com.apple.office.Operator01.main(Operator01.java:195)
		 */
		
		
		/*
		 * -14 0을 어떤 수를 나눗셈
		 * 결과값은 무조건 0이다.
		 */
		
		System.out.println(0 / 100);		// 0
		
		
		/*
		 * -15 나머지 연산자
		 * 나눗셈한 결과에서 나머지만 구한다.
		 */
		
		System.out.println(10 % 3);		// 1
		System.out.println('A' % 'B');	// 65
		
		
		/*
		 * -16 산술 변환
		 * 피연산자들을 이용해서 연산이 자동으로 변환되는 것을 산술 변환이라고 한다.
		 */
		
		System.out.println(10 + 3.14f);		// 13.14 <- 정수 + 실수 = 실수
		
		
		// 피연산자의 데이터 터입이 int보다 작은 경우(int 미포함)
		// -> 데이터 타입을 int로 형변환한다
		
		// 피연산자의 데이터 터입이 int보다 큰 경우(int 포함)
		// 피연산자 중 큰 데이터 타입으로 형변환한다.
		
		// => 결국, 데이터 타입이 큰 쪽으로 형변환한다.
		
		
		/*
		 * -17 자동 증감 연산자
		 * 증감 연산자는 1을 증가시키거나 1을 감소시키는 연산자이다.
		 */
		
		int number = 10;	
		System.out.println("number : " + number);	// number : 10
		
		number = number + 1;
		System.out.println("number : " + number);	// number : 11
		
		// 자동 증감 연산자 - 적용
		number++;
		System.out.println("number : " + number);	// number : 12
		
		number--;
		System.out.println("number : " + number);	// number : 11		
		
		// at Python : number += 1
		
		
		/*
		 * -17 자동 증감 연산자를 사용할 때, 조심할 내용
		 * 전위 연산자, 후위 연산자
		 */
		
		int number2 = 10;
		int result2 = 0;
		
		result2 = number2++;		// 0 = 10++
		System.out.println("result2 : " + result2);		// result2 : 10
		System.out.println("number2 : " + number2);		// number2 : 11
		
		
		int number3 = 10;
		int result3 = 100;
		
		result3 = ++number3;		// 0 = 10++
		System.out.println("result3 : " + result3);		// result3 : 11
		System.out.println("number3 : " + number3);		// number3 : 11
		
		// 관련된 이미지 만들어서 삽입할 것
		
		// ---------------------------------------------------------------

		
	}

}
