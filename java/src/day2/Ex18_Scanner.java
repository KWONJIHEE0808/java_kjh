package day2;

import java.util.Scanner;

public class Ex18_Scanner {

	public static void main(String[] args) {
		/* 콘솔창에서 정수를 입력받는 예제
		 * System.in : 콘솔에서 입력
		 */
		Scanner scan = new Scanner(System.in);
		//오류 발생시 Scanner 누르고 목록중 import java.util 추가
		System.out.print("정수를 입력하세요 : ");
		int num1 = scan.nextInt();
		System.out.println("입력한 정수는 " + num1 + " 입니다.");
		scan.close();

	}

}
