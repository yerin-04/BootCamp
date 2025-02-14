package day4;

public class InkjetPrinter extends Printer {
	
	/* 부모로부터 상속받은 메서드 재정의하기
	 * 	- 자식 클래스에서는 부모로부터 상속받은 메서드를 자신의 상황에 맞게 똑같은 이름의 메서드로 재정의할 수 있다.
	 */
	@Override
	void print() {
		System.out.println("컬러로 인쇄합니다.");
	}
}
