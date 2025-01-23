package day4;

public class ForDemo4 {
	public static void main(String[] args) {
		/* 1~100까지 정수의 합계 구하기
		 * 
		 * total = total + 1;
		 * total = total + 2;
		 * total = total + 3;
		 * ...
		 * total = total + 100;
		 * 
		 */
		
		int total = 0;
		for (int i = 1; i <= 100; i++) {
			total = total + i;
		}
		System.out.println("합계: " + total);
	}
}
