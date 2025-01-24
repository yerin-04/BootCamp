package day5;

public class ArrayDemo1 {
	public static void main(String[] args) {
		/* 배열
		 *  생성
		 *    자료형[] 변수명 = new 자료형[크기];
		 *    예시) 
		 *    		int[] arr1 = new int[5];
		 *    		  new int[5]
		 *    		  * new - 배열을 생성한다
		 *    		  * int[5] - 정수 5개 저장할 수 있는 배열
		 *    		  int[] arr1
		 *    		  * int[] - 변수의 타입을 지정한다
		 *    					정수 여러개 저장하는 배열이다
		 *    		  * arr1 - 변수명
		 *    
		 * 			double[] arr2 = new double[10];
		 * 			  * 실수 10개 담을 수 있는 배열을 생성하고, 실수배열타입의 변수 arr2에 대입한다
		 *    	   	String[] arr3 = new String[100];
		 *    		  * 문자열 100개 담을 수 있는 배열을 생성하고, 문자열배열 타입의 변수 arr3에 대입한다
		 */
		
		/* 배열 생성하기
		 * 정수 5개 담는 배열 생성하기 */
		int[] arr1 = new int[5];
		
		System.out.println(arr1[0]); //0이 출력된다
		System.out.println(arr1[1]);
		System.out.println(arr1[2]);
		System.out.println(arr1[3]);
		System.out.println(arr1[4]);
		
		
		//실수 3개 담는 배열 생성하기
		double[] arr2 = new double[3];
		
		System.out.println(arr2[0]); //0.0이 출력된다
		System.out.println(arr2[1]);
		System.out.println(arr2[2]);
		System.out.println(arr2[3]); //ArrayIndexOutOfBoundsException 예외 발생
		
	}
}
