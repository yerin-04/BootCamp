package day4;

import java.util.Scanner;

public class ForDemo5 {
	public static void main(String[] args) {
		//두 수를 입력받아서 해당 범위의 정수를 모두 더한 합계를 계산하기
		
		//키보드 입력을 읽어오는 Scanner 객체 생성하기
		Scanner scanner = new Scanner(System.in);
		
		//nextInt()는 키보드로 입력한 숫자를 정수로 읽어온다
		System.out.print("첫번째 숫자 입력:");
		int num1 = scanner.nextInt();
		
		System.out.print("두번째 숫자 입력:");
		int num2 = scanner.nextInt();
		
		int total = 0;
		for (int i = num1; i <=num2; i++) {
			total += i;
		}
		System.out.println("합계: " + total);
		
		
	}
}
