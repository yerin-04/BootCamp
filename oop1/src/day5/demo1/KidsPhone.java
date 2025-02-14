package day5.demo1;

public class KidsPhone extends Phone {
	
	String parentPhoneNumber;
	
	KidsPhone(String parentPhoneNumber, String number, String company) {
		super(number, company);
		this.parentPhoneNumber = parentPhoneNumber;
	}
	
	/* 
	 * KidsPhone의 전화걸기 기능 재정의하기
	 * 	- 자녀가 전화를 걸면 지정된 번호로 전화를 건다
	 * 	- 부모에게 자녀와 통화하는 사람의 전화번호가 문자로 전송된다
	 */
	@Override
	void call(String to) {
		//아래의 기능은 Phone의 call 메서드에 이미 구현된 기능이다
		//Phone에 구현된 기능을 중복해서 다시 작성하는 대신 Phone의 call 메서드를 실행하자
//		System.out.println("[" + to + "]에 전화를 겁니다.");
		super.call(to);
		
		//아래의 기능은 KidsPhone의 고유한 기능이다
		System.out.println("[" + parentPhoneNumber + "]에게 [" + to + "] 전화를 겁니다.");
	}
}
