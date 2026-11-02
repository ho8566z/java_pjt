package com.office.ex;

/**
 * 부모 식당 클래스.
 * 짜장면, 짬뽕, 볶음밥 만들기를 제공하며 자식 클래스가 상속해 재정의한다.
 */
public class FatherRestaurant {
	
	// 짜장면 만들기
	public void makeJajangmyeon() {
		System.out.println("[FatherRestaurant] makeJajangmyeon");
		
	}
	
	// 짬뽕 만들기
	public void makeJjamppong() {
		System.out.println("[FatherRestaurant] makeJjamppong");
		
	}
	
	// 볶음밥
	public void makeBokkeumbap() {
		System.out.println("[FatherRestaurant] makeBokkeumbap");
		
	}

}
