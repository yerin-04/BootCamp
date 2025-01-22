package day3;

public class OpDemo1 {
	public static void main(String[] args) {
		/* 산술 연산자
		 *   더하기, 빼기, 곱하기, 나누기, 나머지 연산을 수행한다
		 *   +, -, *, /, %
		 *   주의사항
		 *     덧셈 연산자는 더하기 기능, 이어붙이기 기능을 수행한다
		 *     나눗셈 연산자에서 0으로 나누면 오류가 발생한다
		 *     연산결과는 연산에 참여한 값의 타입과 동일하다
		 *     연산을 수행하기 전에 연산에 참여한 값은 같은 타입의 값으로 형변환 될 수 있다
		 */
		
		int a = 10;
		int b = 4;
		
		System.out.println(a + b);
		System.out.println(a - b);
		System.out.println(a*b);
		System.out.println(a/b);
		System.out.println(a%b);
		
		
		//0으로 나누는 연산을 수행하면 ArithmeticException 예외가 발생한다
		//System.out.println(a/0);
		
	}
}
