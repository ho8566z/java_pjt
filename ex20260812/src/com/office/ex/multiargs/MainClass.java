package com.office.ex.multiargs;

public class MainClass {
	
	public static void main(String[] args) {
		
		Score score = new Score();
//		score.printStudentsTotalAndAverageScore(1, 80, 90, 100);
//		score.printStudentsTotalAndAverageScore(2, 80, 90, 100, 80);
//		score.printStudentsTotalAndAverageScore(3, 80, 90, 100, 80, 55, 80, 90, 100, 80);
		
		
		// other people
//		Score score2 = new Score();
//		int[] scores = {10, 20, 30};
//		score2.getTotalScore(scores);		// 총점
//		score2.getAverageScore(scores);		// 평균
		
		int[] scores = {10, 20, 30};
		TotalAverage.getTotalScore(scores);		// 총점
		TotalAverage.getAverageScore(scores);		// 평균
		
	}

}
