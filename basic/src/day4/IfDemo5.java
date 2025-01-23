package day4;

public class IfDemo5 {
	public static void main(String[] args) {
		/* 중첩 if문
		 *   if 블록 혹은 else 블록 내에서 포함된 if문	 */
		
		/* 포인트 지급하기
		 * 구매금액이 50만원 이상이면 2% 적립
		 * 그 외는 0.05%를 적립한다
		 * 단, 50만원 이상 구입한 고객중에서 고객등급이 1등급인 고객은 1% 추가 적립한다
		 * 조건 : 50만원 이상인가?
		 * 		 50만원 이상이고, 고객등급이 1등급인가?
		 */
		
		int customerGrade = 2;
		int orderPrice = 100000;
		
		double depositRate = 0.0;
		if (orderPrice >= 500000) {
			depositRate = 0.02;
			//중첩 if문
			if (customerGrade == 1) {
				depositRate += 0.01;
			} else if (customerGrade == 2) {
				depositRate += 0.05;
			} else if (customerGrade == 3) {
				depositRate += 0.02;
			}
		} else {
			depositRate = 0.005;
		}
		
		int point = (int)(orderPrice*depositRate);
		
		System.out.println("고객등급: " + customerGrade);
		System.out.println("구매금액: " + orderPrice);
		System.out.println("적립률: " + depositRate);
		System.out.println("적립금액: " + point);
		
	}
}
