package day1;

/*
 * 클래스 정의하기
 * 	- 클래스의 구성요소 정의하기
 * 		필드 : 프로그램 대상이 되는 상품의 고유한 정보를 저장하기 위해서 정의되는 것
 * 			  * 상품의 정보
 * 				  항목		자료형		이름
 * 				- 상품번호		정수			no
 * 				- 상품이름		문자열		name
 * 				- 제조회사		문자열		company
 * 				- 판매가격		정수			price
 * 				- 할인여부		불린			isDiscount
 * 				- 할인률		실수			discountRate
 */
public class Product {
	//필드 정의하기
	int no; 
	String name; 
	String company; 
	int price; 
	boolean isDiscount; 
	double discountRate;
	
}
