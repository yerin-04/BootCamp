package day3;
/*
 * 아래의 코드는 클래스 메소드의 동작 특성을 이해하기 위한 예제다.
 * 실제 프로젝트에서는 절대로 아래와 같은 형태로 사용하지 않는다.
 */
public class StaticSample2 {
	
	//클래스 변수
	static int x;
	//인스턴스 변수
	int y;
	
	//인스턴스 메서드
	void m1() {
		//인스턴스 메서드에는 클래스변수 사용 가능
		//			  	인스턴스변수 사용 가능
		System.out.println(StaticSample2.x);
		System.out.println(y);
		
		//인스턴스 메서드에서는 인스턴스 메서드 실행 가능
		//				  클래스 메서드 실행 가능
		m2();
		StaticSample2.m3();
	}
	
	//인스턴스 메서드
	void m2() {
		
	}
	
	//클래스 메서드
	static void m3() {
		
	}
	
	static void m4() {
		//클래스 메서드에서는 클래스 변수 사용 가능
		//				인스턴스 변수 사용 불가능
		System.out.println(StaticSample2.x);
//		System.out.println(y);
		
		//클래스 메서드에서는 인스턴스 메서드 실행 불가능
		//				클래스 메서드도 실행 가능
//		m2();
		StaticSample2.m3();
	}
}
