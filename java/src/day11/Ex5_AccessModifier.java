package day11;

import day11_1.*; //다른 패키지 추가, * 붙으면 모든거 사용

public class Ex5_AccessModifier {

	public static void main(String[] args) {
		Ex5_A t1 = new Ex5_A();
		System.out.println(t1.num1);//public은 모두 사용가능
		System.out.println(t1.num2);//default는 같은 패키지 내에서 사용 가능
		//System.out.println(t1.num3);<-private는 클래스 내에서만 사용가능이라 에러발생		

		Ex5_B t2 = new Ex5_B();
		System.out.println(t2.num1);
		//System.out.println(t2.num2);<-default는 같은 패키지 내에서만 사용가능이라 에러발생
		//System.out.println(t2.num3);<-private는 클래스 내에서만 사용가능이라 에러발생
	
		//public int num = 2;<-지역 변수에 접근제한자(public)를 붙일 수 없다
	}
	public int num = 1;
}
