package day1.demo2;

public class Dropship extends Unit {

	@Override
	void move(int x, int y) {
		System.out.println("다음 좌표[" + x + ", " + y + "]로 날아서 이동한다.");
	}
	
	void load() {
		System.out.println("운반선에 물자 및 병사를 싣는다.");
	}
	
	void unload() {
		System.out.println("운반선에서 물자 및 병사를 내린다.");
	}
}
