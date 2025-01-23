package day4;

public class IfDemo3 {
	public static void main(String[] args) {
		/* if ~ else if ~ else if ~ else문
		 *   제시된 조건식이 여러 개일 때 사용하는 구문이다
		 *   형식
		 *   	if (조건식1) {
		 *   		수행문;
		 *   	} else if (조건식2) {
		 *   		수행문;
		 *   	} else if (조건식3) {
		 *   		수행문;
		 *   	} else {
		 *   		수행문;
		 *   	}
		 */
		
		/* 구매금액에 따른 포인트 지급
		 * 구매금액이 100만원 이상이면 5% 적립하고
		 * 구매금액이 50만원 이상이면 2% 적립하고
		 * 구매금액이 10만원 이상이면 0.5% 적립하고
		 * 그 외는 0.01% 적립한다
		 * - 조건 : 100만원 이상인가? 50만원 이상인가? 10만원 이상인가?...
		 */
		
		int orderPrice = 1500000;
		//적립률 담는 변수를 선언하고 초기값으로 0을 대입한다
		double depositRate = 0; //초기값을 0.001로 설정하면 else문을 지울 수 있음
		
		if (orderPrice >= 100) {
			depositRate = 0.05;
		} else if (orderPrice >= 500000) {
			depositRate = 0.02;
		} else if (orderPrice >= 100000) {
			depositRate = 0.005;
		} else {
			depositRate = 0.001;
		}
		
		double point = orderPrice*depositRate;
		
		System.out.println("구매금액: " + orderPrice);
		System.out.println("적립률: " + depositRate);
		System.out.println("적립포인트: " + point);
	}
}
