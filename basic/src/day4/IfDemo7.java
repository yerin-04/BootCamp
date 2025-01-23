package day4;

public class IfDemo7 {
	public static void main(String[] args) {
		/*
		 * 합격 판정하기 1.국어, 영어, 수학 시험의 평균이 60점 이상이면 합격이다 2.단, 국어, 영어, 수학 점수 중 하나라도 40점 미만이면
		 * 과락으로 인한 불합격이다 3.평균점수, "합격", "불합격" 여부를 출력한다
		 */
		int kor = 50;
		int eng = 50;
		int math = 50;
	  
		int average = (kor + eng + math)/3;
		
		boolean subjectDropout = false;
		 
		if (kor < 40 || eng < 40 || math < 40) { 
			subjectDropout = true; 
		} 
		if (!subjectDropout && average >= 60) { 
			System.out.println("합격"); 
		} else {
			System.out.println("불합격"); 
		} 
		System.out.println("평균점수: " + average);
		
	}
}
