package day3;

public class OpDemo4 {
	public static void main(String[] args) {
		//나머지 연산자의 활용
		
		//세자리 정수의 자릿수의 합을 계산하기
		int num = 478;
		
		int 일의자리수 = num%10;
		
		num = num/10;
		int 십의자리수 = num%10;
		
		int 백의자리수 = num/10;
		
		int sum = 일의자리수 + 십의자리수 + 백의자리수;
		System.out.println(sum);
		
	}
}
