package day3;

public class OpDemo3 {
	public static void main(String[] args) {
		/*
		 * 나눗셈 연산자와 나머지 연산자의 활용
		 */
		
		//초단위의 값을 분과 초로 표현하기
		int seconds = 239;
		
		//분 구하기
		int minutes = seconds/60;
		
		//나머지 초 구하기
		int remainSeconds = seconds%60;
		
		System.out.println("분: " + minutes);
		System.out.println("초: " + remainSeconds);
		
	}
}
