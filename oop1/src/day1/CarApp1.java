package day1;

public class CarApp1 {
	public static void main(String[] args) {
		
		//1. Car 클래스를 이용해서 객체 생성하기
		//		* Car 설계도를 객체를 생성함
		//		* 생성된 객체의 주소값을 변수에 대입하지 않았기 때문에 생성된 객체를 이용할 수 없음
		//		* 이 객체는 garbage 객체가 된다ㄴ
		new Car();
		
		//2. Car 클래스를 이용해서 객체를 생성하고, Car 타입의 참조변수에 객체의 주소값(참조값) 대입하기
		//		* Car 설계도로 객체를 생성함
		//		* 생성된 객체의 주소값을 참조변수에 대입함
		//		* 주소값이 저장된 참조변수는 객체를 참조함(연결됨)
		//		* c1, c2, c3 참조변수는 각각 다른 Car 객체와 연결되어 있다
		//		* c4에는 c1 참조변수의 주소값을 대입하였다
		//		* c1과 c4 참조변수는 같은 객체를 참조한다
		//		* 하나의 객체를 참조하는 참조변수는 여러 개 있을 수 있다
		Car c1 = new Car();
		Car c2 = new Car();
		Car c3 = new Car();
		Car c4 = c1;
		
		System.out.println("c1참조변수: " + c1);
		System.out.println("c2참조변수: " + c2);
		System.out.println("c3참조변수: " + c3);
		System.out.println("c4참조변수: " + c4);
		
	}
}
