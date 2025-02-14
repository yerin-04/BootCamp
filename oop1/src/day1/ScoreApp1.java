package day1;

public class ScoreApp1 {
	public static void main(String[] args) {
		
		//김유신 학생의 성적 정보를 표현하기 위한 Score 객체 생성
		Score s1 = new Score();
		//2. 생성된 객체의 멤버변수에 값 대입하기
		s1.name = "김유신";
		s1.kor = 100;
		s1.eng = 80;
		s1.math = 60;
		s1.total = s1.kor + s1.eng + s1.math;
		s1.average = s1.total/3.0;
		
		//3. 생성된 Score 객체가 관리하는 성적정보 출력하기
		System.out.println("학생이름: " + s1.name);
		System.out.println("국어점수: " + s1.kor);
		System.out.println("영어점수: " + s1.eng);
		System.out.println("수학점수: " + s1.math);
		System.out.println("종합점수: " + s1.total);
		System.out.println("평균점수: " + s1.average);
		
		
		//이순신 학생의 성적 정보를 표현하기 위한 Score 객체 생성
		Score s2 = new Score();
		
	}
}
