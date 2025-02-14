package day4.demo1;

import java.util.ArrayList;

/**
 *  계좌정보를 관리하는 클래스다
 *  
 *
 */
public class AccountMgr {

	//모든 계좌정보가 저장되는 ArrayList 객체다.
	//ArrayList는 객체를 여러 개 저장할 수 있는 객체다.
	private ArrayList<Account> db = new ArrayList<Account>();
	
	public AccountMgr() {
		Account acc1 = new Account("11-11-11", "김유신", 1234, 30000);
		Account acc2 = new Account("11-11-22", "강감찬", 1234, 530000);
		Account acc3 = new Account("11-11-33", "유관순", 1234, 2000000);
		Account acc4 = new Account("11-11-44", "이순신", 1234, 500000);
		Account acc5 = new Account("11-11-55", "홍길동", 1234, 150000);
	
		db.add(acc1);
		db.add(acc2);
		db.add(acc3);
		db.add(acc4);
		db.add(acc5);
	}
	
	/**
	 * 신규 계좌정보를 전달받아서 배열에 저장하는 메서드다.
	 * @param account  신규 계좌정보
	 */
	public void createAccount(Account account) {
		//전달받은 Account 객체를 ArrayList 객체의 저장소에 저장한다.
		db.add(account);
	}
	
	/**
	 * 모든 계좌정보를 출력하는 메서드다.
	 * @param account
	 */
	public void printAllAccounts() { 
		for (Account acc : db) {
			System.out.println("계좌번호: " + acc.getAccNo());
			System.out.println("예금주: " + acc.getOwner());
			System.out.println("현재 잔액: " + acc.getBalance());
			System.out.println();
		}
	}
	
	/**
	 * 상세정보를 출력할 계좌번호를 전달받아서 해당 계좌정보를 출력한다.
	 * @param accNo  조회할 계좌번호
	 */
	public void printAccountDetail(String accNo) {
		//db에 저장된 Account 객체를 하나씩 꺼내서 반복처리한다.
		for (Account acc : db) {
			String savedAccNo = acc.getAccNo(); //이거 까먹었자나~
			//위에서 조회한 계좌번호와 전달받은 계좌번호가 일치하면 계좌정보를 출력한다.
			if (savedAccNo.equals(accNo)) {
				System.out.println("계좌번호: " + acc.getAccNo());
				System.out.println("예금주: " + acc.getOwner());
				System.out.println("비밀번호: " + acc.getPassword());
				System.out.println("현재 잔액: " + acc.getBalance());
				
				//일치하는 계좌정보를 찾았기 때문에 더 이상 반복작업을 수행하지 않도록 반복문을 탈출시킨다.
				break;
			}
		}
	}
	
	public void deposit(String accNo, int amount) {
		 for (Account acc : db) {
			 //추출한 Account 객체에서 계좌번호를 조회한다.
			 String savedAccNo = acc.getAccNo();
			 //조회된 계좌번호와 전달받은 계좌번호가 일치하는지 체크한다.
			 if (savedAccNo.equals(accNo)) {
				 //계좌번호가 일치하면, 계좌정보에서 현재 잔액을 조회한다.
				 int balance = acc.getBalance(); 
				 //현재잔액에 입금액을 더해서 잔액을 변경한다.
				 acc.setBalance(balance + amount);
				 
				 break;
			 }
		 } 
	}
	
	/**
	 * 계좌번호, 비밀번호, 출금액을 전달받아서 잔액을 감소한다.
	 * @param accNo  계좌번호
	 * @param password  비밀번호
	 * @param amount  출금액
	 */
	public void withdraw(String accNo, int password, int amount) {
		for (Account acc : db) {
			String savedAccNo = acc.getAccNo();
			int savedPassword = acc.getPassword();
			
			if (savedAccNo.equals(accNo) && savedPassword == password) {
				int balance = acc.getBalance();
				acc.setBalance(balance - amount);
					
				break;
			}
		}
	}
	
	/**
	 * 계좌의 비밀번호를 변경하는 메서드다.
	 * @param accNo  계좌번호
	 * @param prevPassword  이전 비밀번호
	 * @param newPassword  새 비밀번호
	 */
	public void changePassword(String accNo, int prevPassword, int newPassword) {
		for (Account acc : db) {
			String savedAccNo = acc.getAccNo();
			int savedPassword = acc.getPassword();
			
			if (savedAccNo.equals(accNo) && savedPassword == prevPassword) {
				acc.setPassword(newPassword);
				
				break;
			}
		}
	}
	
}
