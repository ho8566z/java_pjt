package com.office.ex.service;

import com.office.ex.runner.Rabbit;
import com.office.ex.runner.Turtle;

/**
 * 거북이와 토끼를 함께 움직이는 경주 서비스.
 */
public class GameService {
	
	Turtle turtle = new Turtle();
	Rabbit rabbit = new Rabbit();
	
	/** 거북이와 토끼를 차례로 출발시킨다. */
	public void run() {
		turtle.run();
		rabbit.run();
		
	}

	/** 거북이와 토끼를 차례로 멈춘다. */
	public void stop() {
		turtle.stop();
		rabbit.stop();
		
	}
	
}
