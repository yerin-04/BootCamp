package day1.demo1;

public class App {
	public static void main(String[] args) {
		
		Score s1 = new Score("홍길동", 100, 80, 70);
		Score s2 = new Score("김유신", 80, 70, 40);
		
		/*
		 * Object의 주요 메서드
		 *  String toString() 메서드
		 *  - 반환값 : String
		 *  - 기능 : 객체에 대한 간단한 설명을 문자열로 반환한다.
		 *  		"패키지.클래스이름@해시코드";
		 *  - 재정의 : 객체의 멤버변ㅅ와 값으로 구성된 문자열을 반환하도록 재정의한다.
		 *  		 객체의 현재 값을 빠르게 확인할 수 있다.
		 */
		
		// 아래 수행문의 출력값을 동일한 결과를 출력한다.
		// 즉, 참조변수를 출력하면 참조변수의 주소값이 출력되는 것이 아니라, 
		// 참조변수가 참조하는 객체의 toString() 메서드가 실행되는 것이다.
		System.out.println(s1.toString());
		System.out.println(s2.toString());
		System.out.println(s1);
		System.out.println(s2);
	}
}
