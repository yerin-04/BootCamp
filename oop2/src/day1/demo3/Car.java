package day1.demo3;

public interface Car {

	/* Car인터페이스
	 * 	자동차의 최고/최저 속도를 정의하는 상수,
	 * 	자동차의 기본적인 기능을 정의하는 추상메서드를 정의하는 인터페이스다.
	 */
	
	//상수
	public static final int MAX_SPEED = 200;
	int MIN_SPEED = 0;
	
	//추상메서드
	public abstract void start();
	public abstract void stop();
	void drive();
	void speedUp();
	void speedDown();
}
