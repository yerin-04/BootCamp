package day4;

public class SwitchDemo1 {
	public static void main(String[] args) {
		/* switch ~ case 문
		 *  형식
		 *  	switch (값) {
		 *  		case 값1:
		 *  			수행문;
		 *  			수행문;
		 *  			break;
		 * 			case 값2:
		 * 				수행문;
		 * 				break;
		 * 			default:
		 * 				수행문;
		 * 		}
		 * 		- switch(값)에서 값의 타입은 정수, 문자, 문자열, enum만 가능하다 (실수, 참조변수값 사용불가)
		 * 		- break문을 생략하면 제시된 값과 일치하는 케이스의 수행문을 실행하고, 남아
		 * 		
		 * 		- 제시된 값과 값1, 값2, 값3등과 == 비교만 가능하다
		 * 		  (비교 가능한 값의 개수가 제한적일 때만 사용한다)
		 */
		
		/* 포인트 계산하기
		 * 구매금액과 상관없이 고객의 등급에 따라서 직립률이 결정된다
		 * 고객등급이 "gold"면 5% 적립, "silver"면 2% 적립, "bronze"면 1%를 적립하고, 그 외는 0.05%를 적립한다
		 * 
		 */
		
		int orderPrice = 1000000;
		String grade = "silver";
		double depositRate = 0.0;
		int point = 0;
		
		//고객등급에 맞는 적립률이 변수에 대입된다
		switch (grade) {
			case "gold":
				depositRate = 0.05;
				break;
			case "silver":
				depositRate = 0.02;
				break;
			case "bronze":
				depositRate = 0.01;
				break;
			default:
				depositRate = 0.005;
		}
		
		point = (int)(orderPrice*depositRate);
		
		System.out.println("고객등급: " + grade);
		System.out.println("적립률: " + depositRate);
		System.out.println("구매금액: " + orderPrice);
		System.out.println("포인트: " + point);
	}
}
