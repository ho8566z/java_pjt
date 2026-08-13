package com.toyoffice.toy;

public class Robot implements IToy {

	// 걷다
	@Override
	public void doWalk() {
		System.out.println("[Robot] walk!");
		
	}

	// 말하다
	@Override
	public void doSpeach() {
		System.out.println("[Robot] speach!");
		
	}
	
	

}
