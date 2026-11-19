package com.office.ex.controller;

import java.util.Scanner;

import com.office.ex.service.GameService;

/**
 * 콘솔 입력을 받아 게임 서비스의 기능을 고르는 컨트롤러.
 * 1 을 입력하면 달리기, 2 를 입력하면 멈추기를 실행한다.
 */
public class GameController {
	
	public void execute() {
		
		GameService gameService = new GameService();
		
		Scanner scanner = new Scanner(System.in);
		// 입력한 번호에 따라 서비스의 기능을 고른다
		int selectedNumber = scanner.nextInt();
		
		switch (selectedNumber) {
		case 1:		// run
			gameService.run();
			break;

		case 2:		// stop
			gameService.stop();
			break;
		
		}
		
		// 입력이 끝났으므로 Scanner 를 닫는다
		scanner.close();
		
	}

}
