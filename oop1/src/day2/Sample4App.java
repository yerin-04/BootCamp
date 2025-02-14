package day2;

public class Sample4App {
	public static void main(String[] args) {
		Sample4 s4 = new Sample4();
		
		int result1 = s4.sum(10, 20);
		int result2 = s4.sum(10, 20, 30);
		double result3 = s4.sum(10.1, 20.3);
		double result4 = s4.sum(10.1, 20.3, 40.3);
		double result5 = s4.sum(10.1,  20); //int -> double 자동형변환
		
	}
}
