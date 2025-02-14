package day1.demo3;

public class CarApp {
	public static void main(String[] args) {
		
		SimpleCar c1 = new SimpleCar();
		Sonata c2 = new Sonata();
		Avante c3 = new Avante();
		
		Car c4 = new SimpleCar();
		Car c5 = new Sonata();
		Car c6 = new Avante();
		
//		AirCon c7 = new SimpleCar();  //SimpleCar는 AirCon를 구현하지 않았다.
		AirCon c8 = new Sonata();
		AirCon c9 = new Avante();
		
//		Navi c10 = new SimpleCar();  //SimpleCar는 Navi를 구현하지 않았다.
		Navi c11 = new Sonata();
//		Navi c12 = new Avante();	//Avante는 Navi를 구현하지 않았다.
	}
}
