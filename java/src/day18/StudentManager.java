package day18;

import java.util.*;

import day14.ConsoleProgram;

public class StudentManager implements ConsoleProgram {
	
	private Scanner scan; 
	private List<Student> list;
	private int exitMenu = 5;
	
	public StudentManager() {
		scan = new Scanner(System.in);
		list = new ArrayList<Student>();
	}
	
	public StudentManager(Scanner scan) {
		this.scan = scan;
		list = new ArrayList<Student>();
	}
	
	public StudentManager(Scanner scan, int size) {
		this.scan = scan;
		list = new ArrayList<Student>(size);
	}

	@Override
	public int selectMenu(Scanner scan) {
		System.out.println("----------메뉴--------");
		System.out.println("1. 학생정보 입력");
		System.out.println("2. 학생정보 출력");
		System.out.println("3. 학생정보 수정");
		System.out.println("4. 학생정보 삭제");
		System.out.println("5. 프로그램 종료");
		System.out.print("메뉴를 선택하세요 : ");
		int menu = scan.nextInt();
		System.out.println("---------------------");
		return menu;
	}

	@Override
	public void excute(int menu) {
		switch(menu) {
		case 1:
			Student std = inputStudent();
			insertStudent(std);
			break;
		case 2:
			printStudent();
			break;
		case 3:
			Student modStd = inputSearchStudent();	
			int index = list.indexOf(modStd);
			if(index >= 0) {
				inputAdditionStudent(modStd);
				list.set(index, modStd);
			}else {
				printMessage("등록되지 않은 학생입니다. 학생 정보 입력을 이용하세요");
			}
			break;
		case 4:
			Student delStd = inputSearchStudent();
			if(list.remove(delStd)) {
				printMessage("학생 정보를 삭제했습니다");
			}else {
				printMessage("등록되지 않은 학생입니다. 학생 정보 입력을 이용하세요");
			}
			break;
		case 5:
			break;
		default :
			printMessage("잘못된 메뉴를 선택했습니다");
		}
		
	}

	@Override
	public void run() {
		int menu;
		do {
			try {
				menu = selectMenu(scan);
				excute(menu);
			}catch(Exception e) {
				menu = 0;
				printMessage("잘못된 메뉴를 입력했습니다");
				scan.nextLine();
			}
		}while(menu != exitMenu);
		
	}
	
	private Student inputStudent() {
		try {
			System.out.println("학생 정보를 입력하세요");
			System.out.print("학년 반 번호 이름 입력 : ");
			int grade = scan.nextInt();
			int classNum = scan.nextInt();
			int num = scan.nextInt();
			String name = scan.next();
			System.out.println("국어 영어 수학 성적 입력 : ");
			int kor = scan.nextInt();
			int eng = scan.nextInt();
			int math = scan.nextInt();
			return new Student(grade, classNum, num, name, kor, eng, math);
		}catch(Exception e) {
			printMessage("잘못된 값을 입력했습니다");
			scan.nextLine(); //입력을 잘못했을때 입력버퍼에 있는 내용을 문자열로 가져옴(입력버퍼를 비움)
			return null;
		}
	
	}
	private void insertStudent(Student std) {
		if(std == null) {
			return;
		}
		if(list.contains(std)) {
			printMessage("이미 추가된 학생입니다. 학생 정보 수정을 이용하세요");
			return;
		}
		list.add(std);
		list.sort(new Comparator<Student>() {
			@Override
			public int compare(Student o1, Student o2) {
				if(o1.getGrade() != o2.getGrade()) {
					return o1.getGrade() - o2.getGrade();
				}
				if(o1.getClassNum() != o2.getClassNum()) {
					return o1.getClassNum() - o2.getClassNum();
				}
				if(o1.getNum() != o2.getNum()) {
					return o1.getNum() - o2.getNum();
				}
				return 0;				
			}
		});
		
		printMessage("학생 정보 추가가 완료됐습니다");
	}
	
	private void printStudent() {
		if(list.size() == 0) {
			printMessage("저장된 학생 정보가 없습니다");
			return;
		}
		System.out.println("---------------------");
		for(Student tmp : list) {
			System.out.println(tmp);
		}
		System.out.println("---------------------");
	}
	
	private Student inputSearchStudent() {
		try {
			System.out.println("검색할 학생 정보를 입력하세요");
			System.out.print("학년 반 번호 입력 : ");
			int grade = scan.nextInt();
			int classNum = scan.nextInt();
			int num = scan.nextInt();
			return new Student(grade, classNum, num, null, 0, 0, 0);
		}catch(Exception e) {
			printMessage("잘못된 값을 입력했습니다");
			scan.nextLine(); 
			return null;
		}
	
	}
	
	private void inputAdditionStudent(Student std) {
		if(std == null) {
			printMessage("저장된 학생 정보가 없습니다");
			return;
		}
		try {
			System.out.println("수정할 학생 정보를 입력하세요");
			System.out.println("이름 국어 영어 수학 입력 : ");
			String name = scan.next();
			int kor = scan.nextInt();
			int eng = scan.nextInt();
			int math = scan.nextInt();
			std.Modify(name, kor, eng, math);
		}catch(Exception e) {
			printMessage("잘못된 값을 입력했습니다");
			scan.nextLine(); 
			return;
		}
	}
	
	private void printMessage(String message) {
		System.out.println("---------------------");
		System.out.println(message);
		System.out.println("---------------------");
	}
	
}
