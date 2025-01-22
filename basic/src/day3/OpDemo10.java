package day3;

public class OpDemo10 {
	public static void main(String[] args) {
		/*
		 * 비트 연산자의 활용
		 */
		
		//1.지정된 비트의 값 확인하기
		//변수 a에 저장된 값에서 4번째 비트의 값이 1인지 확인하기
		int a = 0b0010;
//		int b = 0b0001; //4번째 비트가 1인지 체크하기 위한 값
//		int c = 0b0010; //3번째 비트가 1인지 체크하기 위한 값
		
		// a & 0b0001 --> 0b0001
		// a & 0b0010 --> 0b0010
		boolean active4 = (a & 0b0001) != 0;
		System.out.println("4번째 비트 활성화 여부: " + active4);
		
		boolean active3 = (a & 0b0010) != 0;
		System.out.println("3번째 비트 활성화 여부: " + active3);
		
		boolean active2 = (a & 0b0100) != 0;
		System.out.println("2번째 비트 활성화 여부:" + active2);
		
		boolean active1 = (a & 0b1000) != 0;
		System.out.println("1번째 비트 활성화 여부:" + active1);
		 
		//2. 암호화/복호화하기
		int num = 0b10101101; //평문
		int key = 0b00110011; //키
		
		//암호화하기
		int secret = num ^ key;
		System.out.println(Integer.toBinaryString(secret));
		
		//복호화하기
		int num2 = secret ^ key;
		System.out.println(Integer.toBinaryString(num2));
		
		//3. 값 바꾸기
		int x = 3;
		int y = 4;
		
		x = x ^ y;
		y = y ^ x;
		x = x ^ y;
		
		System.out.println("x의 값: " + x);
		System.out.println("y의 값: " + y);
	}
}
