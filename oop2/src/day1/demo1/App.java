package day1.demo1;

public class App {
	public static void main(String[] args) {
		
		//추상클래스는 new 키워드로 객체를 생성할 수 없다.
//		Phone p1 = new Phone();
		
		System.out.println("### SmartPhone 타입을 객체 참조하기");
		SmartPhone p2 = new SmartPhone("010-1111-1111", "kt", "102.33.45.21");
		p2.on();
		p2.off();
		p2.call();	//p2는 SmartPhone 객체의 call()를 호출한다.
		p2.receive();
		
		System.out.println("### Phone 타입을 객체 참조하기");
		Phone p3 = new SmartPhone("010-1111-1111", "kt", "102.33.45.21"); //부모는 자식을 담을 수 있음
		p3.on();
		p3.off();
		p3.call();	//p3는 Phone 객체의 call()를 호출, SmartPhone의 call()이 호출됨
		p3.receive();
	}
}
