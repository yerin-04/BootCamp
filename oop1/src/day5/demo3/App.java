package day5.demo3;

public class App {
	public static void main(String[] args) {
		
		OrderPayment orderPayment = new OrderPayment();
		
		//Applepay를 결재수단으로 사용하기
		ApplePay applePay = new ApplePay();
		
		//SamsungPay를 결재수단으로 사용하기
		SamsungPay samsungPay = new SamsungPay();
		
		//결재하기
		orderPayment.결재하기(100000, applePay);
	}
}
