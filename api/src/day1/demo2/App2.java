package day1.demo2;

public class App2 {
	public static void main(String[] args) {
		
		User user1 = new User(10, "홍길동", "hong@gmail.com");
		User user2 = new User(10, "홍길동", "hong@gmail.com");
		User user3 = new User(31, "김유신", "kim@gmail.com");
		
		/*
		 * Object의 주요 메서드
		 * 	int hashCode()
		 * 반환타입
		 * 	- 정수
		 * 기능
		 * 	- 객체의 해시코드값을 정수로 반환한다
		 * 	- 객체가 서로 다르면 해시코드값도 다른 값이 반환된다
		 * 재정의
		 * 	- 서로 다른 객체라 하더라도 같은 값을 가지고 있으면 동일한 hashCode값을 반환하도록 재정의할 수 있다.
		 * 	- 객체의 동등성 비교를 할 때 많은 라이브러리들은 equals(Object obj)를 실행해서 객체의 hashCode 값을 먼저 비교한다.
		 * 	  hashCode 값이 다르면 다른 객체로 판정하기 때문에 객체의 동등성 비교를 위해서는 언제나 hashCode()와 equals() 모두 재정의해야 한다.
		 */
		
		// User 클래스에는 no 멤버변수의 값으로 hashCode를 생성하도록 재정의했기 때문에 no 값이 동일하면 hashCode 값도 같은 값이 출력된다.
		System.out.println(user1.hashCode());
		System.out.println(user2.hashCode());
		System.out.println(user3.hashCode());
	}
}
