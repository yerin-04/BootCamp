package day3.demo4;

public class Score {

	private String name;
	private int kor;
	private int eng;
	private int math;
	private boolean passed;
	
	public Score() {
		
	}

	public Score(String name, int kor, int eng, int math) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public boolean isPassed() {
		return passed;
	}

	public void setPassed(boolean passed) {
		this.passed = passed;
	}
	
	//멤버변수의 유무와 상관없이 필요한 Getter 메서드를 추가할 수 있다.
	public int getTotal() {
		return kor + eng + math;
	}
	
	public int getAverage() {
		return getTotal()/3;
	}
	
	
}
