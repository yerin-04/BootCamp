package day5.demo1;

public class SmartPhone extends Phone{
	String ip;
	String email;
	
	SmartPhone() {	//수행문이 자동으로 추가된다.
		super();	//Phone에 기본 생성자 메서드가 없으면 컴파일 오류가 발생한다.
	}
	
	/* SmartPhone 객체의 모든 속성을 초기화하는 생성자 메서드
	 * 	- SamrtPhone이 가진 속성: ip, email
	 * 	- Phone으로부터 상속받은 속성: number, company
	 * 	- SmartPhone 객체의 모든 속성을 초기화하기 위해선 ip, email, number, company까지 값을 대입하는 것이다.
	 * 	- Phone에 이미 number와 company를 초기화하는 생성자가 정의되어 있다
	 * 	  number와 company의 초기화는 Phone에 정의된 생성자를 활용하자
	 */
	SmartPhone(String number, String company, String ip, String email) {
		/* super() 메서드는 자식객체에서 부모객체의 생성자를 호출할 때 사용되는 메서드다
		 * 	- 반드시 생성자 메서드의 첫번째 수행문에 위치해야 한다
		 * 	  (부모객체와 자식객체 중에서 부모객체의 초기화작업을 먼저 수행하기 위해서이다)
		 * 	- 따라서, 개발자가 정의하는 모든 생성자 메서드에서 반듯 부모객체의 생성자 메서드를 호출하는 코드가 포함되어 있어야 한다.
		 * 	  컴파일러는 실행파일을 생성할 때 개발자가 정의한 생성자의 첫번째 수행문 앞에 무조건 super(); 코드를 삽입한다. 
		 * 	  단, 개발자가 명시적으로 super();혹은 super(값, 값); 수행문을 추가했다면 자동으로 코드를 삽입하지 않는다.
		 */
//		super();	//개발자가 명시적으로super(값, 값); 수행문을 작성했기 때문에 이 수행문은 자동으로 삽입하지 않는다.
		super(number, company);
		System.out.println("SmartPhone(String, String, String, String) 생성자 실행됨");
		this.ip = ip;
		this.email = email;
	}
	
	void internet() {
		System.out.println("[" + ip + "]로 인터넷에 연결합니다.");
	}
	
	void game() {
		System.out.println("게임을 실행합니다.");
	}
}
