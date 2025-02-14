package day3.demo2;

/*
 * Filter 인터페이스는 과일을 테스트하는 기능이 추상화되어있다.
 * 	- test 메서드가 true를 반환하면 선정하고, false를 반환하면 무시한다.
 */
public interface Filter {
	
	boolean test(Fruit fruit);
}
