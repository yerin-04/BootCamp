package day1;

/*
 * 책 정보를 표현하는 클래스와 필드 정의하기
 * 	- 책 정보는 번호, 제목, 저자, 출판사, 가격, 할인율, 절판여부, 전자책발행여부 등의 정보로 구성된다
 */
public class Book {
	
	int num;
	String title;
	String author;
	String publisher;
	int price;
	double discountRate;
	boolean isSoldOut;
	boolean isEbookPublished;

}
