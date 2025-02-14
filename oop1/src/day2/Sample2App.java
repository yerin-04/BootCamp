package day2;

public class Sample2App {
	public static void main(String[] args) {
		
		Sample2 s2 = new Sample2();
		
		//매개변수 없는 메서드 실행하기
		s2.m1(); //전달할 인자값이 없어도 괄호는 꼭 필요함
		
		//매개변수 있는 메소드 실행하기
		s2.m2(10);
		s2.m2(20);
		s2.m3(100, 200);
		s2.m4(3.14, 2.44);
		s2.m4(3,  2); //자동형변환 정수->실수 (데이터손실이 발생하지 않기 때문에 가능)
		s2.m4(3.32, 2);
		
		int total = s2.m6(100, 80, 60);
	}
}
