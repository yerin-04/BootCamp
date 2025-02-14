package day1.demo2;

public class Marine extends Unit {

	@Override
	void move(int x, int y) {
		System.out.println("다음 좌표[" + x + ", " + y + "]로 걸어서 이동한다.");
	}
	
	void steampack() {
		System.out.println("마린은 스팀팩을 사용한다.");
	}
}
