package day3;

public class OpDemo11 {
	public static void main(String[] args) {
		/* 조건 연산자(삼항 연산자)
		 * - 형식
		 * 	 조건식 ? 표현식1 : 표현식2
		 * 	 * 조건식이 true로 판정되면 표현식1의 값이 최종결과다
		 * 	 * 조건식이 false로 판정되면 표현식2의 값이 최종결과다
		 * - 3개의 피연산자를 가지는 연산자다
		 * - 주의사항
		 * 	 - 표현식1과 표현식2의 값은 같은 타입이어야 한다. average > 60 ? "합격" : 10; -> 불가능
		 *   - 표현식1과 표현식2의 값이 서로 다른 타입일 때는 형변환했을 때 같은 타입이 될 수 있어야 한다
		 */
		
		int average = 71;
		
		//합격여부 결정하기
		//평균이 60점 이상이면 "합격" 아니면 "불합격"이다
		String result = average > 60 ? "합격" : "불합격";
		System.out.println(result);
		
		/*포인트 지급하기
		 * 구매금액이 100만 원 이상이면 구매금액의 5%를 지급하고 그 외는 1만 원 지급한다
		 */
		int orderPrice = 2500000;
		double depositRate = 0.05;
		
		//표현식1과 표현식2의 값이 서로 다른 타입일 때는 형변환했을 때 같은 타입이 될 수 있어야 한다
		double point = orderPrice >= 1000000
						 ? orderPrice*depositRate //실수
						 : 10000;				  //정수
		System.out.println("포인트: " + point);
	}
}
