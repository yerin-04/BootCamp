package day5.demo1;

public class PhoneApp {
	
	public static void main(String[] args) {

		SmartPhone p1 = new SmartPhone("010-1111-1111", "kt", "192.168.0.11", "hong@gmail.com");
		
		p1.call("010-2222-2222");
	}
}
