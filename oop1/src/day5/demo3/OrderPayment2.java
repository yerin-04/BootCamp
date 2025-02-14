package day5.demo3;

public class OrderPayment2 {
	
	/* 인스턴스 변수의 다형성
	 * 	- 인스턴스 변수를 부모타입의 참조변수로 선언하면 여러 종류의 자식 객체를 인스턴스 변수로 참조할 수 있다
	 * 	- 인스턴스 변수는 이 객체가 의존하는 객체가 조립될 참조변수(연결 잭)를 정의하는 것이다
	 */
	Pay pay;  //pay객체에 의존
	
	void 결재하기(int amount) {
		pay.결제금액입력();
		pay.인증하기();
		
		if (pay instanceof ApplePay) {
			((ApplePay) pay).애플페이결재();
		} else if (pay instanceof SamsungPay) {
			((SamsungPay) pay).삼성페이결재();
		}
	}
}
