package day2;

public class Ex3_Arithmetic {

	public static void main(String[] args) {
		/* 산술 연산자 주의 사항
		 * 정수 연산자 정수 => 정수
		 * ex) 5 + 2 = 7
		 * ex) 5 - 2 =3
		 * ex) 5 * 2 = 10
		 * ex) 5 % 2 = 1
		 * ex) 5 / 2 = 2
		 * 정수 연산자 실수 => 실수
		 * 실수 연산자 정수 => 실수
		 * 실수 연산자 실수 => 실수
		 */
		System.out.println(5 + 2);
		System.out.println(5 - 2);
		System.out.println(5 * 2);
		System.out.println(5 % 2);
		System.out.println(5 / 2);
		
		System.out.println(5 / 2.0);
		System.out.println(5 / (double)2);
		
		System.out.println(5 % 0.0);
		//0.0으로 나머지 연산할 경우 NaN
		
		System.out.println(5 / 0.0);
		//0.0으로 나누는 경우 Infinity
		
		System.out.println(5 % 0);
		System.out.println(5 / 0);
		//0으로 / % 하는 경우 예외 발생, 예외 발생 시 프로그램 출력이 더 이상 안나옴
		
		

	}

}
