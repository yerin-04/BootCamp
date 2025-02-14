package day1.school;

public class StudentApp {
	public static void main(String[] args) {
		
		Department dept1 = new Department();
		dept1.no = 30;
		dept1.name = "컴퓨터공학과";
		dept1.location = "공학관";
		
		Professor prof1 = new Professor();
		prof1.name = "김교수";
		prof1.position = "겸임교수";
		prof1.dept = dept1; //dept1 참조변수의 주소값을 대입한다
		
		
		/* 학생 정보를 표현하는 객체를 생성하고, 멤버변수 초기화하기
		 * 학생의 소속학과는 위에서 생성한 Department 객체의 주소값을 대입
		 * 학생의 담당교수는 위에서 생성한 Professor 객체의 주소값을 대입
		 */
		Student st1 = new Student();
		st1.no = 1000;
		st1.grade = 2;
		st1.name = "홍길동";
		st1.dept = dept1; //dept1 참조변수의 주소값을 대입한다
		st1.prof = prof1; // 참조변수의 주소값을 대입한다
		
		
		System.out.println("학생 이름: " + st1.name);
		System.out.println("학생 소속학과 이름: " + st1.dept.name);
		System.out.println("학생 담당교수 이름: " + st1.prof.name);
		System.out.println("학생 담당교수의 소속학과 이름: " + st1.prof.dept.name);
		
	}
}
