package day1.demo2;

public class App {
	public static void main(String[] args) {
		
		User user1 = new User(100, "홍길동", "hong@gmail.com");
		User user2 = new User(100, "홍길동", "hong@gmail.com");
		User user3 = user1;
		
		/* 
		 * Object의 주요 메서드
		 * 	boolean equlas(Object other)
		 *  반환값: boolean
		 *  기능 : 두 객체를 비교해서 같은 객체이면 true를 반환한다.
		 *  	  두 객체의 주소값을 비교한다.(완전히 동일한 객체일 때만 true다)
		 *  	  동일성을 비교한다.
		 *  
		 *  재정의 : 객체가 서로 다르더라도 멤버변수가 같은 값을 가지고 있으면 같은 객체로 판정하도록 재정의하자.
		 *  	   동등성을 비교한다.
		 *  	   * String 클래스는 문자열의 내용이 동일하면 같은 객체로 판정하도록 equals() 메서드를 재정의하고 있다.
		 *  	   * 문자열을 비교할 때 equals() 메서드를 사용해서 비교해야 한다.
		 */
		
		// User에서 equals() 메서드를 재정의하였다.
		// 동등성비교
		System.out.println("### 동등성 비교");
		System.out.println(user1.equals(user2)); //true
		System.out.println(user1.equals(user3)); //true
		
		// == 연산자는 언제나 객체의 주소값을 비교한다.
		// 객체를 비교할 때 == 연산자로 비교하지 않는다.
		System.out.println("### 동일성 비교");
		System.out.println(user1 == user2);	//false
		System.out.println(user1 == user3);	//true
	}
}
