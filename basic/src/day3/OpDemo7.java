package day3;

public class OpDemo7 {
	public static void main(String[] args) {
		/*
		 * 비교 연산자
		 *   >, <, >=, <=, ==, !=
		 */
		
		int a = 4;
		int b = 5;
		
		System.out.println(a > b);
		System.out.println(a < b);
		System.out.println(a >= b);
		System.out.println(a <= b);
		System.out.println(a == b);
		System.out.println(a != b);

		//한 번에 2가지 비교연산을 수행할 수 없다
		//System.out.println(0 <= a <= 100);
		System.out.println(0 <= a && a <= 100);
		
		//문자열의 비교(추천하지 않는 방식)
		String str1 = "홍길동";
		String str2 = "홍길동";
		String str3 = new String("홍길동");
		String str4 = new String("홍길동");
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		
		// == 연산자로 문자열을 비교하면 같은 내용을 가지고 있더라도 문자열을 생성하는 방법에 따라서 다른 연산결과가 나온다
		// 문자열 비교에서 == 연산자는 내용을 비교하는 것이 아니라 객체의 주소값을 비교한다
		System.out.println(str1.equals(str2));
		System.out.println(str1.equals(str3));
		System.out.println(str3.equals(str4));
		
		// equlas()를 사용하면 두 문자열의 생성방법과 상관없이 문자열의 내용을 비교한다
		System.out.println(str1.equals(str2));
		System.out.println(str1.equals(str3));
		System.out.println(str3.equals(str4));
	}
}
