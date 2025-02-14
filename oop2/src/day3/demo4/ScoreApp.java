package day3.demo4;

public class ScoreApp {
	public static void main(String[] args) {
		
		//객체 생성하기
		Score score1 = new Score();
		
		//Setter 메서드를 이용해서 객체의 멤버변수에 값 설정하기
		score1.setName("홍길동");
		score1.setKor(100);
		score1.setEng(80);
		score1.setMath(80);
		
		//Getter 메서드를 실행해서 객체의 멤버변수 값 가져오기
		System.out.println("이름: " + score1.getName());
		System.out.println("국어: " + score1.getKor() + "점");
		System.out.println("영어: " + score1.getEng() + "점");
		System.out.println("수학: " + score1.getMath() + "점");
		
	}
}
