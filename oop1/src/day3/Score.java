package day3;

public class Score {

	//필드 - 멤버변수, 인스턴스변수
	String name;
	int kor;
	int eng;
	int math;
	int total;
	double average;
	
	Score() {
		name = "홍길동";
		kor = 100;
		eng = 80;
		math = 80;
		total = kor + eng + math;
		average = total/3.0;
	}
	
	//생성자 메서드 중복정의하기
	Score(String name, int kor, int eng, int math) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.total = kor + eng + math;
		this.average = total/3.0;
	}
}
