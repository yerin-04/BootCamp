package day4.exercise;

public class ScoreApp {
	public static void main(String[] args) {
		
		ScoreManagement mgr = new ScoreManagement();
		
		//모든 성적정보 출력기능 실행하기
		mgr.printAllScores();
		
		//10번 학생의 성적정보 조회하기
		Score s1 = mgr.getScoreByNo(10);
		System.out.println("**10번 학생의 성적 정보**");
		s1.printScore();
		
		Score s2 = mgr.getBestScore();
		s2.printScore();
	}
}
