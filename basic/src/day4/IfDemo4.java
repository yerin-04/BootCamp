package day4;

public class IfDemo4 {
	public static void main(String[] args) {
		int orderPrice = 300000;
		double depositRate = 0.001;
		
		if (orderPrice >= 1000000) {
			depositRate = 0.05;
		}
		
		if (orderPrice >= 500000) {
			depositRate = 0.02;
		}
		
		if (orderPrice >= 100000) { //항상 마지막 수행문만 출력됨. 잘못된 코드
			depositRate = 0.005;
		}
		
		System.out.println("구매금액: " + orderPrice);
		System.out.println("적립률: " + depositRate);
		
	}
}
