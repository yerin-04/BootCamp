package day4;

public class SwitchDemo2 {
	public static void main(String[] args) {
		/* switch 표현식
		 * - java14부터 지원된다
		 * 형식
		 * 	switch(값) {
		 * 		case 값1 -> 수행문;
		 * 		case 값2 -> 수행문;
		 * 		default -> 수행문;
		 * 	}
		 * 
		 *  자료형 변수 = switch(값) {
		 *  	case 값1 -> 표현식;
		 *  	case 값2 -> 표현식;
		 *  	default -> 표현식;
		 *  }
		 *  
		 *  * break를 매번 적지 않아도 된다
		 *  * switch 표현식의 실행결과를 변수에 대입할 수 있다
		 *  
		 */
		
		/* 포인트 계산하기
		 * 구매금액과 상관없이 고객의 등급에 따라서 직립률이 결정된다
		 * 고객등급이 "gold"면 5% 적립, "silver"면 2% 적립, "bronze"면 1%를 적립하고, 그 외는 0.05%를 적립한다
		 */
		
		int orderPrice = 1000000;
		String grade = "silver";
		double depositRate = switch(grade) {
			case "gold" -> 0.05;
			case "silver" -> 0.02;
			case "bronze" -> 0.01;
			default -> 0.005;
		};
		
		int point = (int)(orderPrice*depositRate);
		
		System.out.println("고객등급: " + grade);
		System.out.println("적립률: " + depositRate);
		System.out.println("구매금액: " + orderPrice);
		System.out.println("포인트: " + point);	
		
	}
}
