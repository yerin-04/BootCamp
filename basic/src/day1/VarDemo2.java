package day1;

public class VarDemo2 {
	public static void main(String[] args) {
		/*정수 자료형(데이터타입)
		 * byte, short, int, long
		 * 대표자료형은 int다
		 * int 타입의 변수는 일상생활에서 다루는 대부분의 정수값을 저장할 수 있다 (정수값을 저장할 때는 int타입의 변수를 만들자)
		 * long 타입의 변수는 매우 큰 정수값을 다룰 때 사용하자 (통장잔고 등)	 */
		
		byte num1 = 100;
		//byte num2 = 100000; 해당 자료형의 범위를 초과하는 값을 담을 수 없다
		
		//대부분의 정수값은 int 타입의 변수로 저장할 수 있다
		int num3 = 1234567;
		
		//long 타입의 변수는 int 범위를 벗어나는 정수값을 저장할 수 있다
		long num4 = 123456789;
		long num5 = 1234567890123L; //int 범위를 초과하는 숫자는 숫자 뒤에 L혹은 l을 붙인다
		
	}
}
