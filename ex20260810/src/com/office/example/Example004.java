package com.office.example;

import java.util.ArrayList;
import java.util.Arrays;

public class Example004 {

	public static void main(String[] args) {
		
		// ArrayList, HashMap에 대해 알아보자 	=> 컨테이너(Container) 자료형
		
		// ArrayList는 Array(배열)과 비슷하고, Array의 단점을 보완하기 위해 만들어진 클래스이다.
		// HashMap은 python의 딕셔너리({key, value})와 비슷하다.
		
		
		// ArrayList 사용방법
		ArrayList<Integer> nums = new ArrayList<Integer>();

		// ArrayList<E>에서 <E>는 데이터의 타입을 정의한다.
		
		nums.add(10);
		nums.add(20);
		nums.add(30);
		// add로 ArrayList에 데이터를 추가한 만큼, ArrayList의 방의 크기(개수)가 변화한다.
		
		// 크기 조회
		System.out.println(nums.size());		// 3
		
		// 데이터 조회(index[n]에 해당하는 데이터 조회)
		System.out.println(nums.get(0));		// 10
		System.out.println(nums.get(1));		// 20
		System.out.println(nums.get(2));		// 30
//		System.out.println(nums.get(3));
//		Exception in thread "main" java.lang.IndexOutOfBoundsException: Index 3 out of bounds for length 3
//				at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
//				at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
//				at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
//				at java.base/java.util.Objects.checkIndex(Objects.java:372)
//				at java.base/java.util.ArrayList.get(ArrayList.java:459)
//				at com.office.example.Example004.main(Example004.java:33)
		
		
		// 전체 데이터 조회
		for (int i = 0; i < nums.size(); i++) {
			System.out.println(nums.get(i));
		}
//		10
//		20
//		30
		
		
		// 데이터 삭제
		nums.remove(1);		// 20 삭제
		for (int i = 0; i < nums.size(); i++) {
			System.out.println(nums.get(i));
		}
//		10
//		30
		
		
		// 데이터 수정
		nums.set(1, 200);
		for (int i = 0; i < nums.size(); i++) {
			System.out.println(nums.get(i));
		}
//		10
//		200
		
		
		// 전체 데이터 삭제 : ArrayList 객체는 살려두고, 그 안의 정수 데이터만 전부 삭제
		nums.clear();
		System.out.println("nums.size() : " + nums.size());
		// nums.size() : 0
		
		
		// ArrayList 객체 제거 at 메모리
		System.out.println("nums : " + nums);	// nums : []
		nums = null;
		System.out.println("nums : " + nums);	// nums : null
		// ArrayList를 다시 생성하기 전까지는 ArrayList는 다시 사용할 수 없다.
		
		
	}
	
}
