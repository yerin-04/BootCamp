package day2;

public class VarDemo3 {
	public static void main(String[] args) {
		/* 연산, 연산결과와 형변환
		 *   연산에 참여하는 값은 같은 타입으로 변환 후 연산이 수행된다
		 *   연산결과는 연산에 참여한 값의 타입과 같은 타입의 값이다
		 *   
		 * */
		
		//정수/정수 -> 정수
		System.out.println(10/4); //2출력
		//정수/실수 -> 실수/실수 -> 실수
		System.out.println(10/4.0); //2.5출력
		//실수/실수 -> 실수
		System.out.println(10.0/4.0); //2.5출력
	}
}
