package day16;

import java.util.StringTokenizer;

public class Ex11_StringTokenizer {

	public static void main(String[] args) {
		/* 문자열.split(정규표현식)은 실행하면 문자열 배열이 나옴
		 * StringTokenizer는 반복문을 이용하여 문자열을 하나씩 가져다가 활용해야함
		 * split과 StringTokenizer의 차이는 정규표현식과 구분자
		 */
		String hobby = "운동,음악,테니스,조깅,영화";
		StringTokenizer st = new StringTokenizer(hobby, ",");
		while(st.hasMoreTokens()) {
			String tmp = st.nextToken();
			System.out.println(tmp + " ");
		}

	}

}
