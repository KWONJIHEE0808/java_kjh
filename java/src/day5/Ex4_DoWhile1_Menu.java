package day5;

import java.util.Scanner;

public class Ex4_DoWhile1_Menu {

	public static void main(String[] args) {
		/* 메뉴 출력 예제를 dowhile문으로 작성하세요
		 */
		
		int menu = 5;
		//dowhile문은 초기값이 뭐든 상관없음
		Scanner scan = new Scanner(System.in);
		
		do {
			System.out.println("메뉴");
			System.out.println("1. 학생정보입력");
			System.out.println("2. 학생정보출력");
			System.out.println("3. 학생정보수정");
			System.out.println("4. 학생정보삭제");
			System.out.println("5. 프로그램종료");
			System.out.println("메뉴를 선택하세요 : ");
			menu = scan.nextInt();
		}while(menu!=5);//; 필수
		scan.close();
	}

}
