package day3;

public class BookApp {
	public static void main(String[] args) {
		
		Book book1 = new Book();
		
		Book book2 = new Book("심청전");
		Book book3 = new Book("장화홍련전");
		
		Book book4 = new Book("자바의 정석", "남궁성", "도우출판사", 25000);
		Book book5 = new Book("이것이 자바다", "신용권", "한빛미디어", 27000);
		Book book6 = new Book("리액트 연습", "김교수", "대한출판사", 25000, 0.05);
	}
}
