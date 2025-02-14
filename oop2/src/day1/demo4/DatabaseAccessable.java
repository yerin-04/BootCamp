package day1.demo4;

/* 
 * 데이터베이스 엑세스 기능을 인터페이스로 추상화한다.
 */
public interface DatabaseAccessable {

	void insert();
	void update();
	void delete();
	void find();
	
}
