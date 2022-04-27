package day3;

import java.util.Scanner;

public class Ex3_Scanner3 {

	public static void main(String[] args) {
		// 두 정수와 산술 연산자(+ - */ %)를 입력받아 출력하는 코드를 작성하세요.
		// 산술 연산자는 문자로 입력하세요.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("첫번째 정수를 입력하세요 : ");
		int num1 = scan.nextInt();
		System.out.print("두번째 정수를 입력하세요 : ");
		int num2 = scan.nextInt();
		System.out.print("산술 연산자를 입력하세요 : ");
		char ch = scan.next().charAt(0);
		System.out.println(""+num1 +ch+ num2);	
		
		//두번째 방법
		System.out.print("정수와 산술 연산자를 입력하세요 : ");
		int num3 = scan.nextInt();
		char ch1 = scan.next().charAt(0);
		int num4 = scan.nextInt();
		System.out.println(""+num3+ch1+num4);
		
		scan.close();
		
	}

}
