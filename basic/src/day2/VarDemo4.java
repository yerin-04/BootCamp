package day2;

public class VarDemo4 {
	public static void main(String[] args) {
		int kor = 100;
		int eng = 80;
		int math = 80;
		int cnt = 3; //과목수
		
		int total = kor + eng + math;
		
		double avg1 = total/cnt;
		//아래의 경우만 소수점이 포함된 값이 획득된다
		double avg2 = (double)total/cnt;
		double avg3 = (double)(total/cnt);
		
		System.out.println(avg1);	//86.0
		System.out.println(avg2);	//86.66666666666667
		System.out.println(avg3);	//86.0
	}
}
