package day5.demo3;

public class App2 {
	public static void main(String[] args) {
		
		//객체 조립하기
		
		//1.조립에 사용도리 객체를 생성한다.
		OrderPayment2 order2 = new OrderPayment2();
		
		SamsungPay pay2 = new SamsungPay();
		
		//2.객체를 조립한다
		// 	의존성 주입
		//		- 의존하는 객체를 다른 외부 존재(제 3자)가 결정해서 조립하는(주입하는) 것이다
		//		-  OrderPayment2가 의존하는 Pay류 객체를 조립했다
		order2.pay = pay2;
		
		//3.필요한 업무 실행하기
		order2.결재하기(100000);
	}
}
