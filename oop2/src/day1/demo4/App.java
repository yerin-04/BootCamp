package day1.demo4;

public class App {
	public static void main(String[] args) {
		
		//객체 생성
		BizService service = new BizService();
		MySQLDBAccess access = new MySQLDBAccess();
		
		//객체 조립
		service.databaseAccess = access;
		
		//업무로직 실행
		service.회원가입();
		service.회원탈퇴();
	}
}
