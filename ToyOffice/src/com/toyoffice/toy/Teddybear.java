package com.toyoffice.toy;

public class Teddybear implements IToy {
	
	// 걷다
	@Override
	public void doWalk() {
		System.out.println("[Teddybear] walk!");
	}
	
	// 말하다
	@Override
	public void doSpeach() {
		System.out.println("[Teddybear] speach!");
	}

}
