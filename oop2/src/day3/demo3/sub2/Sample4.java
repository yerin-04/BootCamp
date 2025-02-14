package day3.demo3.sub2;

import day3.demo3.sub1.Sample1;

public class Sample4 extends Sample1 {

	void method() {

//		a = 10;	//private 접근제한, 접근불가(같은 클래스가 아니다)
//		b = 20;	//default 접근제한, 접근불가(같은 패키지가 아니다)
		c = 30;	//protected 접근제한, 접근가능(같은 패키지가 아니지만, Sample1의 자손이다)
		d = 40;	//public 접근제한, 접근가능(접근 제한이 없다)
	}
}
