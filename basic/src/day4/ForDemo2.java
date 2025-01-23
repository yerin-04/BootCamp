package day4;

public class ForDemo2 {
	public static void main(String[] args) {
		//1~10까지 역순으로 출력하기
		System.out.println("역순으로 출력하기");
		for (int i = 10; i >- 1; i--) {
			System.out.println(i);
		}
		
		//1~10까지 짝수 출력하기
		System.out.println("\n짝수 출력하기");
		for (int i = 1; i <= 10; i++) {
			if (i%2 == 0) {
				System.out.println(i);
			}
		}
		
		//1~10까지 홀수 출력하기
		System.out.println("\n홀수 출력하기");
		for (int i = 1; i <= 10; i+=2) {
				System.out.println(i);
		}
	}
}
