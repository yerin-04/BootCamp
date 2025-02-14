package day1.demo4;

/*
 * 업무로직 기능을 구현하는 서비스 클래스다.
 * 	- 회원가입, 회원탈퇴 기능은 데이터베이스 엑세스 작업이 필요한 기능이다.
 * 	- 데이터베이스 엑세스 기능이 구체적으로 어떻게 구현되는지 관심없다.
 * 	  DatabaseAccessable 인터페이스의 구현 객체이기만 하면 된다.
 * 	- BizService에서는 DatabaseAccessable 인터페이스를 구현한 클래스가 개발이 완료될 때까지 기다릴 필요가 없다.
 * 	  왜냐하면, 구현객체의 실제 구현메서드를 실행시키기 위해서 구현객체의 정보가 굳이 필요하지 않기 때문이다.
 * 	- 인터페이스에서 반환타입, 메서드이름, 매개변수까지 전부 정보가 있기 때문에 인터페이스에 맞춰서 개발하고, 
 * 	  실제 샐행할 때 멤버변수에 DatabaseAccessable 인터페이스 구현객체가 조립되어 있기만 하면 된다.
 */
public class BizService {

	// 인터페이스 타입의 멤버변수를 정의한다.
	// 	- 멤버변수는 지정된 인터페이스를 구현한 객체가 연결될 지점이다.
	DatabaseAccessable databaseAccess;
	
	void 회원가입() {
		//신규 회원정보를 데이터베이스에 저장시키기
		databaseAccess.insert();
	}
	
	void 회원탈퇴() {
		//회원정보를 데이터베이스에서 삭제시키기
		databaseAccess.delete();
	}
	
}
