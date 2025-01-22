package day3;

public class OpDemo2 {
	public static void main(String[] args) {
		/*
		 * 덧셈 연산자
		 * 
		 */
		
		// 숫자 + 숫자 --> 숫자
		System.out.println(1 + 3);
		System.out.println();
		
		// 숫자 + 문자열 --> "숫자문자열"
		System.out.println(123 + "안녕");
		
		// "문자열" + 숫자 --> "문자열숫자"
		System.out.println("안녕" + 123);
		
		// "문자열" + "문자열" --> "문자열문자열"
		System.out.println("잘가" + "안녕");
		
		System.out.println(1 + "abc" + 2 + 3); //1abc23
		System.out.println(1 + 2 + "abc" + 3); //3abc3
		System.out.println(1 + 2 + 3 + "abc"); //6abc
		
		int kor = 100;
		int eng = 80;
		int math = 60;
		
		System.out.println("총점: " + kor + eng + math); //총점: 1008060
		System.out.println("총점: " + (kor + eng + math)); //총점: 240
	}
}
