package day1.demo3;

public class CarApp2 {
	public static void main(String[] args) {
		
		SimpleCar c1 = new SimpleCar();
		Sonata c2 = new Sonata();
		Avante c3 = new Avante();
		
		//자동차 기능 테스트하기
		CarTester tester = new CarTester();
		
		// testStartAndStop(Car car) { ... }
		// Car 타입의 모든 객체를 매개변수 인자로 전달할 수 있다.
		// 즉, SimpleCar, Sonata, Avante 객체의 주소값을 전달할 수 있다.
		// SimpleCar, Sonata, Avante는 Car 인터페이스의 하위 클래스다.
		tester.testStartAndStopCar(c1);
		tester.testStartAndStopCar(c2);
		tester.testStartAndStopCar(c3);
		
		tester.testSpeedUpAndDown(c1);
		tester.testSpeedUpAndDown(c2);
		tester.testSpeedUpAndDown(c3);
		
		// testNavigate(Navi navi) { ... }
		// Navi 인터페이스를 구현한 객체를 매개변수 인자로 전달할 수 있다.
		// 즉, Sonata 객체의 주소값을 전달할 수 있다.
//		tester.testNavigate(c1); //컴파일 오류
		tester.testNavigate(c2);
//		tester.testNavigate(c3); //컴파일 오류
		
		// testCooling(Aircon airCon) { ... }
		// AirCon 인터페이스를 구현한 객체를 매개변수 인자로 전달할 수 있다.
		// 즉, Sonata, Avante 객체의 주소값을 전달할 수 있다.
		// Sonata, Avante는 AirCon 인터페이스의 하위 클래스다.
//		tester.testCooling(c1);	//컴파일 오류
		tester.testCooling(c2);
		tester.testCooling(c3);
		
	}
}
