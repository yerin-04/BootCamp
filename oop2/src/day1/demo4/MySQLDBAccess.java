package day1.demo4;

public class MySQLDBAccess implements DatabaseAccessable {

	@Override
	public void insert() {
		System.out.println("mySQL 데이터베이스에 저장한다.");
	}

	@Override
	public void update() {
		System.out.println("mySQL 데이터베이스에서 변경한다.");
	}

	@Override
	public void delete() {
		System.out.println("mySQL 데이터베이스에서 삭제한다.");
	}

	@Override
	public void find() {
		System.out.println("mySQL 데이터베이스에서 조회한다.");
	}

}
