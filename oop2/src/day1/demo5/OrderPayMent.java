package day1.demo5;

public class OrderPayMent {

	// Pay 인터페이스를 구현한 객체가 조립되는 멤버변수다.
	Pay pay;
	
	void order(int amount) {
		// Pay 인터페이스에서 구현한 default 메서드 실행하기
		pay.inputAmount(amount);
		pay.auth();
		
		// pay 참조변수에 연결된 Pay 구현객체의 실제 재정의된 credit 기능이 실행된다.
		pay.credit(amount);
	}
}
