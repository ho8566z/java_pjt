package com.office.example;

public class Car {
	
	// 멤버 필드
	int length;			// 길이
	int price;			// 가격
	int displacement;	// 배기량

	public Car() {
		System.out.println("----Default Constructor----");
		
		
	}
	
	// 생성자 오버로딩
	public Car(int length, int price, int displacement) {
		this.length = length;
		this.price = price;
		this.displacement = displacement;
		
	}
	
	
	// 메서드
	// 메서드가 실행되고 나서 반환되는 데이터의 데이터 타입을 명시한다.
	// 하지만, 메서드가 실행되고 나서 반환되는 데이터가 없을 때는 void를 쓴다.
	// 메서드명은 '동사 + 명사' or '동사'의 구조로 만드는 게 기본 문법구조이다.
	public void goForward() {	// <- 매개변수
		System.out.println("goForward() called");
		
	}
	
	public void goForward(int speed) {	// <- 매개변수
		System.out.println(speed + "km/h - goForward() called");
		
	}
	
	public void goBack() {
//		this.goForward(); 			// <- 접근 제한자
		System.out.println("goBack() called");
		
	}
	
	public void doStop() {
		System.out.println("doStop() called");
		
	}
	
	public void testDrive() {
		goForward();
		goBack();
		doStop();
		
	}
	
	public void printCarSpec(String language) {
		if (language.equals("kor")) {
			printCarSpecForKor();
		} else {
			printCarSpecForEng();
		}
		
	}
	
	private void printCarSpecForKor() {
		System.out.println("길이 : " + this.length + "센티미터");
		System.out.println("가격 : " + this.price + "원");
		System.out.println("배기량 : " + this.displacement + "씨씨");
		
	}
	
	private void printCarSpecForEng() {
		System.out.println("length : " + this.length + "cm");
		System.out.println("price : " + this.price + "won");
		System.out.println("displacement : " + this.displacement + "cc");
		
	}
	// 이미지 만들기 - 3번째 사진 참조
	
	
	// 거리 = 시간 x 속도
	public int getDistance(int hour, int speed) {
//		System.out.println("이동 거리 : " + (hour * speed) + "km");
		int distance = hour * speed;
		
		return distance;
//		System.out.println("메서드 실행 끝");
		// 언리처블 코드 : return 뒤에 존재하는 코드들은 실행될 수 없다는 경고 코드
		
		// 반환되지 않을 때는 void를, return으로 반환될 때에는 반환되는 데이터의 데이터 타입을 명시한다.
		
		// 이미지 만들기 - 4번째 사진 참조
	}
	
}
