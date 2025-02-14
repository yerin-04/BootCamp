package day3;

public class ScoreApp1 {
	public static void main(String[] args) {
		
		//생성자를 사용해서 멤버변수 초기화 작업을 하지 않는 경우
		
		//1. 객체 생성
		Score s1 = new Score();
		
		//2. 멤버변수 초기화
		s1.name = "홍길동";
		s1.kor = 100;
		s1.eng = 80;
		s1.math = 80;
		s1.total = s1.kor + s1.eng + s1.math;
		s1.average = s1.total/3.0;
		
		//3. 총점, 평균 출력하기
		System.out.println("총점: " + s1.total);
		System.out.println("평균: " + s1.average);
		
		
		//생성자를 사용해서 멤버변수 초기화 작업을 하는 경우
		
	}
}
