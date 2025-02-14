package day3.demo4;

public class ScoreApp2 {
	public static void main(String[] args) {
		
		Score[] scores = new Score[5];
		
		// 기본 생성자 메서드 사용
		Score score1 = new Score();
		score1.setName("김유신");
		score1.setKor(100);
		score1.setEng(80);
		score1.setMath(70);
		
		scores[0] = score1;
		
		
		// 매개변수 있는 생성자 메서드 사용
		scores[1] = new Score("강감찬", 80, 80, 50);
		scores[2] = new Score("이순신", 70, 80, 90);
		scores[3] = new Score("유관순", 90, 60, 100);
		scores[4] = new Score("홍길동", 50, 60, 50);
		
		// 성적 정보 출력하기
		for (Score s : scores) {
			// Getter 메서드를 사용해서 값을 조회
			String name = s.getName();
			int average = s.getAverage();
			
			System.out.println(name + " : " + average);
		}
	}
}
