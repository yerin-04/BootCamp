package day4;

public class ForDemo3 {
	public static void main(String[] args) {
		/* 중첩 for문
		 * - for문 안에 또 다른 for문을 포함시키는 것
		 * - 형식
		 * 	   for (초기식; 조건식; 증감식) {
		 * 			수행문;
		 * 			for (초기식; 조건식; 증감식) {
		 * 				수행문2;
		 * 			}
		 * 		}
		 * 		*수행문1은 바깥쪽 for문의 반복횟수만큼 실행된다
		 * 		*수행문2는 (바깥쪽 for문의 반복횟수)*(안쪽 for문의 반복횟수)만큼 실행된다
		 */
		
		for (int i = 1; i <= 3; i++) {
			System.out.println("i의 값: " + i);
			for (int j = 1; j <= 5; j++) {
				System.out.println("j의 값: " + j);
			}
		}
	}
}
