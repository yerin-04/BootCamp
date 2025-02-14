package day3;

public class StaticSampleApp {
	public static void main(String[] args) {
		
		StaticSample s1 = new StaticSample();
		s1.show();	//x값: 1, y값: 1
		
		
		StaticSample s2 = new StaticSample();
		s2.show();	//x값: 2, y값: 1
		
		StaticSample s3 = new StaticSample();
		s3.show();	//x값: 3, y값: 1
		
		/*
		 * - 클래스 변수 x는 클래스가 메모리에 로딩되는 순간 딱 한번 생성되고 계속 유지된다.
		 * - 인스턴스 변수 y는 객체가 생성될 때마다 매번 객체 안에 새로 생성된다.
		 * 	 그렇기 때문에 
		 * 	 s1이 참조하는 객체의 값이 0에서 1증가되어 1이 된다.
		 * 	 s2이 참조하는 객체의 값이 0에서 1증가되어 1이 된다.
		 * 	 s3이 참조하는 객체의 값이 0에서 1증가되어 1이 된다.
		 * 
		 */
	}
}
