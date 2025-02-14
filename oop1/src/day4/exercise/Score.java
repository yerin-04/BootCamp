package day4.exercise;

public class Score {
	int no;
	String name;
	int grade;
	int kor;
	int eng;
	int math;
	int total;
	double average;
	
	//학번, 이름, 학년, 국어, 영어, 수학점수를 전달받아서 모든 멤버변수를 초기화하는 생성자
	Score(int no, String name, int grade, int kor, int eng, int math) {
		this.no = no;
		this.name = name;
		this.grade = grade;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.total = kor + eng + math;
		this.average = total/3.0;
	}
	
	/* 성적정보 출력기능
	 * 	반환타입 : void
	 * 	메서드이름 : printScore
	 * 	매개변수 : 없음
	 */
	
	void printScore() {
		System.out.println("학번: " + no);
		System.out.println("이름: " + name);
		System.out.println("학년: " + grade);
		System.out.println("국어: " + kor);
		System.out.println("영어: " + eng);
		System.out.println("수학: " + math);
		System.out.println("총점: " + total);
		System.out.println("평균: " + average + "\n");
	}
}
