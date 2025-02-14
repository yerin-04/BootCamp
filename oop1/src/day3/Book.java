package day3;

/* 
 * Book 클래스로 Book 객체를 생성하고, 다양한 방법으로 Book 객체를 초기화해보자
 * 
 * 1. 별도의 초기화 작업을 실행하지 않기
 * 2. 제목만 초기화하기
 * 3. 제목, 저자, 출판사, 가격을 초기화하기
 * 4. 제목, 저자, 출판사, 가격, 할인율을 초기화하기
 * 5. 제목, 저자, 출판사, 가격, 할인율, 절판여부를 초기화하기
 * 
 */

public class Book {
	
	String title;
	String writer;
	String publisher;
	int price;
	double discountRate;
	boolean soldOut;
	
	//기본 생성자 메서드
	Book() {
		System.out.println("Book() 실행됨");
	}
	
	Book(String title) {
		//- 모든 멤버변수를 초기화하는 생성자 메서드를 호출하는 대신 제목, 저장, 출판사, 가격만 초기화하는 생성자 메서드를 호출해서 초기화작업을 수행하게 한다.
		this(title, "작자미상", "없음", 0);
		System.out.println("Book(String) 실행됨");
	}
	
	Book(String title, String writer, String publisher, int price) {
		//모든 멤버변수를 초기화하는 생성자를 호출해서 멤버변수 초기화를 실행시킨다.
		//부족한 값(전달받지 못한 값)은 적절한 값을 직접 설정한다.
		this(title, writer, publisher, price, 0.0); 
		System.out.println("Book(String, String, String, int) 실행됨");
	}
	
	Book(String title, String writer, String publisher, int price, double discountRate) {
		this(title, writer, publisher, price, discountRate, false); 
		System.out.println("Book(String, String, String, int, double) 실행됨");
	}
	
	Book(String title, String writer, String publisher, int price, double discountRate, boolean soldOut) {
		System.out.println("Book(String, String, int, double) 실행됨");
		this.title = title;
		this.writer = writer;
		this.publisher = publisher;
		this.price = price;
		this.discountRate = discountRate;
		this.soldOut = soldOut;
	}
}
