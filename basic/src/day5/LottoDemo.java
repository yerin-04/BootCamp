package day5;

import java.util.Arrays;

public class LottoDemo {
	public static void main(String[] args) {
		/*
		 * 로또 번호 생성하기
		 * 
		 * 1. 숫자 1 ~ 45까지 저장하는 배열을 생성한다
		 * 		int[] numbers = new int[45];
		 * 2. 배열의 각 셀에 1 ~ 45까지 숫자를 대입한다
		 * 		반복문 사용해서 배열에 숫자를 대입
		 * 3. 배열에 저장된 숫자를 섞는다
		 * 4. 배열에서 숫자를 6개 뽑아낸다
		 * 
		 */
		
		// 전부 0으로 채워진 45칸짜리 배열이 생성되고 numbers에 대입된다
		int[] numbers = new int[45];
		
		// 배열의 각 셀에 1부터 45까지 대입하기
		for (int i = 0; i < 45; i++) {
			numbers[i] = i + 1;		
		}
		
//		System.out.println(Arrays.toString(numbers));
		
		// 배열에 저장된 값을 섞기
		for (int i = 1; i <= 6; i++) {
			// 교체할 값의 인덱스값을 얻는다
			int destIndex = (int) (Math.random()*45);
			
			// i번째 값을 destIndex번째 값과 교환한다
			int temp = numbers[i];
			numbers[i] = numbers[destIndex];
			numbers[destIndex] = temp;
			
//			System.out.println(destIndex);
//			System.out.println(Arrays.toString(numbers));
			
		}
		System.out.println("로또번호: ");
		
		for (int i = 0; i < 6; i++) {
			System.out.print(numbers[i] + " ");
		}
	}
}
