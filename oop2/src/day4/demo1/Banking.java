package day4.demo1;

/**
 *  사용자와 상호작용하는 클래스
 */
public class Banking {

	public static void main(String[] args) {
		Banking banking = new Banking();
		banking.menu();
	}
	
	private Keyboard keyboard = new Keyboard();
	private AccountMgr mgr = new AccountMgr();
	
	public void menu() {
		System.out.println("---------------------------------------------------");
		System.out.println("1.전체조회 2.조회 3.신규 4.입금 5.출금 6.비밀번호 변경 0.종료");
		System.out.println("---------------------------------------------------");
		System.out.println();
		System.out.println();
		
		System.out.println("> 번호를 입력하세요: ");
		int menuNo = keyboard.readInt();
		
		if (menuNo == 1) {
			전체조회();
		} else if (menuNo == 2) {
			조회();
		} else if (menuNo == 3) {
			신규();
		} else if (menuNo == 4) {
			입금();
		} else if (menuNo == 5) {
			출금();
		} else if (menuNo == 6) {
			비번();
		} else if (menuNo == 0) {
			종료();
		} 
		
		System.out.println();
		System.out.println();
		System.out.println();
		menu();
	}
	
	/*
	 * 전체 계좌 조회하기
	 * 1. AccountMgr 객체의 printAllAccounts() 메서드를 호출해서 모든 계좌정보를 출력한다.
	 */
	void 전체조회() {
		System.out.println("<< 전체 계좌 조회 >>");
		System.out.println("### 모든 계좌정보를 출력합니다.");
		
		mgr.printAllAccounts();
	}
	
	/*
	 * 특정 계좌 조회하기
	 * 1. 조회할 계좌번호를 입력받는다.
	 * 2. AccountMgr 객체의 printAccountDetail(String accNo) 메서드에 
	 *    입력받은 계좌번호를 전달해서 계좌상세정보를 출력한다.
	 */
	void 조회() {
		System.out.println("<< 특정 계좌 조회 >>");
		System.out.println("### 계좌 상세 정보를 출력합니다.");
		
		//1. 조회할 계좌번호를 입력받는다.
		System.out.println("> 계좌번호를 입력하세요: ");
		String accNo = keyboard.readString();
		
		//2. 계좌번호를 전달해서 상세정보를 출력한다.
		mgr.printAccountDetail(accNo);
		
	}
	
	/*
	 * 신규 계좌 개설하기
	 * 1. 계좌 개설에 필요한 정보를 입력받는다.
	 * 2. 입력받은 정보를 Account 객체에 담는다.
	 * 3. AccountMgr 객체의 creatAccount(Account account) 메서드를 호출해서 
	 * 	  신규 계좌정보가 저장된 Account 객체를 전달하고 저장한다.
	 * 4. 
	 */
	void 신규() {
		System.out.println("<< 신규 계좌 개설 >>");
		System.out.println("### 계좌 개설에 필요한 정보를 입력하세요.");
		
		//1. 계좌개설에 필요한 정보를 담는다.
		System.out.print("> 계좌번호를 입력하세요: ");
		String accNo = keyboard.readString();
		System.out.print("> 예금주를 입력하세요: ");
		String owner = keyboard.readString();
		System.out.print("> 비밀번호를 입력하세요: ");
		int password = keyboard.readInt();
		System.out.print("> 최초 입금액을 입력하세요: ");
		int amount = keyboard.readInt();
		
		//2. 입력받은 정보를 Account 객체에 담는다.
		Account account = new Account();
		account.setAccNo(accNo);
		account.setOwner(owner);
		account.setPassword(password);
		account.setBalance(amount);
		
		//3. Account 객체를 전달해서 배열에 저장한다.
		mgr.createAccount(account);
		
		System.out.println("### 신규 계좌 개설이 완료되었습니다.");
	}
	
	/* 
	 * 입금하기
	 * 1. 계좌번호, 입금액을 입력받는다.
	 * 2. AccountMgr의 deposit(String accNo, int amount) 메서드를 호출해서 
	 * 	  계좌번호와 입금액을 전달해서 입금한다.
	 */
	void 입금() {
		System.out.println("<< 입금하기 >>");
		System.out.println("### 계좌에 입금합니다.");
		
		//1. 계좌번호와 입금액을 입력받는다.
		System.out.print("> 계좌번호를 입력하세요: ");
		String accNo = keyboard.readString();
		System.out.print("> 입금액을 입력하세요: ");
		int amount = keyboard.readInt();
		
		//2. 계좌번호와 입금액을 전달해서 입금한다.
		mgr.deposit(accNo, amount);
		
		System.out.println("### 입금이 완료되었습니다.");
		System.out.println("현재 잔액 : " + amount);
	}
	
	/*
	 * 출금하기
	 * 1. 계좌번호, 비밀번호, 출금액을 입력받는다.
	 * 2. AccountMgr의 withdraw(String accNo, int password, int amount)
	 * 	  메서드를 호출해서 계좌번호, 비밀번호, 출금액을 전달하고 잔액을 감소시킨다.
	 */
	void 출금() {
		System.out.println("<< 출금하기 >>");
		System.out.println("### 출금에 필요한 정보를 입력하세요.");
		
		//1. 계좌번호와 입금액을 입력받는다.
		System.out.print("> 계좌번호를 입력하세요: ");
		String accNo = keyboard.readString();
		System.out.print("> 비밀번호를 입력하세요: ");
		int password = keyboard.readInt();
		System.out.print("> 출금액을 입력하세요: ");
		int amount = keyboard.readInt();
		
		//2. 계좌번호와 입금액을 전달해서 입금한다.
		mgr.withdraw(accNo, password, amount);
		
		System.out.println("### 출금이 완료되었습니다.");
		System.out.println("현재 잔액 : " + amount);
	}
	
	/*
	 * 비밀번호 변경하기
	 * 1. 계좌번호, 이전 비밀번호, 새 비밀번호를 입력받는다.
	 * 2. AccountMgr의 changePassword(String accNo, int prevPassword, int newPassword)
	 */
	void 비번() {
		System.out.println("<< 비밀번호 변경하기 >>");
		System.out.println("### 비밀번호 변경에 필요한 값을 입력하세요.");
		
		System.out.print("> 계좌번호를 입력하세요: ");
		String accNo = keyboard.readString();
		
		System.out.print("> 이전 비밀번호를 입력하세요: ");
		int prevPassword = keyboard.readInt();
		
		System.out.print("> 새 비밀번호를 입력하세요: ");
		int newPassword = keyboard.readInt();
		
		mgr.changePassword(accNo, prevPassword, newPassword);
		
		System.out.println("비밀번호 변경이 완료되었습니다.");
	}
	
	void 종료() {
		System.out.println("<< 프로그램 종료 >>");
		System.exit(0);
	}
}
