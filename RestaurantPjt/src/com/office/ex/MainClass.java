package com.office.ex;

public class MainClass {
	
	public static void main(String[] args) {
		
		/*
		 * 아버지의 중식당 - 메뉴 짬뽕, 짜장면
		 */
		FatherRestaurant fatherRestaurant = new FatherRestaurant();
		fatherRestaurant.makeJajangmyeon();		// 짜장면
		fatherRestaurant.makeJjamppong(); 		// 짬뽕
		
		/*
		 * 아버지의 은퇴, 자식에게 중식당을 물려준다.
		 * 중식당을 새로 오픈
		 */
		ChildResturant childResturant = new ChildResturant();
		childResturant.makeJajangmyeon();		// 짜장면
		childResturant.makeJjamppong();			// 짬뽕
		
		fatherRestaurant.makeBokkeumbap();		// 볶음밥
		childResturant.makeBokkeumbap();		// 볶음밥
		
		/*
		 * 아버지의 볶음밥이 맛 없는 자식
		 * 오버라이드(Override, 재정의)
		 */
		childResturant.makeBokkeumbap(2);
		
		/*
		 * 자식의 중식당에서 아버지 중식당의 단골손님왈, 아버지의 볶음밥을 먹고싶다고 말한다.
		 */
		childResturant.makeBokkeumbap(1);
		
	}

}
