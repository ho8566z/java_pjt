package com.office.ex.main;

import com.office.ex.controller.GameController;

/**
 * 게임 실습의 시작점.
 * GameController 를 만들어 게임을 실행한다.
 */
public class MainClass {
	
	public static void main(String[] args) {
		
		new GameController().execute();
		
	}

}
