package day3.demo3.sub1;

public class Sample2 {

	void method() {
		Sample1 s = new Sample1();
		
//		s.a = 10;	//private 접근제한, 접근불가
		s.b = 20;	//default 접근제한, 접근가능(같은 패키지이기 때문에)
		s.c = 30;	//protected 접근제한, 접근가능(같은 패키지이기 때문에)
		s.d = 40;	//public 접근제한, 접근가능(접근제한 없기 때문에)
	}
}
