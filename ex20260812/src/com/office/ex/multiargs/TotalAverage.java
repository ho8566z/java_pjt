package com.office.ex.multiargs;

public class TotalAverage {
	
	/**
	 * 점수 배열의 총점을 구한다.
	 *
	 * @param scores 점수 배열
	 * @return 모든 점수의 합
	 */
	static public int getTotalScore(int[] scores) {
		
		int totalScore = 0;
		for (int i = 0; i < scores.length; i++) {
			totalScore += scores[i];
		}
		return totalScore;
	}

	
	/**
	 * 점수 배열의 평균을 구한다. 정수 나눗셈 결과를 float 로 반환하므로 소수점 아래는 버려진다.
	 *
	 * @param scores 점수 배열
	 * @return 평균 점수, 점수가 없으면 0.0
	 */
	static public float getAverageScore(int[] scores) {
		
		float averageScore = 0.0f;
		if (scores.length > 0) {
			averageScore = getTotalScore(scores) / scores.length;
		}
		return averageScore;
	}

}
