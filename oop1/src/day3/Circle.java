package day3;

public class Circle {
	
	static final double PI = 0;
	double r;
	
	Circle(double r) {
		this.r = r;
	}
	
	void round() {
		double result = 2*PI*r;
		System.out.println("원의 둘레: " + result);
	}
	
	void area() {
		double result = PI*r*r;
		System.out.println("원의 넓이: " + result);
	}
}
