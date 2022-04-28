package day3;

public class Ex15_For6_GCD {

	public static void main(String[] args) {
		/* 두 정수의 최대 공약수를 구하는 코드를 작성하세요.
		 * 공약수 : 공통으로 있는 약수
		 * 최대 공약수 : 공약수 중 가장 큰 수
		 * ex 12 : 1 2 3 4 6 12
		 * ex 18 : 1 2 3 6 9 18
		 * -> 최대 공약수 : 6 
		 */
		
		/* 같은 타입의 변수를 여러개 선언하는 경우 ,를 통해 한줄로 선언할 수 있다(ex. case1, case2, case3;)
		 */
		int num1 = 12, num2= 18, gcd=1;
		for(int i=1; i <= num1 ; i++ ) {
			if(num1 % i == 0 && num2 % i == 0) {
				gcd = i;
			}
		}
		System.out.println(num1 + "과 " + num2 + "의 최대 공약수 : " + gcd);
		/* 같은 타입의 변수를 여러개 선언하는 경우 ,를 통해 한줄로 선언할 수 있다
		 * 타입 변수명1;
		 * 타입 변수명2;
		 * 타입 변수명3, 변수명4;
		 * */
		/* 변수의 사용 범위
		 * i는 반복문 밖에 선언됐기 때문에 반복문 이후에도 사용 가능
		 * j는 반복문 안에 선언됐기 때문에 반복문에서만 사용 가능 
		 * */
		int i;
		for(i = 1; i<=5; i++);
		for(int j = 1; j<=5; j++);	
	}
}
