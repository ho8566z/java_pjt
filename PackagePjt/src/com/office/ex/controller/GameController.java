package com.office.ex.controller;

import java.util.Scanner;

import com.office.ex.service.GameService;

public class GameController {
	
	public void execute() {
		
		GameService gameService = new GameService();
		
		Scanner scanner = new Scanner(System.in);
		int selectedNumber = scanner.nextInt();
		
		switch (selectedNumber) {
		case 1:		// run
			gameService.run();
			break;

		case 2:		// stop
			gameService.stop();
			break;
		
		}
		
		scanner.close();
		
	}

}
