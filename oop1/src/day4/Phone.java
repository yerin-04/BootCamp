package day4;

/* Phone 클래스에는 모든 전화기의 공통속성(전화번호), 공통기능(전화걸기, 전화받기)을 정의한다.
 * 
 */

public class Phone {
	
	String number;
	
	void call() {
		System.out.println("전화를 겁니다.");
	}
	
	void receive() {
		System.out.println("전화를 받습니다.");
	}
	
}
