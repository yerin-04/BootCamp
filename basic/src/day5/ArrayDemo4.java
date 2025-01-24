package day5;

public class ArrayDemo4 {
	public static void main(String[] args) {
		/*
		 * 배열에 값이 저장되어 있는지 조사하기
		 */
		
		//지정된 값이 배열에 저장되어 있는지 여부를 출력한다
		int[] numbers = {2, 5, 6, 7, 8, 10};
		
		int findValue = 5;	//지정된 값
		boolean exists = false;	//저장여부
		
		//break 사용
		for (int value : numbers) {
			System.out.println("조사중인 값: " + value);
			
			//조사중인 값과 지정된 값이 일치하면 exists를 true로 설정한다
			if (findValue == value) {
				exists = true;
				//지정한 값과 같은 값이 발견되었기 때문에 더이상 반복을 수행할 필요가 없다
				break;
			}
		}
		System.out.println("존재여부: " + exists);
		
	}
}
