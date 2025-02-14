package day1.demo1;

/*
 * Phone은 전화 기능을 표현하는 클래스다.
 * 	- 전원 켜기, 전원 끄기 기능은 모든 전화기 객체가 공통으로 가지는 기능이고, 구현 내용도 동일하다.
 * 		+ 전원 켜기, 전원 끄기는 Phone에서 구현하고, 하위 클래스에서 상속받는다.
 * 	- 전화 걸기, 전화 받기 기능은 모든 전화기 객체가 공통으로 가지는 기능이지만, 구현 내용은 개별전화기마다 다를 수 있다.
 * 		+ 전화 걸기, 전화 받기는 Phone에서 추상화하고, 하위 클래스에 구현을 위임한다.
 * 
 * Phone은 추상 클래스다.
 * 	- 추상메서드를 보유할 수 있다.
 */
public abstract class Phone {
	
	// 추상 클래스는 멤버변수를 포함할 수 있다.
	String number;
	String company;
	
	// 추상 클래스는 생저아를 포함할 수 있다.
	// 추상 클래스에서 정의한 생성자는 자식 클래스에서 super() 메서드로 호출해서 초기화에 활용한다.
	public Phone(String number, String company) {
		this.number = number;
		this.company = company;
	}

	// 추상클래스는 멤버메서드를 포함할 수 있다.
	// 전원 켜기, 전원 끄기는 Phone에 구현하고 모든 전화기 객체가 상속받는다.
	void on() {
		System.out.println("전원을 켠다.");
	}
	void off() {
		System.out.println("전원을 끈다.");
	}
	
	// 전화 걸기, 전화 받기는 Phone에서 추상화하고, 모든 전화기 객체가 메서드 재정의를 통해서 구현하게 한다.
	abstract void call();
	abstract void receive();
}
