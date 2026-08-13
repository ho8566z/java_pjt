package com.toyoffice.toy;

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
