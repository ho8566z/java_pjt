package com.office.example;

import java.util.Arrays;

/**
 * Cat 객체의 필드 사용과 static 메서드 호출 방법을 비교하는 실습 클래스.
 * static 은 객체 없이 호출할 수 있지만 많이 쓰면 객체지향의 장점이 줄어든다.
 */
public class Example01 {
	
	public static void main(String[] args) {
		
		Cat cat = new Cat();
		
		cat.bread = "페르시안 고양이";
		cat.color = "흰색";
		
		System.out.println("cat.bread : " + cat.bread);		// cat.bread : 페르시안 고양이
		System.out.println("cat.color : " + cat.color);		// cat.color : 흰색
		System.out.println("cat.age : " + cat.age);			// cat.age : 10
		
		cat.eat();
		
//		cat.eatStatic();
		
		Cat.eatStatic();
		
		
		int[] nums = {10, 20, 30};
		// Arrays arrays = new Arrays()
		// arrays.toString();
		System.out.println(Arrays.toString(nums));
		
		// static은 객체를 생성하지 않고도, 메서드를 사용할 수 있다.
		// static을 필요 이상으로 많이 사용하면 객체지향 설계의 장점을 잃게 된다.
		// static은 객체를 새로 만들어도 값이 초기화되지 않고, 클래스가 로드된 동안 유지되기 때문이다.
		
		
	}

}
