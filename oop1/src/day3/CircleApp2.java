package day3;

public class CircleApp2 {
	public static void main(String[] args) {
		
		/*
		 *  Circle 객체를 생성해서 원의 둘레와 원의 넓이를 조사하기
		 *  - 원의 둘레와 넓이를 조사하기 위해서는 원주율 값과 반지름 값이 필요하다.
		 *  - 모든 Circle 객체의 원주율은 동일하기 때문에 원주율은 객체마다 인스턴스 변수를 생성해서 저장하지 않는다.
		 *  - 각각의 Circle 객체마다 반지름은 전부 제각각이기 때문에 객체마다 인스턴스 변수를 생성해서 반지름을 저장하게 한다.
		 *  - 따라서, 원주율은 클래스변수로 정의하고, 반지름은 인스턴스 변수로 정의한다.
		 *  - 객체 생성할 때마다 반지름 값을 생성자의 매개변수로 전달해서 객체의 멤버변수(반지름을 저장하는 변수: r)를 초기화한다.
		 */
		
		Circle c1 = new Circle(1.0);
		Circle c2 = new Circle(3.0);
		Circle c3 = new Circle(6.0);
		
	}
}
