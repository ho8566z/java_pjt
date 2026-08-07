package com.office.example;

public class MultiArrayClass {

	public static void main(String[] args) {
		
		/*
		 * 다차원 배열 <- ["이미지 만들기"]
		 * 배열 안에 또 다른 배열이 선언되어 있는 다차원 배열
		 * 다차원 배열은 2차원, 3차원, 4차원 ... n차원 배열로 원하는 만큼 선언할 수 있다.
		 * 하지만, 일반적으로 2차원 배열까지만 사용하고 3차원 이상의 배열은 사용하지 않는다.
		 * 그 이유는 3차원 이상의 배열은 오히려 데이터 관리가 어려워지기 때문이다.
		 * 
		 * 2차원 배열 <- ["이미지 만들기"]
		 * 배열 안에 또 다른 배열이 있는 것
		 * 배열 안에 또 다른 배열 주소값이 있다.
		 * 
		 * int[][] mns = new int[3][2];
		 * [][]:2차원 배열 / [3]:1차원 배열의 길이-3칸, [2]:2차원 배열 길이-2칸
		 * 
		 */
		
//		int[] ns = new int[3];
//		System.out.println("ns : " + ns);		// ns : [I@5aaa6d82
//		
//		int[][] mns = new int[3][2];
//		System.out.println("mns : " + mns);		// mns : [[I@198e2867
//		
//		int[][][] mn3s = new int[3][2][4];
//		System.out.println("mn3s : " + mn3s);	// mn3s : [[[I@3ada9e37
		
		//----------------------------------------------------------------
		
//		// 다차원 배열 선언 - I (3x2) <- 많이사용 <- ["이미지 만들기"]
//		int [][] mns = {{1, 2}, {3, 4}, {5, 6}};
//		
//		
//		System.out.println("mns : " + mns);					// mns : [[I@5aaa6d82
//		System.out.println("mns[0] : " + mns[0]);			// mns[0] : [I@198e2867
//		System.out.println("mns[0][0] : " + mns[0][0]);		// mns[0][0] : 1
//		
//		for (int i = 0; i < mns.length; i++) {
//			int[] tempArr = mns[i];
//			for (int j = 0; j < tempArr.length; j++) {
//				System.out.println(mns[i][j]);
//			}
//		}
//		1
//		2
//		3
//		4
//		5
//		6
//		
//		
//		// 다차원 배열 선언 - II (3x2) <- ["이미지 만들기"]
//		int [][] mns2 = new int[3][2];
//		mns2[0][0] = 1;
//		mns2[0][1] = 2;
//		mns2[1][0] = 3;
//		mns2[1][1] = 4;
//		mns2[2][0] = 5;
//		mns2[2][1] = 6;
//		
//		
//		// 다차원 배열 선언 - I (3x2) <- ["이미지 만들기"]
//		int [][] mns3 = new int[][] {{1, 2}, {3, 4}, {5, 6}};
		
		//----------------------------------------------------------------
		
		/*
		 * 인덱스 0의 배열: 1
		 * 인덱스 1의 배열: 2
		 * 인덱스 2의 배열: 3
		 */
		
//		int[][] mns = new int[3][];
//		mns[0] = new int[1];
//		mns[1] = new int[2];
//		mns[2] = new int[3];
//		
//		// -> {{1}, {2, 3}, {4, 5, 6}}
//		
//		mns[0][0] = 1;
//		mns[1][0] = 2;
//		mns[1][1] = 3;
//		mns[2][0] = 4;
//		mns[2][1] = 5;
//		mns[2][2] = 6;
//		
//		for (int i = 0; i < mns.length; i++) {
//			int[] tempArr = mns[i];
//			for (int j = 0; j < tempArr.length; j++) {
//				System.out.printf("mns의 [%d][%d] = %d\n", i, j, tempArr[j]);
//			}
//		}
////		mns의 [0][0] = 1
////		mns의 [1][0] = 2
////		mns의 [1][1] = 3
////		mns의 [2][0] = 4
////		mns의 [2][1] = 5
////		mns의 [2][2] = 6
		
		//----------------------------------------------------------------
		
//		// 국어, 영어, 수학의 성적 - 1~4학기 <- ["이미지 만들기"]
//		int[][] scores = {
//				{85, 90, 90},
//				{90, 80, 85},
//				{90, 90, 100},
//				{95, 85, 100}
//			};
//		
//		for (int i = 0; i < scores.length; i++) {
//			int[] tempArr = scores[i];
//			
//			for (int j = 0; j < tempArr.length; j++) {
//				
//				String str = "";
//				switch (j) {
//				case 0:
//					str = "국어";
//					break;
//					
//				case 1:
//					str = "영어";
//					break;
//					
//				case 2:
//					str = "수학";
//					break;
//				}
//				
//				System.out.printf("%d학기 %s 점수 : %d\n", (i+1), str, tempArr[j]);
//				
//			}
//		}
////		1학기 국어 점수 : 85
////		1학기 영어 점수 : 90
////		1학기 수학 점수 : 90
////		2학기 국어 점수 : 90
////		2학기 영어 점수 : 80
////		2학기 수학 점수 : 85
////		3학기 국어 점수 : 90
////		3학기 영어 점수 : 90
////		3학기 수학 점수 : 100
////		4학기 국어 점수 : 95
////		4학기 영어 점수 : 85
////		4학기 수학 점수 : 100
		
		
	}
	
}
