package day1.demo1;

/* SmartPhone은 Phone 추상클래스를 상속받았다.
 * 	- Phone 추상클래스에는 전화걸기, 전화받기 기능이 추상화되어 있다.
 * 	- Phone 추상클래스를 상속받는 하위클래스(구현클래스)는 메서드재정의를 이용해서 상속받은 추상메서드를 구현해야 한다.
 */
public class SmartPhone extends Phone {
	
	String ip;
	/*
	 * 
	 * 
	 *  - 해당 공통기능은 모든 하위 클래스가 가지고 있는 기능이지만, 
	 *  하위 클래스마다 구현내용이 다른 기능일 때 공통기능에 대한 메서드만 설계하고, 
	 *  구현은 해당 하위클래스에서 하게 한다.
	 */
	SmartPhone(String number, String company, String ip) {
		super(number, company);
		this.ip = ip;
	}
	
	//Phone에서 추상화한 전화걸기 기능을 구현하였다.
	void call() {
		System.out.println("스마트폰으로 전화를 겁니다.");
	}
	
	//Phone에서 추상화한 전화받기 기능을 구현하였다.
	void receive() {
		System.out.println("스마트폰으로 전화를 받습니다.");
	}
	
}
