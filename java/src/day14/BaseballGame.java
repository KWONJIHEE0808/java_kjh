package day14;

import java.text.MessageFormat;
import java.util.*;

public class BaseballGame implements ConsoleProgram {
	
	private Scanner scan;
	private final int exitMenu = 3;
	private List<Integer> com = new ArrayList<Integer>(); 
	private List<Integer> user = new ArrayList<Integer>(); 
	private List<Integer> records = new ArrayList<Integer>(); //기록
	private int min = 1;
	private int max = 9;

	@Override
	public int selectMenu(Scanner scan) {
		System.out.println("======메뉴======");
		System.out.println("1. 플레이");
		System.out.println("2. 기록 확인");
		System.out.println("3. 프로그램 종료");
		System.out.println("===============");
		System.out.print("메뉴 선택 : ");
		int menu = scan.nextInt();
		System.out.println("===============");
		return menu;
	}

	@Override
	public void excute(int menu) {
		switch(menu) {
		case 1:
			//컴퓨터 랜덤 수 생성
			createComRandom();
			System.out.println();
			
			int count = 0;//while문 밖에 적어야함
			
			while(true) {
				inputNumbers(3);
				count++;
				
				if(printResult()) {
					break;
				}
				
			}
			record(count,5);
			break;
		case 2:
			if(records.size()==0) {
				System.out.println("기록이 없습니다. 도전하세요");
				break;
			}
			for(int i=0; i<records.size(); i++) {
				System.out.println(i+1+"등. "+records.get(i)+"회");
			}
			break;
		case 3:
			break;
		default:
			System.out.println("잘못된 메뉴를 선택했습니다.");
			System.out.println("===============");
		}
		
	}

	@Override
	public void run() {
		int menu;
		do {
			menu = selectMenu(scan);
			excute(menu);
		}while(menu != exitMenu);
		System.out.println("게임을 종료합니다.");
		System.out.println("===============");
	}
	
	public void createComRandom() {
		com.clear(); //이전 플레이에서 사용한 숫자들을 지움
		while(com.size()<3) {
			//랜덤 수 생성
			int r = random(min, max);
			//중복이 아니면 저장하고 count를 증가
			if(com.indexOf(r)==-1) {
				com.add(r);
				System.out.print(r+" ");
			}
			
		}
		System.out.println( );
	
	}
	
	public static int random(int min, int max) {
		if(min > max) {
			int tmp = min;
			min = max;
			max = tmp;
		}
		return (int)(Math.random()*(max-min+1)+min);
	}
	

	public BaseballGame(Scanner scan) {
		this.scan = scan;
	}

	public void inputNumbers(int count) {
		String str = "중복되지 않는 {0}~{1}개의 숫자 {2}개를 입력하세요";
		String formatStr = MessageFormat.format(str, min, max, count);
		System.out.println(formatStr);
		System.out.print("입력 : ");
		
		user.clear();
		while(user.size() < count) {
			try {
				int num = scan.nextInt();
				if(num < min || num > max) {
					throw new ArithmeticException();
				}
				if(user.contains(num)) {
					throw new ArithmeticException();
				}
				user.add(num);
			}
			catch(ArithmeticException e) {
				System.out.println("중복되거나 범위를 벗어났습니다. 다시 입력하세요");
				if(scan.hasNextInt()) {
					scan.nextLine();
				}
				System.out.println(formatStr);
				System.out.print("입력 : ");
				user.clear();
				
			}
			catch(Exception e) {
				System.out.println("입력이 잘못됐습니다. 다시 입력하세요");
				scan.nextLine();
				System.out.println(formatStr);
				System.out.print("입력 : ");
				user.clear();
			}
		}
	}
	public boolean printResult() {
		int strike = 0;
		for(int i=0; i<com.size(); i++) {
			if(com.get(i).equals(user.get(i))) {
				strike++;
			}
		}
		int ball = 0;
		for(Integer tmp : com) {
			if(user.contains(tmp)) {
				ball++;
			}
		}
		ball = ball - strike;
		
		if(strike !=0) {
			System.out.print(strike+"S");
		}
		if(ball != 0) {
			System.out.print(ball+"B");
		}
		if(strike == 0 && ball == 0) {
			System.out.print("O");
		}
		System.out.println();
		if(strike == 3) {
			return true;
		}
		return false;
	}
	public void record(int max, int count) {
		records.add(count);
		records.sort(new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				return o1 - o2;
			}
		});
		if(records.size()>max) {
			records.remove(max);
		}
	}
	public void printRecord() {
		
	}
}
