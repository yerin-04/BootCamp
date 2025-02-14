package day1.school;

public class StudentApp2 {
	public static void main(String[] args) {
		//학생정보를 표현하는 Student 객체를 생성한다
		Student st1 = new Student();
		
		//학생의 소속학과정보를 표현하는 Department 객체를 생성한다
		Department dept1 = new Department();
		
		//교수의 소속학과정보를 표현하는 Department 객체를 생성한다
		Department dept2 = new Department();
		
		//담당교수정보를 표현하는 Professor 객체를 생성한다
		Professor prof1 = new Professor();
		
		st1.no = 100000;
		st1.name = "홍길동";
		st1.grade = 2;
		
		st1.dept = dept1;	//no, name, location에 설정된 값이 없다(초기값은 있다)
		st1.prof = prof1;	//name, position, dept에 설정된 값이 없다(초기값은 있다)
		st1.prof.dept = dept2; //교수의 소속학과 정보
		
		//st1이 참조하는 Student 객체와 연결된 Department 객체의 학과 정보 초기화하기
		st1.dept.no = 30;
		st1.dept.name = "물리학과";
		st1.dept.location = "자연과학관";
		
		//st1이 참조하는 Student 객체와 연결된 Professor 객체의 교수정보 초기화하기
		st1.prof.name = "이교수";
		st1.prof.position = "석좌교수";
		
		//st1이 참조하는 Student 객체와 연결된 Professor 객체의 학과정보 초기화하기
		st1.prof.dept.no = 40;
		st1.prof.dept.name = "수학과";
		st1.prof.dept.location = "제2 자연과학관";
		
		System.out.println("학생이름: " + st1.name);
		System.out.println("소속학과명: " + st1.dept.name);
		System.out.println("담당교수이름: " + st1.prof.name);
		
		
	}
}
