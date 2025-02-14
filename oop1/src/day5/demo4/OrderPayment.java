package day5.demo4;

public class OrderPayment {

	Pay pay;
	
	void order(int amount) {
		pay.inputAmount(amount);
		pay.authenticate();
		pay.credit(amount);
	}
	
}
