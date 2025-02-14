package day3;

//SimpleDateFormat는 Date 객체를 특정한 형식의 문자열로 변환하거나 날짜 형식의 문자열을 Date 객체로 변환하는 기능을 제공한다.
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtils {
	
	//클래스변수에 SimpleDateForm 객체를 대입한다.
	static SimpleDateFormat sdf = new SimpleDateFormat();
	
	//Date 객체를 전달 받아서 "2025-01-01" 형식의 문자열을 반환한다
	static String simpleFormat(Date date) {
		sdf.applyPattern("yyyy-MM-dd");
		return sdf.format(date);
	}
	
	//Date 객체를 전달 받아서 "2025년 1월 1일 수요일 오전 10시 30분 2초" 형식의 문자열을 반환한다.
	static String detailFormat(Date date) {
		sdf.applyPattern("yyyy년 M월 d일 EEEE a h시 m분 s초");
		return sdf.format(date);
	}
}
