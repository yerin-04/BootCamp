package day3.demo2;

public class App {
	
	public static void main(String[] args) {
		
		Fruit[] box = {
				new Fruit("사과", 300, 5000),
				new Fruit("딸기", 700, 15000),
				new Fruit("바나나", 900, 4000),
				new Fruit("오렌지", 500, 9000),
				new Fruit("토마토", 1000, 12000),
		};
		
		FruitFilter 과일선별기 = new FruitFilter();
		
		//가격이 10,000원 이상인 과일 선별하기
		Filter filter1 = new Filter() {	 //익명클래스
			public boolean test(Fruit fruit) {
				return fruit.price >= 10000;
			}
		};
		과일선별기.filtering(box,  filter1);
		
		//가격이 5,000원 이하인 과일 선별하기
		Filter filter2 = fruit -> fruit.price <= 5000;  //람다표현식
		과일선별기.filtering(box, filter2);
		
		//무게가 1kg 미만이고, 가격이 10000원 이하인 과일 선별하기
		과일선별기.filtering(box,  fruit -> fruit.price <= 10000);
		
	}
}
