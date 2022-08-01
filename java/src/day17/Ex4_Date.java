package day17;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*; //*붙이면 모든 java.util 가능

public class Ex4_Date {

	public static void main(String[] args) {
		Date date = new Date(); 
		//new Date()는 실행 시간을 기준으로 날짜 객체를 생성
		System.out.println(date);
		
		Date date2 = new Date(1000);
		//1970년 1월 1일 00:00:00을 기준으로 num밀리세컨드가 흐른 날짜 객체를 생성
		System.out.println(date2);
		
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss E요일");
		String strDate = format.format(date);
		System.out.println(strDate);
		//yyyy-MM-dd hh:mm:ss
		//Date클래스의 객체를 원하는 포맷의 문자열로 바꾸는 예제
		
		Date date3;
		try {
			format = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
			date3 = format.parse(strDate);
			System.out.println(date3);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		//문자열을 Date클래스의 객체로 바꾸는 예제
		
	}

}
