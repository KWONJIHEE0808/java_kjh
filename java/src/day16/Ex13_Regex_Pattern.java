package day16;

import java.util.Scanner;

import java.util.regex.Pattern;

public class Ex13_Regex_Pattern {

	public static void main(String[] args) {
		String regex = "^010-[0-9]{4}-[0-9]{4}$";
		Scanner scan = new Scanner(System.in);
		
		System.out.print("전화번호 입력 : ");
		String number = scan.next();
		if(Pattern.matches(regex, number)) {
			System.out.println("올바르게 입력했습니다");
		}else {
			System.out.println("잘못 입력했습니다");
		}
		scan.close();
		
	}

}
