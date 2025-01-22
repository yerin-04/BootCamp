package day1;

import java.math.BigDecimal;
//다른 패키지, 외부 라이브러리에서 제공하는 클래스를 사용할 때는 import 구문으로 사용할 클래스를 미리 포함시켜야 한다

public class VarDemo3 {
	public static void main(String[] args) {
		/*실수 자료형(데이터 타입)
		 * float, double
		 * 대표 자료형은 double이다
		 * 대부분의 실수값은 double 타입의 변수로 저장하자 (float 타입의 변수를 선언하는 경우는 거의 없다)
		 */
		double num1 = 0.1;
		double num2 = 0.2;
		float num3 = 3.14f;
		float num4 = 0.1234F;
		
		//자바의 실수 표현방식은 부동소수점 방식을 사용한다
		//부동소수점 방식은 실제 실수값의 근사값을 표현한다
		//부동소수점 값의 사칙연산은 예상결과와 다른 값이 나올 수 있다
		
		double num5 = 0.25;
		double num6 = 0.5;
		
		System.out.println(num1 + num2); //0.30000000000000004
		System.out.println(num5 + num6); //0.75
		
		/* 부동 소수점의 연산은 연산오류를 방지하기 위해서
		 * 1. int나 long 타입으로 변환한 후 연산한다
		 * 2. BigDecimal 클래스를 이용해서 연산한다.	 */
		
		double result1 = (num1*10 + num2*10)/10;
		System.out.println(result1);
		
		
		//매우 정밀한(매우 큰) 실수값에 대한 연산을 지원하는 BigDecimal를 이용한다.
		BigDecimal big1 = new BigDecimal("0.1");
		BigDecimal big2 = new BigDecimal("0.2");
		BigDecimal big3 = big1.add(big2);
		System.out.println(big3);
	}
}
