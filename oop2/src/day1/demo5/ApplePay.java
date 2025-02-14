package day1.demo5;

public class ApplePay implements Pay {

	@Override
	public void credit(int amount) {
		System.out.println("애플 페이로 [" + amount + "]원을 결제합니다.");
	}
}
