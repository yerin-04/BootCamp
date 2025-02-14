package day1;

public class BookApp1 {

	public static void main(String[] args) {
		/*
		 * Book book
		 * 	- Book 클래스로 생성한 Book 객체의 주소값을 저장하는 참조변수 book을 생성한다
		 */
		
		//Book 클래스로 Book 객체를 생성하고, 생성된 Book 객체의 주소값을 참조변수 book에 대입한다	
		Book book = new Book();
		
		/*
		 * book.num = 100;
		 * 	- 참조변수 book이 참조하는 객체의 멤버변수 num에 정수 100을 대입한다
		 * 	- 멤버변수 num에는 100이 저장되어 있다
		 */
		book.num = 100;
		/*
		 * book.title = "자바의 정석";
		 * 	- "자바의 정석" 문자열을 포함하는 String 객체를 생성하고 String 객체의 주소값을 참조변수 book이 참조하는 객체의 멤버변수 title에 대입한다
		 * 	- 멤버변수 title에는 String 객체의 주소값이 저장된다
		 */
		book.title = "자바의 정석";
		book.author = "남궁성";
		book.publisher = "도우출판사";
		book.price = 25000;
		book.discountRate = 0.15;
		book.isSoldOut = false;
		book.isEbookPublished = true;
		
		System.out.println("제목: " + book.title);
	}
}
