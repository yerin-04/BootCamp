package day3;

public class OpDemo5 {
	public static void main(String[] args) {
		/*
		 * 대입 연산자
		 *  -, +=, -=, *=, /=, %=
		 *  연산우선순위가 가장 낮은 연산자다
		 */
		
		int num1 = 10;
		
		// +=는 변수에 지정된 값을 누적시킨다
		num1 += 1;
		num1 += 1;
		num1 += 1;
		num1 += 1;
		num1 += 1;
		
		System.out.println(num1);
		
		String text = "";
		text += "홍";
		text += "길동";
		text += ", ";
		text += "환영합니다.";
		
		System.out.println(text);
	}
}
