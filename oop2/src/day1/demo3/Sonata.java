package day1.demo3;

public class Sonata extends AbstractCar implements Navi, AirCon {

	@Override
	public void speedUp() {
		System.out.println("소나타의 속도를 증가시킨다.");
	}

	@Override
	public void speedDown() {
		System.out.println("소나타의 속도를 감소시킨다.");
	}

	@Override
	public void cooling() {
		System.out.println("소나타 내부 온도를 시원하게 유지한다.");
	}

	@Override
	public void navigate() {
		System.out.println("소나타가 목적지까지 길을 안내한다.");
	}
	
}
