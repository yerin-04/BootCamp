package day1.demo2;

public class App {
	public static void main(String[] args) {
		
		// UNit 타입의 배열객체를 생성해서 객체 담기
		Unit[] group = new Unit[3];
		
		group[0] = new Marine();
		group[1] = new Marine();
		group[2] = new Dropship();
		
		//유닛들 다루기
		for (Unit unit : group) {
			
			// 유닛의 공통기능 실행하기
			//	- 공통기능은 별도의 형변환없이 실행가능하도록 설계되었다.
			unit.move(100, 200);
			
			// 유닛의 고유기능 실행하기
			//	- 고유기능은 해당 객체로 클래스형변환 후 실행가능하다.
			if (unit instanceof Marine) {
				((Marine) unit).steampack();
				
			} else if (unit instanceof Dropship) {
				Dropship ship = (Dropship) unit;
				ship.load();
				ship.unload();
			}
		}
	}
}
