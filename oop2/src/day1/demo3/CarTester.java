package day1.demo3;

public class CarTester {

	
	//시동걸기, 시동끄기 테스트 메서드
	void testStartAndStopCar(Car car) {
		car.start();
		car.stop();
	}
	
	//속도 증감 테스트 메서드
	void testSpeedUpAndDown(Car car) {
		car.speedUp();
		car.speedDown();
	}
	
	//길안내 기능 테스트 메서드
	void testNavigate(Navi navi) {
		navi.navigate();
	}
	
	//냉방기능 테스트 메서드
	void testCooling(AirCon airCon) {
		airCon.cooling();
	}
}
