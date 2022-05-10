package day11;

import java.util.Scanner;

public class Ex1_Class_Student {

	public static void main(String[] args) {
		/* 메뉴
		1. 학생 정보 입력
		2. 학생 정보 출력
		3. 프로그램 종료
		메뉴를 선택하세요 : 1
		이름 : 홍길동
		학년 : 1
		반   : 1
		번호 : 1
		메뉴
		1. 학생 정보 입력
		2. 학생 정보 출력
		3. 프로그램 종료
		메뉴를 선택하세요 : 2
		1학년 1반 1번 홍길동
		메뉴
		1. 학생 정보 입력
		2. 학생 정보 출력
		3. 프로그램 종료
		메뉴를 선택하세요 : 3
		프로그램을 종료합니다.
		*/
		
		Student st = new Student(null, 0,0,0);
		Scanner scan = new Scanner(System.in);
		int menu = -1;
		for(;menu!=3;) {
			System.out.println("메뉴");
			System.out.println("1. 학생정보입력");
			System.out.println("2. 학생정보출력");
			System.out.println("3. 프로그램종료");
			System.out.print("메뉴를 선택하세요 : ");
			menu = scan.nextInt();
			switch(menu) {
			case 1 : 
				System.out.println("학생정보를 입력하세요");
				System.out.println("이름을 입력하세요 :");
				String name = scan.next();
				System.out.println("학년을 입력하세요 :");
				int grade = scan.nextInt();
				System.out.println("반을 입력하세요 :");
				int group = scan.nextInt();
				System.out.println("번호를 입력하세요 :");
				int number = scan.nextInt();
				st = new Student(name, grade, group, number);
				break;
			case 2 : 
				st.print();
				break;
			case 3 : 
				System.out.println("프로그램 종료");
				break;
			default:
				System.out.println("잘못된 메뉴입니다");
			}
		}
		
		scan.close();	
	}

}

class Student{
	String name;
	int grade, group, number;
	
	void print() {
		System.out.println(grade+"학년 "+group+"반 "+number+"번 "+name);
	}
	
	public Student(String name, int grade, int group, int number) {
		this.name=name;
		this.grade=grade;
		this.group=group;
		this.number=number;
	}

}