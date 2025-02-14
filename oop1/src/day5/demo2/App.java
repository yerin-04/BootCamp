package day5.demo2;

public class App {

	public static void main(String[] args) {
		
		Parent p = new Child3();
		
		/*
		 * instanceof 연산자
		 * 	- 참조변수가 참조하고 있는 객체의 실제 타입을 조사하는 연산자다.
		 * 	- 형식
		 * 		참조변수 instanceof 타입
		 * 	- 작성 예
		 * 		p instanceof Child3
		 * 	- 연산결과
		 * 		true 혹은 false
		 * 	- 사용목적
		 * 		부모타입의 참조변수로 참조되는 객체에서(클래스 형변환된 상태) 
		 *   	특정 타입의 객체(부모 객체 혹은 자식객체)가 연결되어 있는지 조사하고 해당 타입으로 강제형변환하기 위해서 사용한다
		 */
		System.out.println(p instanceof Parent);
		System.out.println(p instanceof Child1);
		System.out.println(p instanceof Child2);
		System.out.println(p instanceof Child3);
		
		p.공통기능1();
		p.공통기능2();
		
		if ( p instanceof Child1) {
			Child1 c = (Child1) p;
			c.고유기능1();	//형변환 -> 고유기능 실행 가능
		} else if (p instanceof Child2) {
			Child2 c = (Child2) p;
			c.고유기능2();
		} else if (p instanceof Child3) {
			Child3 c = (Child3) p;
			c.고유기능3();
		}
		
		
	}
}
