package day4;

public class PhoneApp {
	public static void main(String[] args) {
		
		Phone p1 = new Phone();
		p1.number = "010-1111-1111";
		p1.call();
		p1.receive();
		
		SmartPhone p2 = new SmartPhone();
		p2.number = "010-2222-2222"; //Phone에서 상속받음
		p2.email = "hong@gmail.com";
		p2.ip = "192.168.10.2";
		p2.call();					 //Phone에서 상속받음
		p2.receive();				 //Phone에서 상속받음
		p2.internet();
		p2.game();
		
		Galaxy p3 = new Galaxy();
		p3.number = "010-3333-3333"; //Phone에서 상속받음
		p3.email = "kang@gmail.com"; //SmartPhone에서 상속받음
		p3.ip = "165.68.23.45";		 //SmartPhone에서 상속받음
		p3.call();			//Phone에서 상속받음
		p3.receive();		//Phone에서 상속받음
		p3.internet();		//SmartPhone에서 상속받음
		p3.game();			//SmartPhone에서 상속받음
		p3.samsungPay();
	}
}
