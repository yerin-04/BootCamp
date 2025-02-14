package day1.demo3;

/* AbstractCar 추상 클래스
 * 	- Car 인터페이스에서 추상화된 자동차의 기능 중에서 모든 자동차들에서 동일하게 구현하는 기능은 
 * 	  AbstractCar 추상클래스를 미리 구현한다. 
 * 	  하위 자동차 클래스가 이 추상클래스를 상속받으면 몇몇 기능들이 이미 구현되어 있기 때문에 구현부담이 감소된다.
 */
public abstract class AbstractCar implements Car {
	
	@Override
	public void start() {
		System.out.println("시동을 켭니다.");
	}
	
	@Override
	public void stop() {
		System.out.println("시동을 끕니다.");
	}
	
	@Override
	public void drive() {
		System.out.println("자동차를 운전합니다.");
	}

}
