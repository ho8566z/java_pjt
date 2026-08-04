package com.office.example;

public class DataType {

	public static void main(String[] args) {
		System.out.println("This class is DataType.");
		
		/*
		 * 데이터 타입(Data Type) == 자료형
		 * 데이터 타입이란, 메모리에 데이터가 저장될 때 데이터에 따라서 할당 받는 메모리 크기가 다르게 된다.
		 * 예를 들어 정수는 1~8byte, 실수는 4~8byte의 크기가 할당된다.
		 * 
		 * [참고]
		 * 메모리 단위
		 * 1bit(비트)				메모리 최소단위
		 * 8bit(비트)				1byte(바이트)
		 * 1024byte(바이트)		1KB(키로 바이트)
		 * 1024KB(키로 바이트)		1MB(메가 바이트)
		 * 1024MB(메가 바이트)		1GB(기가 바이트)
		 * 1024GB(기가 바이트)		1TB(테라 바이트)
		 * 
		 * 이렇게 데이터에 따라서 메모리 크기를 달리하는 이유는?
		 * 메모리를 효율적으로 사용하기 위함
		 * 
		 * javascript의 경우
		 * let num = 10;
		 * let에서 1byte 정도 메모리 할당, num에서 메모리에 이름을 붙이고, =에서 메모리를 청소, 10에서 메모리를 확장/축소시킴 
		 * -> 다이나믹(동적) 캐스팅(타이핑) (Dynamic Casting(Typing))
		 * 
		 * java의 경우
		 * int num = 10;
		 * int에서 데이터 타입인 int에 따라 4byte를 할당, num에서 메모리에 이름을 붙이고, =에서 메모리를 청소, 10에서 데이터를 할당 
		 * -> 스태틱(정적) 캐스팅(타이핑) (Static Casting(Typing))
		 * 
		 * [참고]
		 * 데이터 타입의 진정한 의미
           위에서는 데이터 타입을 가급적 쉽게 설명하기 위해서 메모리 크기에 따른 데이터 구분이라고 했는데요, 
           사실 데이터 타입은 메모리 크기뿐만 아니라 데이터의 저장 방식, 속성, 관련 명령 등에 따른 데이터 구분입니다. 
           하지만, 지금 이 모든 것을 학습하는 불가능하고 향후 프로그래밍 언어를 학습하다 보면 자연스럽게 알 수 있는 내용입니다
		 */
		
		// ---------------------------------------------------------------------------------------
		
		/*
		 * 정수 데이터 타입 == 정수형
		 * byte		1byte(8bit)	-> -128 ~ 127
		 * short	2byte		-> -32,768 ~ 32,767
		 * int		4byte		-> -2,147,483,648 ~ 2,147,483,647
		 * long		8byte		-> -9,223,372,036,854,775,808 ~ 9,223,372,036,854,775,807
		 */
		
		// byte
		byte numByte = -128;
		System.out.println("numByte " + numByte);	// numByte -128
		
		numByte = 127;
		System.out.println("numByte " + numByte);	// numByte 127
		
//		numByte = 129;
//		System.out.println("numByte " + numByte);	// Type mismatch: cannot convert from int to byte
		
		// short
		short numShort = -32768;
		System.out.println("numShort " + numShort); 	// numShort -32768
		
		numShort = 32767;
		System.out.println("numShort " + numShort);		// numShort 32767
		
		// int
		int numInt = -2147483648;
		System.out.println("numInt " + numInt); 	// numInt -2147483648
		
		numInt = 2147483647;
		System.out.println("numInt " + numInt); 	// numInt 2147483647
		
		// long
		long numLong = -9223372036854775808L;		// long만 숫자 뒤에 L(꼭 대문자)를 입력해야 된다.
		System.out.println("numLong " + numLong);	// numLong -9223372036854775808
		
		numLong = 9223372036854775807L;
		System.out.println("numLong " + numLong);	// numLong 9223372036854775807
		
		
		// ---------------------------------------------------------------------------------------
		
		/*
		 * 실수 데이터 타입(부동소수)
		 * float	4byte	-> 범위 (대략적)
		 * 		양수 범위: $1.4 \times 10^{-45} \sim 3.4 \times 10^{38}$ (1.4E-45 ~ 3.4028235E38)
		 * 		음수 범위: $-3.4 \times 10^{38} \sim -1.4 \times 10^{-45}$
		 * 		정밀도 (유효 자릿수): 소수점 이하 약 6~7자리
		 * double	8byte	-> 범위 (대략적)
		 * 		양수 범위: $4.9 \times 10^{-324} \sim 1.7 \times 10^{308}$ (4.9E-324 ~ 1.7976931348623157E308)
		 * 		음수 범위: $-1.7 \times 10^{308} \sim -4.9 \times 10^{-324}$
		 * 		정밀도 (유효 자릿수): 소수점 이하 약 15~16자리
		 */
		
		// float
		float numFloat = 3.14f;
		System.out.println("numFloat " + numFloat);		// numFloat 3.14
		
		// double
		double numDouble = 3.14;
		System.out.println("numDouble " + numDouble);	// numDouble 3.14
		
		float num1 = 3.14159265358979323846264338327950288f;
	    double num2 = 3.14159265358979323846264338327950288d;
	    
	    System.out.println("num1 " + num1);		// num1 3.1415927
	    System.out.println("num2 " + num2);		// num2 3.141592653589793
	    
		/*
		 * float보다는 double을 사용하는게 정밀한 데이터 수치를 저장할 수 있기 때문에 double의 사용을 권장한다.
		 */
	    
	    
		// ---------------------------------------------------------------------------------------
		
		/*
		 * 논리 데이터 타입 == 논리형
		 * boolean	1byte	-> 0 or 1
		 */
	    
	    boolean flag = true;
	    System.out.println("flag " + flag);		// flag true
	    
	    flag = false;
	    System.out.println("flag " + flag);		// flag false
	    
	    
		// ---------------------------------------------------------------------------------------
		
		/*
		 * 문자 데이터 타입 == 챠(char)
		 * java에서는 python이나 javascript와 달리 문자와 문자열을 엄격히 구분한다.
		 * char 	2byte	-> 0 ~ 65,535
		 */
	    
	    char ch = 'a';
	    System.out.println("ch " + ch);		// ch a
	    
	    ch = 'b';
	    System.out.println("ch " + ch);		// ch b
	    
	    /*
	     * 빈문자(empty), 공백문자(space)
	     * 
	     * 빈문자 : 아무것도 없는 문자		--> ''
	     * 공백문자 : 공백이 있는 문자		--> ' '(무조건 공백은 1개만 있어야 공백문자이다.)
	     */
	    
//	    char chEmpty = ''; 		// 사용X
	    char chSpace = ' ';		// O
	    
	    System.out.println("chSpace " + chSpace);		// 'chSpace  '
	    
	    /*
	     * 유니코드란?
	     * 문자가 메모리에 저장될 때 문자 자체로 저장되는 것이 아니고 유니코드로 저장된다
	     * 유니코드란, 영어, 한글, 중국어 등의 전 세계의 모든 문자를 정수로 나타낸 코드로 컴퓨터로
	     * 문자를 다룰 수 없기 때문에 문자를 정수로 변환해서 사용한다.
	     */
	    
	    char char1 = 'A';
	    System.out.println("char1 " + char1);		// char1 A
	    
	    int unicode1 = char1;
	    System.out.println("unicode1 " + unicode1);		// unicode1 65
	    
	    char char2 = 'ㄱ';
	    System.out.println("char2 " + char2);		// char2 ㄱ

	    int unicode2 = char2;
	    System.out.println("unicode2 " + unicode2);		// unicode2 12593
	    
	    char char3 = '나';
	    int unicode3 = char3;
	    System.out.println("unicode3 " + unicode3);		// unicode3 45208
	    
	    char char4 = 65;
	    System.out.println("char4 " + char4);		// char4 A

	    
	    
	    
	    // ---------------------------------------------------------------------------------------
		
 		/*
 		 * 문자열 데이터 타입
 		 * String 	할당된 메모리 공간을 지정할 수 없다.
 		 */
	    
	    String str1 = "Hello World";
	    System.out.println("str1 " + str1);		// str1 Hello World
	    
	    String str2 = "H";
	    System.out.println("str2 " + str2);		// str2 H
	    
	    String str3 = " ";
	    System.out.println("str3 " + str3);		// 'str3  '
	    
	    String str4 = "GOOD";		// str4 GOOD [ 'G', 'O', 'O', 'D' ]
	    System.out.println("str4 " + str4);		// str4 GOOD
	    
	    /*
	     * 문자열: String의 경우, '기초 데이터 타입'인 위의 다른 데이터 타입과 다른 '레퍼런스 타입'이다.
	     */
	    
	    
	    // ---------------------------------------------------------------------------------------
	    
	    /* GC란?
        * Garbage Collection(가비지 컬렉션)란, 메모리에서 더 이상 사용되지 않는 객체를 자동으로 제거하는 기능을 말한다.
        * String 형을 쓰면 속도가 느려지는 이유는? String 형은 불변(immutable)하기 때문에 새로운 문자열을
        * 생성할 때마다 새로운 메모리 공간을 할당하고 이전 문자열은 가비지 컬렉션에 의해 제거되기 때문에 속도가 느려진다.
        */
	    
	    
	    // ---------------------------------------------------------------------------------------
	    
	    /*
	     * 랩퍼(Wrapper) 클래스
	     * (기초 데이터 타입에 랩핑해서 객체 데이터 타입으로 변환한 것)
	     * java는 '객체지향언어'이다. 객체를 적극적으로 이용하자
	     * 즉, 객체로 시작해서 객체로 끝내라
	     * 
	     * int num = 10;	// 객체X
	     * 
	     * 기초 데이터 타입 VS 객체 데이터(레퍼런스) 타입
	     * 
	     * int --> Integer
	     */
	    
	    int numS = 10;							// 기초 데이터 타입
	    System.out.println("numS " + numS);		// numS 10
	    
	    Integer numSS = Integer.valueOf(100);	// 객체 데이터 타입
	    System.out.println("numSS " + numSS);	// numSS 100
	    /*
	     * 묵시적 변환 (Implicit Conversion)
	     * : 자바 컴파일러가 내부적으로 객체의 toString() 메서드를 자동으로 호출한다.
	     */
	    
	    System.out.println("numSS : " + numSS.toString());		// numSS : 100
	    /*
	     * 명시적 호출 (Explicit Call)
	     * : 개발자가 코드에 직접 .toString()을 작성하여 Integer 객체가 가진 
	     * 문자열 반환 기능을 명확하게 호출한다.
	     */
	    
	    // 코드가 더 간결하고 가독성이 좋을 뿐만 아니라, 변수가 null일 때 2번과 달리 
	    // NullPointerException(NPE) 에러를 방지할 수 있기 때문이다.
	    
	    System.out.println("최소값 : " + Integer.MIN_VALUE);		// 최소값 : -2147483648
	    System.out.println("최대값 : " + Integer.MAX_VALUE);		// 최대값 : 2147483647
	    
	    
	}
	
}
