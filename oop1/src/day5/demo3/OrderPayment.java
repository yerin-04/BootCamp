package day5.demo3;

public class OrderPayment {
	
	/*
	 * 매개변수의 다형성
	 * 	- 매개변수의 타입을 부모클래스 타입으로 지정하면 해당 부모 타입의 객체 및 모든 자식 타입 객체를 전달받을 수 있다
	 * 	- 하나의 매개변수 타입으로 여러 종류의 자식객체를 인자로 전달받을 수 있는 이점이 있다
	 * 	- 매개변수의 타입을 지정함으로써 전달받을 수 있는 객체의 범위를 결정할 수 있다
	 * 	  예) test(Phone phone)
	 * 			- 전화걸기, 받기가 가능한 모든 전화기류 객체를 전달받을 수 있다
	 * 		  test(SmartPhone smartPhone)
	 * 			- 인터넷하기, 게임하기 등이 가능한 모든 스마트폰류 객체만 전달받을 수 있다
	 * 		  test(Iphone iphone)
	 * 			- 애플뮤직, 애플페이 등이 가능한 모든 아이폰류 객체만 전달받을 수 있다
	 * 		  test(Object object)
	 * 			- 모든 종류의 객체를 전달받을 수 있다
	 */
	void 결재하기(int amount, Pay pay) { 
		System.out.println("[" + amount + "]원 결재를 시작합니다.");
		
		// Pay의 공통기능 실행하기
		pay.결제금액입력();
		pay.인증하기();
		
		// 각각의 Pay객체의 고유한 결재기능 실행하기
		if (pay instanceof SamsungPay) {
			SamsungPay p = (SamsungPay) pay;
			p.삼성페이결재();
		} else if (pay instanceof ApplePay) {
			((ApplePay) pay).애플페이결재();
		}
	}
}
