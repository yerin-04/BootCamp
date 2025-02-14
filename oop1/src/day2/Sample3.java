package day2;

import day1.school.Department;

public class Sample3 {
	public static void main(String[] args) {
		
	}
	//기본 자료형값을 인자값으로 전달받은 메서드
	//- 매개변수 a와 b에는 인자값으로 전달된 정수값이 저장된다
	void m1(int x, int y) {
		System.out.println("m1(int a, int b) 메서드 실행됨");
		System.out.println("m1 메서드가 전달받은 값 : " + x + ", " + y);
		x++;
		y++;
		System.out.println("m1 메서드의 현재 값: " + x + ", " + y);
	}
	
	//참조 자료형값(객체의 주소값)을 인자값으로 전달받는 메서드
	//- 매개변수 dept에는 인자값으로 전달된 Department 객체의 주소값이 저장된다
	void m2(Department dept) {
		System.out.println("m2(Department dept) 메서드 실행됨");
		System.out.println("m2 메서드가 전달받은 값 : " + dept.no);
		System.out.println("m2 메서드가 전달받은 값 : " + dept.name);
		System.out.println("m2 메서드가 전달받은 값 : " + dept.location);
		
		dept.name = "정보통신학과";
		dept.location = "제 2공학관";
		
		System.out.println("m2 메서드의 현재 값: " + dept.no);
		System.out.println("m2 메서드의 현재 값: " + dept.name);
		System.out.println("m2 메서드의 현재 값: " + dept.location);
	}
}
