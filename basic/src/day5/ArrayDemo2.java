package day5;

public class ArrayDemo2 {
	public static void main(String[] args) {
		/* 배열 생성
		 *  형식
		 *  	자료형[] 변수 = {값, 값, 값, 값};
		 *  예시)
		 *  	int[] arr1 = {10, 20, 30, 40, 50};
		 *  	double[] arr2 = {3.4, 4.1, 4.5};
		 *  	String[] arr3 = {"김유신", "강감찬", "이순신"};
		 *  
		 *  배열의 각 셀에 저장된 값을 미리 지정해서 배열을 생성한다
		 */
		
		int[] arr1 = {10, 30, 20, 50, 70};
		
		//1. 배열의 값 출력하기
		System.out.println(arr1[0]);
		System.out.println(arr1[1]);
		System.out.println(arr1[2]);
		System.out.println(arr1[3]);
		System.out.println(arr1[4]);
		
		System.out.println("--------------------------");
		//2. 일반 for문을 사용해서 배열의값 출력하기
		for (int index = 0; index <= 4; index++) {
			System.out.println(arr1[index]);
		}
		
		//3. 향상된 for문을 사용해서 배열의값 출력하기
		for (int num : arr1) {
			System.out.println(num);
		}
		
//		int index = 0;
//		for (int num : arr1) {
//			System.out.println("[" + index + "]" + num);
//			index++;
//		}
	}
}
