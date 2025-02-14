package day2;

public class SampleApp3 {
	public static void main(String[] args) {
		
		Sample3 s3 = new Sample3();
		
		int x = 10;
		int y = 20;
		System.out.println("main 메서드의 현재값: " + x + ", " + y);
		
		s3.m1(x,  y);
		
		System.out.println("main 메서드의 현재값: " + x + ", " + y);
	}
}
