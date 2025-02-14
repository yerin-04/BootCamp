package day2;

import day1.school.Department;

public class Sample3App2 {
	public static void main(String[] args) {
		
		Sample3 s3 = new Sample3();
		
		Department d1 = new Department();
		
		d1.no = 30;
		d1.name = "컴퓨터공학과";
		d1.location = "공학관";
		
		System.out.println("main 메서드: " + d1.name);
		
		//Department 객체의 주소값을 인자로 전달해서 m2 실행하기
		s3.m2(d1);
	}
}
