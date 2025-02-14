package day4;

public class PrinterApp {
	public static void main(String[] args) {
		
		Printer p1 = new Printer();
		p1.print();
		
		InkjetPrinter p2 = new InkjetPrinter();
		p2.print();
		
		//메서드 재정의를 통해서 인쇄하는 기능은 언제나 print()다.
		//print()를 실행하면 자식객체가 재정의한 인쇄기능이 실행된다.
	}
}
