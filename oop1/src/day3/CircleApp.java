package day3;

public class CircleApp {
	public static void main(String[] args) {
		//pi는 클래스 변수이기 때문에 클래스이름.변수명으로 즉시 사용할 수 있다.
		System.out.println("원주율: " + Circle.PI);
		
//컴파일 오류 발생
		//r은 인스턴스 변수기 때문에 
		//객체 생성 후 참조변수로 객체에 접근해서 이용해야 한다. 
		//객체 생성 없이 인스턴스 변수를 사용할 수 없다.
		//System.out.println("반지름: " + Circle.r);
		
		//System.out.println("자연로그 상수: " + Math.E);
		//System.out.println("원주율: " + Math.PI);
	}
}
