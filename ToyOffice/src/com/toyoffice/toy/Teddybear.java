package com.toyoffice.toy;

/**
 * 곰 인형 장난감. 걷기와 말하기를 곰 인형 메시지로 출력한다.
 */
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
