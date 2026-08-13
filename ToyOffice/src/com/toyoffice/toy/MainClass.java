package com.toyoffice.toy;

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
