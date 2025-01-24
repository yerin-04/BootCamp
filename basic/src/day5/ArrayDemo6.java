package day5;

public class ArrayDemo6 {
	public static void main(String[] args) {
		/*
		 * 2차원 배열
		 * - 비정방형 2차원 배열 만들기
		 *   예시)
		 * 		int[][] arr = {
		 * 			{1, 2, 3},
		 * 			{1},
		 * 			{1, 2, 3, 4, 5}
		 * 		}
		 * 
		 * 		//열의 크기를 생략한다 (행의 크기는 생략불가)
		 * 		int[][] arr = new int[3][];
		 * 
		 * 		arr[0] = new int[5];
		 * 		arr[1] = {1, 2, 3};
		 * 		arr[2] = new int[10];
		 * 
		 */
		
		// 비정방형 배열 생성하기, 값 출력해보기
		String[][] names = new String[3][];
		
		names[0] = new String[2];
		names[1] = new String[] {"김유신", "김구", "김시습"};
		names[2] = new String[] {"이황", "이이"};
		
		// 행의 개수
		int rowSize = names.length;
		// 열의 개수
		int firstRowColSize = names[0].length;
		int secondRowColSize = names[1].length;
		int thirdRowColSize = names[2].length;
		
		System.out.println("행의 개수: " + rowSize);
		System.out.println("0행의 열의 개수: " + firstRowColSize);
		System.out.println("1행의 열의 개수: " + secondRowColSize);
		System.out.println("2행의 열의 개수: " + thirdRowColSize);
		
		// 비정방형 배열의 모든 값 출력하기
		for (int i = 0; i < names.length; i++) {
			for (int j = 0; j < names[i].length; j++) {
				System.out.println(names[i][j] + "\t");
			}
			System.out.println();
		}
		
		// 출력 결과
		/* 
		 * null		null
		 * 김유신		김구		김시습
		 * 이황		이이
		 */
		
		
	}
}

