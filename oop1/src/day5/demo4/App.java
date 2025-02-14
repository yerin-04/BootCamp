package day5.demo4;

public class App {
	public static void main(String[] args) {
		//객체를 조립하고 실행하기
		
		//1. 조립에 필요한 객체를 생성한다
		OrderPayment orderPayment = new OrderPayment();
		
		ApplePay pay1 = new ApplePay();
		SamsungPay pay2 = new SamsungPay();
		
		//2. 객체를 조립한다
		orderPayment.pay = pay1;
		
		//3. 필요한 기능을 실행시킨다
		orderPayment.order(35000);
	}
}
