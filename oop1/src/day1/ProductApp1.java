package day1;

public class ProductApp1 {
	public static void main(String[] args) {
		//1. Product 객체를 생성하고 참조변수에 주소값 대입해서 참조변수가 객체를 참조하게 하기
		Product p1 = new Product();
		Product p2 = new Product();
		
		//2. 참조변수가 참조하는 객체의 속성(변수, 필드)의 값 출력하기
		System.out.println(p1.no);
		System.out.println(p1.name);
		System.out.println(p1.company);
		System.out.println(p1.price);
		System.out.println(p1.isDiscount);
		System.out.println(p1.discountRate);
		
		//3. 참조변수가 참조하는 객체의 속성에 값 대입하기
		p2.no = 100;
		p2.name = "에어팟 프로 맥스";
		p2.company = "애플";
		p2.price = 769000;
		p2.isDiscount = true;
		p2.discountRate = 0.05;
		
		//4. 참조변수가 참조하는 객체의 속성값 출력하기/이용하기
		System.out.println("상품번호: " + p2.no);
		System.out.println("상품이름: " + p2.name);
		System.out.println("상품가격: " + p2.price);
		
		int discountPrice = (int)(p2.price*(1 - p2.discountRate));
		System.out.println("할인가격: " + discountPrice);
		
	}
}
