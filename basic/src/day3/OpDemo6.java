package day3;

public class OpDemo6 {
	public static void main(String[] args) {
		/*
		 * 증감연산자
		 *  ++, --
		 *  단항연산자다
		 *  변수의 값을 1씩 증가 혹은 감소시킨다
		 *  위치에 따라서 변수의 값이 변경되는 시점이 다르다
		 *    ++a + 10;
		 *    	a의 값을 1증가시킨 다음 덧셈연산에 사용한다
		 *    a++ + 10;
		 *    	a의 값을 덧셈연산에 먼저 사용한 후 1 증가시킨다
		 */
		
		int a = 10;
		int b = 10;
		
		System.out.println(a++);
		System.out.println(++b);
		
		System.out.println(a);
		System.out.println(b);
	}
}
