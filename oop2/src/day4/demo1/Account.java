package day4.demo1;

/**
 *  계좌정보를 표현하는 클래스다
 * 	- 계좌번호, 예금주, 비밀번호, 잔액...
 */
public class Account {

	private String accNo;
	private String owner;
	private int password;
	private int balance;
	
	Account() {}
	
	Account(String accNo, String owner, int password, int balance) {
		this.accNo = accNo;
		this.owner = owner;
		this.password = password;
		this.balance = balance;
	}
	
	public String getAccNo() {
		return accNo;
	}

	public void setAccNo(String accNo) {
		this.accNo = accNo;
	}
	
	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public int getPassword() {
		return password;
	}

	public void setPassword(int password) {
		this.password = password;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	
	
}
