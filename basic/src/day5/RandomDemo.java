package day5;

public class RandomDemo {
	public static void main(String[] args) {
		long unixTime = System.currentTimeMillis();
		int value = (int)(unixTime%6) + 1;
		
		System.out.println(value);
	}
}
