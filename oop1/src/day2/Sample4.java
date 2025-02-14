package day2;

public class Sample4 {
	
	/*
	 * 메서드 중복정의
	 * - 하나의 클래스 안에 이름이 같은 메서드를 여러 개 정의하는 것
	 * - 단, 메서드의 매개변수가 서로 달라야 한다.
	 * - (매개변수의 타입, 개수가 서로 달라야 한다.)
	 * - * 매개변수의 이름이 서로 다른 것은 중복정의할 수 없다.
	 */
	
	//정수 2개를 전달받아서 합계를 구하고 그 값을 반환하는 메서드
	int sum(int x, int y) {
		return x + y;
	}
	
	//정수 3개를 전달받아서 합계를 구하고 그 값을 반환하는 메서드
	int sum(int x, int y, int z) {
		return x + y + z;
	}
	//실수 2개를 전달받아서 합계를 구하고 그 값을 반환하는 메서드
	double sum (double x, double y) {
		return x + y;
	}
	//실수 3개를 전달받아서 합계를 구하고 그 값을 반환하는 메서드
	double sum(double x, double y, double z) {
		return x + y + z;
	}
}
