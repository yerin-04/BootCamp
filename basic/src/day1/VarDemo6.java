package day1;

public class VarDemo6 {

	public static void main(String[] args) {
		/* 기본 자료형과 변수(저장소)
		 * 1. 프로그램 실행과정에 필요한 정보가 무엇인지 파악한다
		 * 2. 각 정보가 어떤 타입의 값인지 파악한다
		 * 3. 적잘한 타입의 변수를 생성하고 값을 대입해서 유지시킨다
		 * 4. 프로그램 실행과정에 변수에 저장된 값을 사용한다		  */
		
		/* 국어점수, 영어점수, 수학점수로 총점과 평균을 계산하고 출력한다
		 * 1. 국어점수, 영어점수, 수학점수, 총점, 평균
		 * 2.   정수    정수     정수   정수  실수
		 * 3. int kor; int eng; int math; int total; double avg;   */
		
		//변수를 생성해서 성적을 저장한다
		int kor = 100;
		int eng = 70;
		int math = 30;
		//성적 정보를 더해서 총점을 계산하고 변수에 대입한다
		int total = kor + eng + math;
		//총점을 과목수로 나눠서 평균을 계산한다
		double avg = total/3;
		
		System.out.println("총점: " + total);
		System.out.println("평균: " + avg);

	}

}
