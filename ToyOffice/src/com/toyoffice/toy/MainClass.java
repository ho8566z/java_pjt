package com.toyoffice.toy;

/**
 * 장난감 실습의 시작점.\n각 장난감의 동작을 따로 실행한 뒤, IToy 배열에 담아 doWalk() 를 반복 호출한다.
 */
public class MainClass {
	
	public static void main(String[] args) {
		
		IToy teddybear = new Teddybear();
		teddybear.doWalk();
		teddybear.doSpeach();
		
		IToy robot = new Robot();
		robot.doWalk();
		robot.doSpeach();
		
		IToy airplane = new AirPlane();
		airplane.doWalk();
		airplane.doSpeach();
		
		IToy[] iToys = {teddybear, robot, airplane};
		for (int i = 0; i < iToys.length; i++) {
			iToys[i].doWalk();
		}
		
	}

}
