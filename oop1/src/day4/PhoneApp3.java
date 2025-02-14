package day4;

public class PhoneApp3 {
	public static void main(String[] args) {
		
		//Galaxy객체를 Phone 타입 참조변수로 참조한다.
		Phone p1 = new Galaxy();
		p1.call();		//Phone객체의 기능이다
		p1.receive();	//Phone객체의 기능이다
		
		SmartPhone p2 = (SmartPhone) p1;
		p2.call();
		p2.receive();
		p2.internet();	//SmartPhone 객체의 기능이다
		p2.game();		//SmartPhone 객체의 기능이다
		
		Galaxy p3 = (Galaxy) p1;
		p3.call();
		p3.receive();
		p3.internet();
		p3.game();
		p3.samsungPay(); //Galaxy 객체의 기능이다
		
	}
}
