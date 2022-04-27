package day3;

import java.util.Scanner;

public class Ex2_Scanner2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("실수를 입력하세요 : ");
		double num1 = scan.nextDouble();
		System.out.println("입력한 실수는 "+num1+"입니다.");
		
		System.out.print("문자열를 입력하세요 : ");		
		String str = scan.next();
		System.out.println("입력한 문자열은 "+str+"입니다.");

		System.out.print("문자를 입력하세요 : ");
		char ch = scan.next().charAt(0);	//charAt(0)무조건 뒤에붙이기
		System.out.println("입력한 문자는 "+ch+"입니다.");
		
		scan.close();
		

	}

}
