package com.office.example;

import java.util.Arrays;

public class ArrayClass {

	public static void main(String[] args) {
		
		/*
		 * 변수는 배열의 첫번째 주소값 담는다 <- ["이미지 만들기"]
		 * int의 경우 하나의 데이터가 4바이트이기 때문에 1개의 데이터 마다 4칸씩으로 만들기
		 * 메모리 주소 또한 4칸씩 떨어트려서 만들기
		 * 
		 * int[] nums = {10, 20, 30};
		 * nums[0] // 10 메모리 주소: 101 -> 101 + (0 * 4byte) -> 101
		 * nums[1] // 20 메모리 주소: 105 -> 101 + (1 * 4byte) -> 105
		 * nums[2] // 30 메모리 주소: 109 -> 101 + (2 * 4byte) -> 109
		 * 
		 * 무조건 인덱스 0번부터 시작해 움직일것 -> 인덱스 2번의 경우 : 2 * 4byte = 8칸 뒤
		 */
		
//		int[] nums = new int[5];
//		System.out.println("nums[0] : " + nums[0]);		// nums[0] : 0
//		System.out.println("nums[1] : " + nums[1]);		// nums[1] : 0
//		System.out.println("nums[2] : " + nums[2]);		// nums[2] : 0
//		System.out.println("nums[3] : " + nums[3]);		// nums[3] : 0
//		System.out.println("nums[4] : " + nums[4]);		// nums[4] : 0
//
//		for (int num : nums) {
//			System.out.println("num : " + num);
//		}
////		num : 0
////		num : 0
////		num : 0
////		num : 0
////		num : 0
//		
//		
//		float[] floats = new float[3];
//		for (float f : floats ) {
//			System.out.println("f : " + f);
//		}
////		f : 0.0
////		f : 0.0
////		f : 0.0
//		
//		
//		boolean[] flags = new boolean[3];
//		for (boolean b : flags) {
//			System.out.println("b : " + b);
//		}
////		b : false
////		b : false
////		b : false
		
		//----------------------------------------------------------------
		
		// 배열 복사
		
//		// 1 변수복사
//		int number1 = 10;
//		int number2 = 20;
//		
//		System.out.println("number1 : " + number1);		// number1 : 10
//		System.out.println("number2 : " + number2);		// number2 : 20
//		
//		number2 = number1;
//		System.out.println("number2 : " + number2);		// number2 : 10
//		
//		// 2 배열복사
//		int[] numbers1 = {10, 20, 30};		// [10	20	30]
//		int[] numbers2 = {100, 200, 300};	// [100	200	300]
//		
//		System.out.println("numbers1 : " + Arrays.toString(numbers1));	// numbers1 : [10, 20, 30]
//		System.out.println("numbers2 : " + Arrays.toString(numbers2));	// numbers2 : [100, 200, 300]
//		
//		numbers2 = numbers1;
//		System.out.println("numbers2 : " + Arrays.toString(numbers2));	// numbers2 : [10, 20, 30]
//		
//		numbers2[2] = 90;
//		System.out.println("numbers1 : " + Arrays.toString(numbers1));	// numbers1 : [10, 20, 90]
//		System.out.println("numbers2 : " + Arrays.toString(numbers2));	// numbers2 : [10, 20, 90]
		
		//----------------------------------------------------------------
		
		/*
		 * 배열 삭제 <- ["이미지 만들기"]
		 * 참조가 사라진 배열은 바로 사라지지는 않는다.
		 * 더 이상 참조하는 변수가 없는 배열은 가비지 컬렉션(Garbage Collection, GC)의 
		 * 대상이 되며, GC가 실행되는 시점에 JVM이 자동으로 메모리에서 제거한다.
		 * 주의 : 한번 끊어진 배열은 복구는 불가능하다.
		 */
//		int[] scores = {80, 90, 100};
//		System.out.println("scores : " + Arrays.toString(scores));		// scores : [80, 90, 100]
//		System.out.println("메모리 주소 : " + scores);		// 메모리 주소 : [I@6fdb1f78
//		
//		scores = null;
//		System.gc(); // 의미 없는 코드 : Garbage Collection의 강제실행은 불가능하기 때문이다.
//		
//		System.out.println("메모리 주소 : " + scores);		// 메모리 주소 : null
		
		
		/*
		 * java에서 배열의 길이를 변경할 수 없다 <- ["이미지 만들기"]
		 * 최초 생성될때 길이를 설정하면, 이후에 길이를 변경할 수 없다
		 * 때문에 배열의 길이와 다른 길이의 데이터를 넣는다면, 인덱스 오류가 발생한다.
		 */
		
		//----------------------------------------------------------------
		
		
	}
	
}
