package day3;

import java.util.Scanner;

public class Ex4_If1 {

	public static void main(String[] args) {
		/* 두 정수와 산술 연산자를 입력받아 산술 연산 결과를 출력하는 코드를 작성하세요
		 * 
		 */
		Scanner scan = new Scanner(System.in);
		
		System.out.print("두 정수와 산술 연산자를 입력하세요 : ");
		int num1 = scan.nextInt();
		char ch = scan.next().charAt(0);
		int num2 = scan.nextInt();
		
		if(ch == '+'){
			System.out.println(""+num1 + ch + num2 + "=" +(num1 + num2));
		}else if(ch == '-') {
			System.out.println(""+num1 + ch + num2 + "=" +(num1 - num2));
		}else if(ch == '*') {
			System.out.println(""+num1 + ch + num2 + "=" +(num1 * num2));
		}else if(ch == '/') {
			System.out.println(""+num1 + ch + num2 + "=" +(num1 / (double)num2));
		}else if(ch == '%') {
			System.out.println(""+num1 + ch + num2 + "=" +(num1 % num2));
		}else {
			System.out.println(ch + "는 잘못된 산술 연산자입니다");
		}
	    
		scan.close();
			
	}
	
}
