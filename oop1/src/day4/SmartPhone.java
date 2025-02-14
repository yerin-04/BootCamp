package day4;

/* 전화기의 공통속성, 공통기능을 Phone으로부터 상속받고, 스마트폰의 고유한 속성, 고유한 기능만 정의한다.
 * 
 */
public class SmartPhone extends Phone {
	
	String email;
	String ip;
	
	void internet() {
		System.out.println("인터넷 기능을 사용합니다.");
	}
	
	void game() {
		System.out.println("게임 기능을 사용합니다.");
	}
}
