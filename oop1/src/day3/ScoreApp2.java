package day3;

public class ScoreApp2 {
	public static void main(String[] args) {
		//1. 객체 생성하기
		//	- 기본생성자 메서드를 실행해서 멤버변수 초기화도 진행함
		Score s1 = new Score();
		
		//- 별도의 초기화 작업을 실행할 필요가 없음
		//2. 이름, 총점, 평균을 출력할 수 있다.
		System.out.println("이름: " + s1.name);
		System.out.println("총점: " + s1.total);
		System.out.println("평균: " + s1.average);
	}
}
