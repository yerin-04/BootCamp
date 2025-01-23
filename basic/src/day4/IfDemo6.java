package day4;

public class IfDemo6 {
	public static void main(String[] args) {
		//합격여부 판정하기
		/* 1.국어, 영어, 수학 시험의 평균이 60점 이상이면 합격이다
		 * 2.단, 국어, 영어, 수학 점수 중 하나라도 40점 미만이면 과락으로 인한 불합격이다  */
		int kor = 95;
		int eng = 10;
		int math = 80;
		
		/*과락인지 여부를 먼저 체크해서 불합격 판정을 내리고
		  과락이 아닌 경우에만 평균점수를 계산하고 합격/불합격 판정을 내린다  */
		if (kor < 40 || eng < 40 || math < 40) {
			System.out.println("과락, 불합격");
		} else {
			int average = (kor + eng + math)/3;
			if (average >= 60) {
				System.out.println("합격");
			} else {
				System.out.println("불합격");
			}
		}
		
	}
}
