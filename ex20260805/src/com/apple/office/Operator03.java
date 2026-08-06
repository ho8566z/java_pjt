package com.apple.office;

public class Operator03 {
	
	public static void main(String[] args) {
		
		/*
		 * 논리 연산자
		 * &&(AND), ||(OR), !(NOT)
		 * A && B : A와 B가 모두 true인 경우, 결과값은 true이다.
		 * A || B : A또는 B 중 하나라도 true인 경우, 결과값은 true이다.
		 * !A : A의 현재상태를 부정한다.
		 */
		
		int num1 = 10;
		int num2 = 20;
		int num3 = 30;
		
		boolean result = false;
		
		result = (num1 < num3) && (num2 < num3);		// true && true -> true
		System.out.println("result : " + result);		// result : true
		
		result = (num1 > num3) && (num2 < num3);		//false && true -> false
		System.out.println("result : " + result);		// result : false
		
		result = (num1 > num3) && (num2 > num3);		//false && false -> false
		System.out.println("result : " + result);		// result : false
		
		
		result = (num1 < num2) && (num2 < num3) && (num3 > num1);
		// true && true -> true
						// true && true -> true
		System.out.println("result : " + result);		// result : true
		
		// --------------------------------------------------------------------------
		
		result = (num1 < num3) || (num2 < num3);		// true || true -> true
		System.out.println("result : " + result);		// result : true
		
		result = (num1 > num3) || (num2 < num3);		// false || true -> true
		System.out.println("result : " + result);		// result : true
		
		result = (num1 > num3) || (num2 > num3);		// false || false -> false
		System.out.println("result : " + result);		// result : false
		
		// --------------------------------------------------------------------------
		
		result = (num1 < num2);			// true
		System.out.println("result : " + result);		// result : true
		
		result = !(num1 < num2);		// false
		System.out.println("result : " + result);		// result : false
		
		result = !!(num1 < num2);		// true
		System.out.println("result : " + result);		// result : true
		
		// --------------------------------------------------------------------------
		
		// 논리 연산자 우선순위 && > ||
		
		int num11 = 10;
		int num12 = 20;
		int num13 = 30;
		result = (num11 < num13) || (num12 < num13) && (num11 > num13);
									// true && false -> false
					// true || false -> true
		// 연산자 우선순위에 따라 &&가 먼저 계산되고, ||이 계산되기 때문에 결과값이 true이다.
		System.out.println("result : " + result);		// result : true
		
		// --------------------------------------------------------------------------
		
		/*
		 * 조건식 연산자 == 삼항 연산자
		 * 조건식 ? x : y
		 */
		
		int passScore = 80;
		int myScore = 90;
		
		String passResult = (myScore >= passScore) ? "PASS" : "TRY AGAIN";
		System.out.println("passResult : " + passResult);		// passResult : PASS

		myScore = 70;
		passResult = (myScore >= passScore) ? "PASS" : "TRY AGAIN";
		System.out.println("passResult : " + passResult);		// passResult : TRY AGAIN
		
		
		if (myScore >= passScore) {
			passResult = "PASS";
		} else {
			passResult = "TRY AGAIN";
		}
		System.out.println("passResult : " + passResult);		// passResult : TRY AGAIN
		
		
	}

}
