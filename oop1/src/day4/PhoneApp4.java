package day4;

public class PhoneApp4 {
	public static void main(String[] args) {
		
		//여러 종류의 Phone 객체를 저장하는 배열을 생성할 때 배열의 타입을 Phone 타입으로 지정하면 된다
		Phone[] phones = new Phone[5];
		
		phones[0] = new Phone();
		phones[1] = new SmartPhone();
		phones[2] = new Galaxy();
		phones[3] = new SmartPhone();
		phones[4] = new Galaxy();
	
	}
}
