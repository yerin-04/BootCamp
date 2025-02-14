package day4;

/* Galaxy는 스마트폰의 한 종류기 때문에 스마트폰의 모든 속성과 기능을 가진다.
 * Galaxy에서 직접 구현하는 대신 SmartPhone을 상속받았다.
 * Galaxy의 고유한 속성과 기능을 정의한다.
 */
public class Galaxy extends SmartPhone {

	void samsungPay() {
		System.out.println("삼성페이로 결제합니다.");
	}
	
	
	
}
