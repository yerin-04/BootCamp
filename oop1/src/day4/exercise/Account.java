package day4.exercise;

public class Account {
	
	String owner;
	long balance; //돈 관련은 보통 long 사용
	int password;
	
	Account(String owner, int balance, int password) {
		this.owner = owner;
		this.balance = balance;
		this.password = password;
	}
	
	/* 입금기능 작성하기
	 * 	반환타입 : void
	 * 	메서드이름 : deposit
	 * 	매개변수 : int amount
	 * 	
	 */
	void deposit(int amount) {
		balance += amount;
		
		System.out.println("입금이 완료되었습니다");
		System.out.println("현재 잔액: " + balance);
	}
	
	/* 출금기능 작성하기
	 * 	반환타입 : void
	 * 	메서드이름 : withdraw
	 * 	매개변수 : int amount, int password
	 */
	void withdraw(int amount, int pwd) {
		if(password != pwd) {
			System.out.println("비밀번호가 올바르지 않습니다");
			return;
		}
		if(balance < amount) {
			System.out.println("잔액이 부족합니다");
			return;
		}
		balance -= amount;
		System.out.println("출금이 완료되었습니다");
		System.out.println("현재 잔액: " + balance);
	}
	
	/* 비밀번호 변경기능 작성하기
	 * 	반환타입 : void
	 * 	메서드이름 : changePassword
	 * 	매개변수 : int oldPassword, int new Password
	 */
	void changePassword(int oldPassword, int newPassword) {
		if(password != oldPassword) {
			System.out.println("비밀번호가 일치하지 않습니다");
			return;
		}
		password = newPassword;
		System.out.println("비밀번호 변경이 완료되었습니다");
		System.out.println("변경 후 비밀번호: " + password);
	}
}
