package day4.exercise;

public class ScoreManagement {
	
	Score[] scores = new Score[5];
	
	//배열객체에 5명의 성적정보를 저장하는 생성자 메서드
	ScoreManagement() {
		scores[0] = new Score(10, "유승현", 3, 81, 57, 57);
		scores[1] = new Score(12, "유현석", 2, 59, 80, 70);
		scores[2] = new Score(13, "김찬종", 1, 80, 63, 60);
		scores[3] = new Score(14, "손우동", 3, 100, 87, 90);
		scores[4] = new Score(15, "김지철", 1, 95, 93, 70);
	}
	
	/* 모든 성적정보를 출력하는 기능
	 * 	반환타입 : void
	 * 	메서드이름 : printAllScores
	 * 	매개변수 : 없음
	 */
	void printAllScores() {
		for(Score score : scores) {
			score.printScore();
		}
	}
	
	/* 학번을 전달받아서 해당 학생의 성적정보를 제공하는 기능
	 * 	반환타입 : Score
	 * 	메서드이름 : getScoreByNo
	 * 	매개변수 : int no
	 */
	Score getScoreByNo(int no) {
		Score foundScore = null;
		
		//배열에서 순서대로 성적객체를 하나씩 꺼낸다.
		//배열에서 꺼낸 성적객체의 학번과 전달받은 학번이 일치하면 찾고 있는 학생 성적 정보임으로 foundScore에 대입한다.
		for (Score score : scores) {
			if (score.no == no) {
				foundScore = score;
				//학번이 일치하는 성적 정보를 찾았기 때문에 더이상 반복을 지속할 필요가 없다. 
				//break를 실행해서 for문을 탈출한다.
				break;
			}
		}
		
		return foundScore;
	}
	
	/* 가장 성적이 좋은 학생의 성적정보를 제공하는 기능
	 * 	반환타입 : Score 
	 * 	메서드이름 : getBestScore
	 * 	매개변수 : 없음
	 */
	Score getBestScore() {
		Score bestScore = null;
		
		//최고 총점을 저장하는' 변수
		int maxTotal = 0;
		//배열에서 순서대로 성적 정보를 꺼낸다.
		//현재 추출된 성적 정보의 총점이 maxTotal보다 크면 maxTotal의 값을 현재 추출된 성적 정보의 총점으로 변경하고 
		//bestScore에 현재 추출된 성적 정보를 저장한다.
		for (Score score : scores) {
			if (score.total > maxTotal) {
				maxTotal = score.total;
				bestScore = score;
			}
		}
		
		return bestScore;
	}
}
