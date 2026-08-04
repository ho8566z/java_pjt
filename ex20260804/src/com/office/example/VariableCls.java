package com.office.example;

public class VariableCls {
	
	// 변수
	/*
	 * 컴퓨터 프로그램에서 숫자, 문자 등과 같은 데이터를 저장하고 관리하는 방법에 대해서 학습한다.
	 * 모든 컴퓨터 프로그래밍 언어는 데이터를 효율적으로 관리하기 위한 다양한 방법을 가지고 있다.
	 * 그 중 변수를 이용한 데이터 관리는 데이터를 효율적으로 관람하기 위한 기초이다.
	 * 
	 * -------------- 노션 정리 : 중간 중간 그림을 삽입할 것 --------------
	 * 변수 선언, 변수 초기화 부분을 각각 정리해서 이미지 삽입하고, 4byte도 꼭 입력할 것
	 * ex) '데이터 메모리 변수선언'으로 검색
	 */
	
	public static void main(String[] args) {
		
		// python
		// num = 10
		
		// javascript
		// let num = 10
		
		// java
		// 데이터 타입(int) + 변수명(num) + 할당연산자(=) + 데이터(10) + 데이터 종결자(;)
		// 변수 선언부 : 데이터 타입 + 변수명
		// 변수 초기화 : 할당연산자 + 데이터 + 데이터 종결자
		int num = 10;
		
		/*
		 * '=' : 할당연산자
		 * 수학에서는 좌변과 우변의 값이 같다고 하지만, 프로그램에서는 우변의 값을 좌변에 할당(대입)하는 연산자입니다.
		 * 즉, '같다'라는 의미가 아니다.
		 */
		
		int nums;	// 변수 선언
		nums = 10;	// 변수 초기화
		
		System.out.println("nums is " + nums);		// nums is 10
		
		System.out.println(System.identityHashCode(nums));	// 1500056228
		
		// 메모리 주소를 변수로 선언
		int addForNums = System.identityHashCode(nums);
		
		System.out.println(addForNums);			// 1500056228
		
		/*
		 * java 응용 프로그램에서 메모리 주소를 꼭 알고 있어야 하는지?
		 * 절대 X, 이유는 java에서는 메모리를 직접 관리하지 않기 때문이다.
		 * 그럼, 메모리 관리는 누가 하는지?
		 * JVM이 대신 메모리를 관리한다
		 */
		
		/*
		 * 변수 이름 어떻게 작명하는지?
		 * 
		 * 1. 일반적으로 소문자로 작성한다.
		 * int money = 100;		-> O
		 * int Money = 100;		-> 적합X
		 * 
		 * 2. 변수명은 일반적으로 영문으로 한다.
		 * int myMoney = 100;	-> O
		 * int 나의돈 = 100;		-> 적합X
		 * 
		 * 3. 변수명은 데이터의 의미를 쉽게 파악할 수 있도록 만든다.
		 * int score = 100;		-> O
		 * string player = "홍길동"		-> 0
		 * string stage = "쉬움스테이지"	-> O
		 * 
		 * int s = 100;		-> 적합X
		 * string p1 = "홍길동";		-> 적합X
		 * string stg = "쉬움스테이지";	-> 적합X
		 * 
		 * 4. 2개 이상의 단어가 조합된 경우, 낙타(camel) 표기법을 사용한다.
		 * int myScore = 100;		-> 0
		 * int myTotalScore = 100;	-> 0
		 * 
		 * int myscore = 100;		-> 적합X
		 * int mytotalscore = 100;	-> 적합X
		 * 
		 * int my_score = 100;			-> 적합X
		 * int my_total_score = 100;	-> 적합X
		 * 
		 * 변수명에 ' '(공백)이나, '_', '$'를 제외한 특수문자는 사용하지 않는다.
		 * 
		 * 정리하면,
		 * 		변수명은 영문으로 하고, 첫 글자는 소문자로 한다.
		 *		2개 이상의 단어가 조합된 경우, 낙타 표기법을 따른다.
		 *		특수문자, 예약어 그리고 공백문자응 사용하지 않는다.
		 *		숫자는 사용해야 하는 경우, 중간과 끝에 사용한다.
		 */
		
		//--------------------------------------------------------
		
		/*
		 * 변수 데이터 변경
		 * 변수는 '변하는 수'를 뜻한다. 따라서 필요할 때, 언제든지 데이터를 변경할 수 있다.
		 * 변수의 데이터를 변결할때는 데이터 타입을 명시하지 않는다.
		 */
		
		int score = 90;
		System.out.println("score: " + score); 		// 90
		
		score = 100;
		System.out.println("score: " + score); 		// 100

		
		/*
		 * 데이터 복사
		 * 변수의 데이터를 복사할 수 있다.
		 * int number1 = 10;
		 * int number2;
		 * System.out.println("number1: " + number1);	// 10
		 * System.out.println("number2: " + number2);	// 0
		 * 
		 * number2 = number1; 	// 데이터 복사
		 * System.out.println("number1: " + number1);	// 10
		 * System.out.println("number2: " + number2);	// 10
		 */
		
		int number1 = 10;
		int number2;
		System.out.println("number1: " + number1);	// 10
//		System.out.println("number2: " + number2);	// 0
		/*
		Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
		The local variable number2 may not have been initialized

		at com.office.example.VariableCls.main(VariableCls.java:125)
		 */
		
		number2 = number1; 	// 데이터 복사
		System.out.println("number1: " + number1);	// 10
		System.out.println("number2: " + number2);	// 10
		
		
		/*
		 * 변수를 프로그램에서 사용하는 이유?
		 * '데이터'를 "재사용"을 하기 위해서
		 * 
		 * 함수는 '기능'을 재사용하기 위함
		 */
		
		System.out.println(10);		// 10
		System.out.println(10);		// 10
		System.out.println(10);		// 10
		
		int numA = 10;
		System.out.println("numA is " + numA);		// numA is 10
		System.out.println("numA is " + numA);		// numA is 10
		
		numA = 20;
		System.out.println("numA is " + numA);		// numA is 20
		System.out.println("numA is " + numA);		// numA is 20
		
	}

}
