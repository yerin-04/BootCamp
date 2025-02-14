package day3.demo3.sub1;

public class Sample1 {

	//private 접근제한
	//	- 가장 강력한 접근제한이다.
	//	- 해당 클래스내와 내부클래스에서만 접근가능하다.
	//	- 대부분의 경우, private 접근제한을 사용해서 필드, 생성자, 메서드를 은닉화시킬 때 사용한다.
	//	- 필드는 private 접근제한자를 지정해서 은닉화시킨다.
	private int a;
	
	//default 접근제한
	//	- 접근제한이 지정되지 않은 경우 기본 접근제한이다.
	//	- 같은 패키지 내에서만 접근 가능하다.
	int b;
	
	//protected 접근제한
	//	- 같은 패키지 및 자손에서만 접근 가능하다.
	protected int c;
	
	//public 접근제한
	//	- 접근제한이 없다
	//	- 필드, 생성자, 메서드를 외부에 공개할 때 사용한다
	//	- 생성자, 메서드는 public 접근제한자를 지정해서 외부에 공개한다
	public int d;
	
}
