package day1.demo3;

public class Avante extends AbstractCar implements AirCon {

	@Override
	public void speedUp() {
		System.out.println("아반떼 속도를 증가합니다.");
	}

	@Override
	public void speedDown() {
		System.out.println("아반떼 속도를 감소합니다.");
	}

	@Override
	public void cooling() {
		System.out.println("아반떼 내부 온도를 시원하게 유지한다.");
	}	
}
