package day3;

import java.util.Date;

public class DateUtilsApp {
	public static void main(String[] args) {
		
		//현재 날짜와 시간 정보를 표현하는 Date 객체 생성
		Date now = new Date();
		
		System.out.println(now);
		
		String text1 = DateUtils.simpleFormat(now);
		String text2 = DateUtils.detailFormat(now);
		
		System.out.println(text1);
		System.out.println(text2);
		
	}
}
