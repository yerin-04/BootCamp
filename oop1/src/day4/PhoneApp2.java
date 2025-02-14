package day4;

public class PhoneApp2 {
	public static void main(String[] args) {
		//Galaxy 객체를 Galaxy 타입 참조변수로 참조한다
		Galaxy p1 = new Galaxy();
		p1.call();		//Phone객체의 기능
		p1.receive();	//Phone객체의 기능
		p1.internet();
		p1.game();
		p1.samsungPay();
		
		//Galaxy 객체를 SmarthPhone 타입 참조변수로 참조한다.
		SmartPhone p2 = new Galaxy();
		p2.call();
		p2.receive();
		p2.internet();
		p2.game();
//		p2.samsungPay();
		
		//Galaxy 객체를 Phone타입 참조변수로 참조한다.
		Phone p3 = new Galaxy();
		p3.call();
		p3.receive();
//		p3.internet();
//		p3.game();
//		p3.samsungPay();
	}
}
