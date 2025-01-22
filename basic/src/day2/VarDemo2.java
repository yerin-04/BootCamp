package day2;

public class VarDemo2 {
	public static void main(String[] args) {
		/* 기본 자료형의 형변환
		 *   정수 <--> 문자 간의 형변환
		 *   
		 *
		 */
		/* int 타입의 65는 [00000000][00000000][00000000][01000001]
		 * char a(즉, 문자타입 변수)는 2byte로 문자를 표현한다
		 * 						[xxxxxxxx][xxxxxxxx]
		 * ------------------------------------------
		 * 						[00000000][01000001]
		 * int 타입값을 앞 2byte는 무시한다 
		 * 단, int 타입의 값이
		 * [00000000][00000000][xxxxxxxx][xxxxxxxx]인 경우에만 변환이 일어난다
		 * 정수값의 범위가 0 ~ 65535까지다
		 */
		char a = 65;
		System.out.println(a);
		char b = 65535;
		System.out.println(b);
		
		/* char c = 66536;//형변환 오류
		 * 65536은 [00000000][00000001][00000000][00000000]
		 * 앞 2byte는 무시하는데 그렇게 되면 데이터의 손실이 발생한다.
		 */
		
		
		int x = 65;
		System.out.println(x); //65출력
		System.out.println((char)65); //'A'출력
		
		int y = 'A' - 10;
		System.out.println(y); //55출력
		
		//int z = "A" - 10; //문법 오류
	}
}
