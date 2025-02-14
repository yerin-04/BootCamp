package day1.demo5;

/* Pay 인터페이스다.
 * 	- 결재관련 구현객체가 반드시 구현할 기능을 추상화한다.
 */
public interface Pay {
	
	//default 메서드 정의하기
	//	- 인터페이스에서 구현부가 있는 메서드를 정의할 수 있다.
	//	- 이 인터페이스를 구현하는 모든 하위 구현클래스에 상속된다.
	//	- java8부터 사용가능하다.
	default void inputAmount(int amount) {
		System.out.println("결제금액: [" + amount + "] 원을 입력합니다.");
	}
	
	default void auth() {
		System.out.println("사용자 인증을 진행합니다.");
	}
	
	//추상 메서드 정의하기
	//	- 결제관련 구현객체가 반드시 구현한 기능을 추상화한다.
	void credit(int amount);
}
