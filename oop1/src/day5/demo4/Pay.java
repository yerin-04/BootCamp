package day5.demo4;

public class Pay {
	
	void inputAmount(int amount) {
		System.out.println("[" + amount + "]원을 입력합니다.");
	}
	
	void authenticate() {
		System.out.println("인증을 수행합니다.");
	}
	
	void credit(int amount) {
		System.out.println("[" + amount + "]원을 현금으로 결재합니다.");
	}
}
