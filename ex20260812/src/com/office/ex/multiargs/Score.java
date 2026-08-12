package com.office.ex.multiargs;

public class Score {
	
	// 학생들의 시험점수를 출력
	// 총점 & 평점
	
	/*
	// 학생 3명
	public void printStudentsTotalAndAverageScore(
			int score1,
			int score2,
			int score3) {
		
		int totalScore = score1 + score2 + score3;
		System.out.println("총점 : " + totalScore);
		
		float averageScore = totalScore / 3;
		System.out.println("평균 : " + averageScore);
		
	}
	
	// 학생 4명
	public void printStudentsTotalAndAverageScore(
			int score1,
			int score2,
			int score3,
			int score4) {
		
		int totalScore = score1 + score2 + score3 + score4;
		System.out.println("총점 : " + totalScore);
		
		float averageScore = totalScore / 4;
		System.out.println("평균 : " + averageScore);
		
	}
	
	// 학생 5명
	public void printStudentsTotalAndAverageScore(
			int score1,
			int score2,
			int score3,
			int score4,
			int score5) {
		
		int totalScore = score1 + score2 + score3 + score4 + score5;
		System.out.println("총점 : " + totalScore);
		
		float averageScore = totalScore / 5;
		System.out.println("평균 : " + averageScore);
		
	}
	*/
	
	//---------------------------------------------------------------------------------
	
	// 가변인자와 매개변수
	// 매개변수와 가변인자의 순서로 사용하는 것은 가능하지만, 가변인자와 매개변수의 순서로 사용하는 것은 불가능하다.
	// -> 가변인자는 모든 파라미터의 마지막에 존재해야 한다.
	//
	// 파라미터의 개수나 매개변수의 데이터 타입이 다를 때는 가변인자 또한 메서드 오버로딩할 수 있다.
	/*
	 * ex)
	 * (int classNumber, int ...score) 					== O
	 * (int classNumber, String coment, int ...score) 	== O
	 * (int ...score, int classNumber) 					== X
	 */
	
	public void printStudentsTotalAndAverageScore(int classNumber, int ...scores) {
		
//		int totalScore = 0;
//		for (int i = 0; i < scores.length; i++) {
//			totalScore += scores[i];
//		}
		System.out.println(classNumber + "반, 총점 : " + TotalAverage.getTotalScore(scores));
		// 100 -> 3반 총점 : 100
		
//		float averageScore = 0.0f;
//		if (scores.length > 0) {
//			averageScore = totalScore / scores.length;
//		}
		System.out.println(classNumber + "반, 평균 : " + TotalAverage.getAverageScore(scores));
		// 80.0 -> 3반 평균 : 80
		
	}
	
//	public void printStudentsTotalAndAverageScore(String classNumber, int ...scores) {
//		
//		int totalScore = 0;
//		for (int i = 0; i < scores.length; i++) {
//			totalScore += scores[i];
//		}
//		System.out.println(classNumber + "반, 총점 : " + totalScore);
//		// 100 -> 3반 총점 : 100
//		
//		float averageScore = 0.0f;
//		if (scores.length > 0) {
//			averageScore = totalScore / scores.length;
//		}
//		System.out.println(classNumber + "반, 평균 : " + averageScore);
//		// 80.0 -> 3반 평균 : 80
//		
//	}
	
	
}
