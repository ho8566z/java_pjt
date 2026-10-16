package com.office.ex.runner;

/**
 * 토끼 러너. 달리기와 멈추기 동작을 콘솔 출력으로 보여 준다.
 */
public class Rabbit {
	
	/** 토끼가 달리는 동작을 출력한다. */
	public void run() {
		System.out.println("[Rabbit] run()");
		
		System.out.println("토끼는 깡총 깡총~");
		
	}

	/** 토끼가 멈추는 동작을 출력한다. */
	public void stop() {
		System.out.println("[Rabbit] stop()");
		
		System.out.println("토끼 그대로 정지");
		
	}
	
		
}
