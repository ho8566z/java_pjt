package com.toyoffice.toy;

/**
 * 장난감이 공통으로 할 수 있는 동작을 정의하는 인터페이스.\nTeddybear, Robot, AirPlane 이 doWalk(), doSpeach() 를 각자 구현한다.
 */
public interface IToy {
	
	public void doWalk();
	
	public void doSpeach();
	
//	public void name();

}
