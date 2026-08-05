package com.apple.office;

public class Operator02 {

	public static void main(String[] args) {
		
		/*
		 * 3. 비교 연산자
		 * >(크다), <(작다), >=(크거나 같다), <=(작거나 같다)
		 * ==(같다), !=(같지 않다)
		 */
		
		int num11 = 100;
		int num12 = 200;
		
		System.out.println("num11 > num12 : " + (num11 > num12));		// num11 > num12 : false
		System.out.println("num11 < num12 : " + (num11 < num12));		// num11 < num12 : true
		System.out.println("num11 >= num12 : " + (num11 >= num12));		// num11 >= num12 : false
		System.out.println("num11 <= num12 : " + (num11 <= num12));		// num11 <= num12 : true

		System.out.println("num11 == num12 : " + (num11 == num12));		// num11 == num12 : false
		System.out.println("num11 != num12 : " + (num11 != num12));		// num11 != num12 : true
		
		
		/*
		 * [참고]
		 * 실수 비교
		 * 실수는 정수와 달리 메모리에 저장될 때 약간의 오차가 있기 때문에 근사값을 저장하게 된다.
		 * 그나마 float보다는 double이 조금 더 정확하지만, 연산할때는 정수를 우선하자.
		 */
		
		float num13 = 0.1f;
		double num14 = 0.1;
		
		System.out.println("num13 > num14 : " + (num13 > num14));		// num13 > num14 : true
		System.out.println("num13 >= num14 : " + (num13 >= num14));		// num13 >= num14 : true
		System.out.println("num13 < num14 : " + (num13 < num14));		// num13 < num14 : false
		System.out.println("num13 <= num14 : " + (num13 <= num14));		// num13 <= num14 : false

		System.out.println("num13 == num14 : " + (num13 == num14));		// num13 == num14 : false
		System.out.println("num13 != num14 : " + (num13 != num14));		// num13 != num14 : true
		
		System.out.println("num13 : " + num13);		// num13 : 0.1
		System.out.println("num14 : " + num14);		// num14 : 0.1
		System.out.println("num13 + num14 : " + (num13 + num14));	// num13 + num14 : 0.20000000149011612
		
		
		/*
		 * 문자열 비교
		 */
		
		String str11 = "abc";
		String str12 = "abc";
		
		System.out.println("str11 == str12 : " + (str11 == str12));		// str11 == str12 : true
		System.out.println("str11 != str12 : " + (str11 != str12));		// str11 != str12 : false
		
		String str13 = new String("abc");
		String str14 = new String("abc");
		
		System.out.println("str13 == str14 : " + (str13 == str14));		// str13 == str14 : false
		System.out.println("str13 != str14 : " + (str13 != str14));		// str13 != str14 : true
		
		/*
		 * equals()
		 * Java에서 두 객체의 내용(값)이 같은지 비교하는 메서드
		 * 문자열 비교는 '==' 대신 'equals()'를 사용하는 것이 원칙이다.
		 */
		
		System.out.println("str11.equals(str12) : " + str11.equals(str12));	
		// str11.equals(str12) : true
		System.out.println("str13.equals(str14) : " + str13.equals(str14));	
		// str13.equals(str14) : true
		
		
		String str21 = new String("Hello");
		String str22 = new String("Hello");
		
		System.out.println("str21.equals(str22) : " + (str21.equals(str22)));
		// str21.equals(str22) : true
		
		str21 = null;
		
//		System.out.println("str21.equals(str22) : " + (str21.equals(str22)));
		/*
		 * Exception in thread "main" java.lang.NullPointerException
				at com.apple.office.Operator02.main(Operator02.java:84)
		 */
		
		if (str21 != null) {
			System.out.println("str21.equals(str22) : " + (str21.equals(str22)));
		}	
		// str21.equals(str22) : true
	}
	
}
