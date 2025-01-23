package day4;

public class IfDemo2 {
	public static void main(String[] args) {
		/* if else구문
		 *   조건식이 true로 판정될 때 수행할 수행문과 
		 *   	    false로 판정될 때 수행할 수행문 작성
		 *   형식
		 *   	if (조건식) {
		 *   		//조건식이 true로 판정될 때 수행되는 블록
		 *   		수행문;
		 *   		수행문;
		 *   	} else {
		 *   		//조건식이 false로 판정될 때 수행되는 블록
		 *   		수행문;
		 *   		수행문;
		 *   	}
		 * 
		 */
		
		/* 구매금액에 따른 포인트 지급하기
		 * 구매금액이 10만원 이상이면 구매금액의 1%를 포인트로 지급
		 * 그 외는 구매금액의 0.3%를 포인트로 지급한다
		 * 단, 포인트는 정수값이다
		 * 조건식: 구매금액이 10만원 이상인가?
		 * 수행문: true -> 1%지급, false -> 0.3%지급
		 */
		
		int orderPrice = 1000;
		int point = 0;
		
		if (orderPrice >= 100000) {
			point = (int)(orderPrice*0.1);
		}
		else {
			point = (int)(orderPrice*0.3);
		}
		System.out.println("적립포인트: " + point);
	}
}
