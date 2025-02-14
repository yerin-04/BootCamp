package day3.demo2;

public class FruitFilter {

	/*
	 * 과일과 필터방식(기능)을 전달받아서 기준에 맞는 과일 정보만 출력시킨다.
	 * 	- Fruit[] box : 과일이 저장된 배열객체를 전달받는다.
	 * 	- Filter filter : 필터링 방식이 구현된 객체를 전달받는다.
	 */
	void filtering(Fruit[] box, Filter filter) {
		System.out.println("### 선정된 과일정보를 출력한다.");
		
		for (Fruit f : box) {
			if (filter.test(f)) {
				System.out.println(f.name + ", " + f.weight + ", " + f.price);
			}
		}
		
		System.out.println();
	}
}
