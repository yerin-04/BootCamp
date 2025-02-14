package day5.demo1;

public class Phone {

	String number;
	String company;
	
	Phone() {
		super();
		System.out.println("Phone() 생성자 실행됨");
	}
	
	Phone(String number, String company) {
		super();
		System.out.println("Phone(String, String) 생성자 실행됨");
		this.number = number;
		this.company = company;
	}
	
	void call(String to) {
		System.out.println("[" + to + "]" + "전화를 겁니다.");
	}
	
	void receive(String from) {
		System.out.println("[" + from + "]" + "전화를 받습니다.");
	}
}
