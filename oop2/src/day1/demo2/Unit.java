package day1.demo2;

public abstract class Unit {

	// 공통 속성
	// 	- 유닛의 현재 위치를 표현하는 멤버변수
	int x;
	int y;
	
	// 공통 기능
	abstract void move(int x, int y);
	
	void stop() {
		System.out.println("현재 좌표[" + x + ", " + y +"]에서 멈춘다.");
	}
	
	
}
