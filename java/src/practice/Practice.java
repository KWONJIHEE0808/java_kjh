package practice;

import java.util.*;

public class Practice {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		List<Record> list = new ArrayList<Record>();
		
		int menu;
		do {
			System.out.println("----------------");
			System.out.println("1. 전화번호 추가");
			System.out.println("2. 전화번호 확인");
			System.out.println("3. 전화번호 검색");
			System.out.println("4. 프로그램 종료");
			System.out.println("----------------");
			System.out.print("메뉴를 선택하세요 : ");
			menu = scan.nextInt();
			
			switch(menu) {
			case 1:
				System.out.print("이름 : ");
				String name = scan.next();
				System.out.print("번호 : ");
				String num = scan.next();
				//리스트에 저장
				list.add(new Record(name, num));
				break;
			case 2:
				//리스트 출력
				for(int i=0; i<list.size(); i++) {
					System.out.println(list.get(i));
				}
				break;
			case 3:
				//이름검색
				System.out.print("이름 : ");
				String searchName = scan.next();
				//맞는 번호 출력
				break;
			}
		}while(menu != 4);
			
	}
		
}
class Record{
	private String name;
	private String num;
	
	public Record(String name, String num) {
		this.name = name;
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNum() {
		return num;
	}

	public void setNum(String num) {
		this.num = num;
	}

	@Override
	public String toString() {
		return name + " : " + num;
	}
	
}