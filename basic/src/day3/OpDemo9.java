package day3;

public class OpDemo9 {
	public static void main(String[] args) {
		/* 비트 연산자
		 * &, |, ^, ~, <<, >>, >>>
		 * - 이진수 단위로 데이터를 처리하는 연산자다
		 * - 
		 */
		
		int a = 0b1011; //11
		int b = 0b0100; //4
		
		System.out.println(a & b); //0
		System.out.println(a | b); //15
		System.out.println(a ^ b); //15
		System.out.println(~a); //-12
		System.out.println(a << 2); //44
		System.out.println(a >> 2); //2
		System.out.println(a >>> 2); //2
	}
}
