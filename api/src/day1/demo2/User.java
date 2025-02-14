package day1.demo2;

import java.util.Objects;

public class User {

	int no;
	String name;
	String email;
	
	public User() {
		
	}
	
	public User(int no, String name, String email) {
		this.no = no;
		this.name = name;
		this.email = email;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(no);
	}

	@Override
	public boolean equals(Object obj) {
		// 이 객체(this)와 다른 객체(obj)의 주소값이 일치하면 true를 반환한다.
		if (this == obj)
			return true;
		
		// 다른 객체(obj)가 null이면 같은 객체가 아니다.
		if (obj == null)
			return false;
		
		// 이 객체의 설계도정보(getClass()를 실행해서 획득됨)와 다른 객체의 설계도정보(obj.getClass()를 실행해서 획득됨)가
		// 서로 다르면 같은 객체가 아니다. false를 반환한다.
		if (getClass() != obj.getClass())
			return false;
		
		// 이 객체와 다른 객체가 모두 같은 설계도로 만들어진 객체이므로 다른 객체(obj)를 User로 형변환할 수 있다
		// 이 객체의 번호와 다른 객체의 번호가 일치하면 true다.
		User other = (User) obj;
		return no == other.no;
	}
	
}
