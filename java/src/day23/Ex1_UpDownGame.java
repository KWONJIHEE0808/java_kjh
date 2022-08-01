package day23;

import java.util.*;

public class Ex1_UpDownGame {

	public static void main(String[] args) {
		/* 1~100 사이의 랜덤한 수를 맞추는 UpDown 게임
		 * 기록을 저장하는 기능 추가
		 * 기록은 최대 5등까지
		 * 5등 이내의 기록은 이름을 기록하여 저장
		 * 한 사람이 여러 기록을 가질 수 있다
		 * 같은 기록인 경우 기록된 순서대로
		 * 1. 플레이
		 * 2. 기록확인
		 * 3. 종료
		 * 
		 */
		Scanner scan = new Scanner(System.in);
		int menu;
		int min = 1, max = 100;
		List<Record> list = new ArrayList<Record>();
		list.add(new Record(1, "일길동"));
		list.add(new Record(9, "이길동"));
		list.add(new Record(7, "삼길동"));
		
		do {
			System.out.println("----------------");
			System.out.println("1. 플레이");
			System.out.println("2. 기록확인");
			System.out.println("3. 종료");
			System.out.println("----------------");
			System.out.print("메뉴 선택 : ");
			menu = scan.nextInt();
			
			switch(menu) {
			case 1 :
				int r = (int)(Math.random()*(max-min+1)+min);
				System.out.println(r);
				int count = 0;
				while(true) {
					System.out.print("정수 입력(1~100) : ");
					int num = scan.nextInt();
					count++;
					if(num > r) {
						System.out.println("Down");
					}else if(num < r) {
						System.out.println("Up");
					}else {
						break;
					}
				}
				System.out.println("정답");
				
				int i;
				for(i=0; i<list.size(); i++) {
					if(list.get(i).getCount() > count) {
						break;
					}
				}
				if(list.size()<5 || i<list.size()) {
					System.out.println("새로운 기록이 달성됐습니다");
					System.out.println("이름 : ");
					
					list.add(i, new Record(count, scan.next()));
					list =  list.subList(0, list.size()>5 ? 5 : list.size());
				}
				break;
			case 2 :
				for(int j = 0; j<list.size(); j++) {
					System.out.println(j+1+". "+list.get(j));
				}
				break;
			case 3 :
				System.out.println("종료");
				break;
			default :
					
			}
		}while(menu != 3);
		
		scan.close();
	}

}

class Record{
	private int count;
	private String name;
	
	public Record(int count, String name) {
		this.count = count;
		this.name = name;
	}

	public int getCount() {
		return count;
	}

	@Override
	public String toString() {
		return "[ " + name + " : " + count + " ]" ;
	}
		
}

