package day2;

public class Sample2 {
	public static void main(String[] args) {
		
	}
	//매개변수가 없는 메소드 정의하기
	void m1() {
		System.out.println("m1() 메소드가 실행됨");
	}
	
	//매개변수가 있는 메소드 정의하기
	void m2(int x) {
		System.out.println("m2(int x) 메소드가 실행됨");
		System.out.println("m2 메소드가 전달받은 값: " + x);
	}
	
	void m3(int x, int y) {
		System.out.println("m3(int x, int y) 메소드가 실행됨");
		System.out.println("m3 메소드가 전달받은 값: " + x + ", " + y);
	}
	
	void m4(double x, double y) {
		System.out.println("m4(double x, double y) 메소드가 실행됨");
		System.out.println("m4 메소드가 전달받은 값: " + x + ", " + y);
	}
	
	void m5(String name, int kor, int eng, int math) {
		
	}
	
	//반환값이 있는 메소드 정의하기
	int m6() {
		System.out.println("m6() 메소드가 실행됨");
		return 10;
	}
	
	void m7() {
		System.out.println("m7() 메소드가 실행됨");
	}
}
