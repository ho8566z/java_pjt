package com.toyoffice.toy;

/**
 * 로봇 장난감. 걷기와 말하기를 로봇 메시지로 출력한다.
 */
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
