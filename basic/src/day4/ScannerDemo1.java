package day4;

//java.util. 패키지의 Scanner 클래스를 
import java.util.Scanner;

public class ScannerDemo1 {
	public static void main(String[] args) {
		/* Scanner scanner
		 * - Scanner 타입의 객체를 저장하는 변수 scanner 생성한다
		 * - Scanner : 변수의 타입
		 * - scanner : 변수의 이름
		 * 
		 * new Scanner(System.in);
		 * - 키보드 입력을 읽어오는 Scanner 객체를 생성한다
		 */
		//키보드 입력을 읽어오는 Scanner 객체를 생성한다
		Scanner scanner = new Scanner(System.in);
		
		//scanner 변수가 참조하는 객체의 기능을 실행한다
		System.out.println("첫번째 숫자를 입력하세요.");
		int value1 = scanner.nextInt();
		
		System.out.println("두번째 숫자를 입력하세요.");
		int value2 = scanner.nextInt();
		
		int result = value1 + value2;
		System.out.println("덧셈결과: " + result);
	}
}
