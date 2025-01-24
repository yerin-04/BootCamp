package day5;

public class ArrayDemo3 {
	public static void main(String[] args) {
		/*
		 * 배열 활용하기
		 */
		 
		//배열에 저장된 값의 합계를 계산하고 출력하기
		int[] numbers = {10, 40, 20, 70, 20, 70, 30};
		int total = 0; //합계를 저장할 변수
		
		
		//1. 일반 for문을 사용하기
		int size = numbers.length;
		
		for (int index = 0; index < size; index++) {
			total += numbers[index];
		}
		System.out.println("합계: " + total);
		
		//2. 향상된 for문을 사용하기
		int total2 = 0;
		for (int value : numbers) {
			total2 += value;
		}
		System.out.println("합계: " + total2);
		
		//배열에 저장된 값들 중에서 짝수들의 합계를 구하기
		int[] numbers2 = {1, 5, 4, 2, 7, 10, 9, 8};
		int evenTotal = 0;
		
		for (int even : numbers2) {
			if (even%2 == 0) {
				evenTotal += even;
			}
		}
		System.out.println("짝수들의 합계: " + evenTotal);
		
		//배열에 저장된 값 중에서 최대값, 최소값을 찾아서 출력하기
		//배열에 저장된 값은 0 ~ 100 사이의 값 중 하나다
		int[] numbers3 = {10, 31, 26, 64, 15, 3, 64, 43, 32, 19};
		
		/* 최소값 구하기
		 * 범위 내에 가장 큰 값을 초기값으로 대입한다
		 * 배열에서 순차적으로 하나씩 값을 꺼내고, 
		 * min 변수에 들어있는 값과 비교해서 배열에서 꺼낸 값이 더 작으면 min 변수의 값을 교체한다
		 */
		int min = 100;
		for (int value : numbers3) {
			if (value < min) {
				min = value;
			}
		}
		System.out.println("최소값: " + min);
		
		
		int max = 0;
		for (int value : numbers3) {
			if (value > max) {
				max = value;
			}
		}
		System.out.println("최대값: " + max);
		
	}
}
