package day1.demo3;

/* SimpleCar 클래스
 * 	- Car 인터페이스를 구현하는 구현 클래스다.
 */
public class SimpleCar implements Car {

	String name;
	int speed;
	
	@Override
	public void start() {
		System.out.println("[" + name + "] 자동차 시동을 켭니다.");
	}

	@Override
	public void stop() {
		System.out.println("[" + name + "] 자동차 시동을 끕니다.");
	}

	@Override
	public void drive() {
		System.out.println("[" + name + "] 자동차를 운전합니다.");
		
	}

	@Override
	public void speedUp() {
		System.out.println("[" + name + "] 자동차 속도를 높입니다.");
		speed += 10;
		//지정된 최고속도를 넘어서면 현재 속도를 지정된 최고속도로 설정한다.
		if (speed >= Car.MAX_SPEED) {
			speed = Car.MAX_SPEED;
		}
	}
	
	@Override
	public void speedDown() {
		System.out.println("[" + name + "] 자동차 속도를 높입니다.");
		speed -= 10;
		//지정된 최저속도 이하면 현재 속도를 지정된 최저속도로 설정한다.
		if (speed <= Car.MIN_SPEED) {
			speed = Car.MIN_SPEED;
		}
	}

	
}
