package day3;

public class SampleApp {
	public static void main(String[] args) {
		/* 
		 * Sample s1
		 * 	- Sample 클래스 타입의 객체의 주소값을 저장하는 참조변수 s1을 정의한다.
		 * new Sample()
		 * 	- new는 Sample 클래스를 메모리에 로딩해서 객체를 생성시킨다.
		 * 	- Sample()은 생성자 메서드다.
		 * 	  new 키워드 다음에는 항상 생성자 메서드를 위치시킨다.
		 * 	  1. 생성자 메서드의 이름이 클래스 이름과 동일하기 때문에 생성자 메서드의 이름과 일치하는 클래스를 메모리에 로딩해서 객체를 생성할 수 있다.
		 * 	  	(생성자를 통해서 객체 생성에 사용할 클래스 이름을 알아낼 수 있다.)
		 * 	  2. 생성자도 메서드이기 때문에 객체 생성 직후에 실행할 생성자 메서드를 알려줄 수 있다.
		 * 		(매개변수 하나도 없는 생성자 메서드를 실행해라.)
		 */
		
		Sample s1 = new Sample();
	}
}
