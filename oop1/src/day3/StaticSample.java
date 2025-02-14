package day3;

/* 클래스 변수의 특징을 확인하기 위한 예제 클래스임
 * 실제 프로젝트에서 아래와 같이 코딩할 일 없음.
 */
public class StaticSample {
	
	static int x; //0으로 초기화된다.
	int y; //0으로 초기화된다.
	
	StaticSample() {
		StaticSample.x++;
		y++;
	}
	
	void show() {
		System.out.println("x의 값: " + StaticSample.x);
		System.out.println("y의 값: " + y);
	}
}
