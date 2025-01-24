package day5;

public class ArrayDemo5 {
	public static void main(String[] args) {
		/*
		 * 2차원 배열의 생성
		 *  형식
		 *  	자료형[][] 변수명 = new 자료형[크기][크기];
		 *  예시)
		 *  	//2행 3열의 배열을 생성한다
		 *  	int[][] numbers = new int[2][3];
		 *  	   열 0  1  2
		 *  	행
		 *  	0	[0][0][0]
		 *  	1 	[0][0][0]
		 *  
		 *  형식
		 *  	자료형[][] 변수명 = {{값, 값, 값}, {값, 값, 값}}
		 *  예시)
		 *  	int[][] numbers = {{1, 3, 4}, {6, 3, 7}};
		 *  	   열 0  1  2
		 *  	행
		 *  	0	[1][3][4]
		 *  	1  	[6][3][7]
		 */
		
		// 2차원 배열을 이용해서 학생들의 국어, 영어, 수학 성적 관리하기
		int[][] scores = {
				{100, 30, 80}, // 0행
				{70, 80, 78},  // 1행
				{40, 50, 48},  // 2행
				{100, 90, 100},// 3행
				{80, 80, 90}   // 4행
		};
		
		// 첫번째 학생의 국어, 영어, 수학 점수 출력하기
		System.out.println(scores[0][0]);
		System.out.println(scores[0][1]);
		System.out.println(scores[0][2]);
		// 두번째 학생의 국어, 영어, 수학 점수 출력하기
		System.out.println(scores[1][0]);
		System.out.println(scores[1][1]);
		System.out.println(scores[1][2]);
		// 세번째 학생의 국어, 영어, 수학 점수 출력하기
		System.out.println(scores[2][0]);
		System.out.println(scores[2][1]);
		System.out.println(scores[2][2]);
		
		// 행의 개수
		int rowSize = scores.length;
		for (int rowIndex = 0; rowIndex < 5; rowIndex++) {
			// 각 행의 열의 개수
			int colSize = scores[rowIndex].length;
			
			for (int colIndex = 0; colIndex < 3; colIndex++) {
				int value = scores[rowIndex][colIndex];
				System.out.println(value + "\t");
			}
			System.out.println();
		}
		
		// 국어, 영어, 수학 점수 평균을 계산하기
		int korTotal = 0;
		int engTotal = 0;
		int mathTotal = 0;

		for (int i = 0; i < 5; i++) {
			korTotal += scores[i][0];
			engTotal += scores[i][1];
			mathTotal += scores[i][2];
		}
		int korAvg = korTotal/5;
		int engAvg = engTotal/5;
		int mathAvg = mathTotal/5;
		
		System.out.println("국어점수 평균: " + korAvg);
		System.out.println("영어점수 평균: " + engAvg);
		System.out.println("수학점수 평균: " + mathAvg);
		
	}
}
