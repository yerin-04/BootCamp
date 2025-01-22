package day3;

public class OpDemo8 {
	public static void main(String[] args) {
		/*
		 * 논리 연산자
		 *  &&  ||  !
		 *  - 논리곱(and), 논리합(or), 논리부정(not)
		 *  - 논리연산자의 피연산자는 true, false 혹은 연산결과가 true, false인 연산식(비교 연산식)이다
		 *    논리연산자의 연산 결과는 true 혹은 false 중 하나다
		 *  
		 *  - 논리곱연산자는 P && Q에서 P가 false로 판정되면 Q를 확인하지 않고 최종 연산결과를 false로 판정한다
		 *  - 논리합연산자는 P || Q에서 P가 true로 판정되면 Q를 확인하지 않고 최종 연산결과를 true로 판정한다
		 *  - 따라서, Q측에 변수의 값을 변경하는 코드가 있으면 안 된다 (Q측의 코드는 실행될 수 있고 실행되지 않을 수도 있기 때문)
		 *  
		 *  - 논리연산자는 2개 이상의 비교 연산을 합쳐서 최종 판단을 내릴 때 사용되는 연산자다
		 */
		
		/* 판정 기준
		 *  자동차 무상수리 조건
		 *  - 운행기간이 3년 미만이고, 운행거리가 5만km 미만
		 *  - 논리곱
		 */
		int years = 4;
		int distance = 45000;
		
		boolean result1 = years < 3 && distance < 50000;
		System.out.println("무상수리 여부: " + result1);
		
		/* 판정 기준
		 *  자동차 무상수리 조건
		 *  - 운행기간이 3년 미만이고, 운행거리가 5만km 미만
		 *  - 고객등급(1, 2, 3등급이 있다)이 1등급이면 운행기간을 5년까지 보증한다
		 *  - 논리곱
		 */
	}
}
