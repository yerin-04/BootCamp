package day4;

public class IfDemo1 {
	public static void main(String[] args) {
		/* if문
		 * 조건식이 true로 판정될 때 수행할 수행문을 작성
		 *   형식
		 *   	if (조건식) {
		 *   		수행문;
		 *   		수행문;
		 *   	}
		 *   *수행문이 하나일 때는 여는 괄호와 닫는 괄호를 생략할 수 있다. (생략하는 것은 추천하지 않는다.)
		 */
		
		/* 국어, 영어, 수학 점수에 대한 평균을 계산했을 때 60점 이상이면 "합격"이 출력되게 한다.
		 * - 조건식: 평균이 60점 이상인가?
		 */
		int kor = 100;
		int eng = 80;
		int math = 60;
		
		double average =(kor + eng + math)/3.0;
		
		if (average >= 60) {
			System.out.println("합격");
		}
	}
}
