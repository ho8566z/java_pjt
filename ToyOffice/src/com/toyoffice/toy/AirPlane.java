package com.toyoffice.toy;

/**
 * 비행기 장난감. doWalk(), doSpeach() 가 내부 메서드 walk(), speach() 를 호출한다.
 */
public class AirPlane implements IToy {

	@Override
	public void doWalk() {
		walk();
		
	}

	@Override
	public void doSpeach() {
		speach();
		
	}
	
	// 걷다
	private void walk() {
		System.out.println("[AirPlane] walk!");
		
	}

	// 말하다
	private void speach() {
		System.out.println("[AirPlane] speach!");
		
	}

}
