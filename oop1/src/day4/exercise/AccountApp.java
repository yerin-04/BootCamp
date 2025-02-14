package day4.exercise;

public class AccountApp {
	public static void main(String[] args) {
		
		Account account = new Account("yerin", 60000, 0311);
		
		account.deposit(50000);
		account.deposit(350000);
		
		account.withdraw(60000, 0211);
		account.withdraw(100000, 0311);
		account.withdraw(1000, 0311);
		
		account.changePassword(0516, 0311);
		account.changePassword(0311, 1234);
	}
}
