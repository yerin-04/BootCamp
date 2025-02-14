package day3.demo3.sub2;

import day3.demo3.sub1.Sample1;

public class Sample3 {

	void method1() {
		Sample1 s = new Sample1();
		
//		s.a = 10;	//private 접근제한, 접근불가(Sample1 클래스가 아니다.)
//		s.b = 20;	//default 접근제한, 접근불가(같은 패키지가 아니다.)
//		s.c = 30;	//protected 접근제한, 접근불가(같은 패키지가 아니다.)
		s.d = 40;	//public 접근제한, 접근가능(접근제한 없다.)
	}
}
