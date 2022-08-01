package day19;

import java.util.*;

import day14.ConsoleProgram;

public class BoardManager implements ConsoleProgram {

	private Scanner scan; 
	private List<Board> list;
	private int exitMenu = 4;
	
	public BoardManager() {
		scan = new Scanner(System.in);
		list = new ArrayList<Board>();
	}	
	public BoardManager(Scanner scan) {
		this.scan = scan;
		list = new ArrayList<Board>();
	}	
	public BoardManager(Scanner scan, int size) {
		this.scan = scan;
		list = new ArrayList<Board>(size);
	}
	
	@Override
	public int selectMenu(Scanner scan) {
		System.out.println("----------메뉴--------");
		System.out.println("1. 게시글 등록");
		System.out.println("2. 게시글 확인");
		System.out.println("3. 게시글 수정");
		System.out.println("4. 프로그램 종료");
		System.out.print("메뉴를 선택하세요 : ");
		int menu = scan.nextInt();
		System.out.println("---------------------");
		return menu;
	}
	
	@Override
	public void excute(int menu) {
		switch(menu) {
		case 1:
			Board bod = inputBoard();
			insertBoard(bod);
			break;
		case 2:
			printBoard();
			detailPrintBoard();	
			break;
		case 3:
			printBoard();
			modifyBoard();
			break;
		case 4:
			break;
		default :
			System.out.println("잘못 입력했습니다");
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
				System.out.println("잘못 입력했습니다");
				scan.nextLine();
			}
		}while(menu != exitMenu);
		
	}
	
	private Board inputBoard() {
		try {
			System.out.println("게시글 정보를 입력하세요");
			System.out.println("게시글 타입(공지,일반) : ");
			String type = scan.next();
			System.out.println("게시글 제목 : ");
			scan.nextLine(); //next 다음에 nextLine 사용할때 넣기
			String title = scan.nextLine();
			System.out.println("게시글 내용 : ");
			String content = scan.nextLine();
			System.out.println("게시글 작성자 : ");
			String name = scan.next();
			return new Board(type, title, content, name);			
		}catch(Exception e) {
			System.out.println("잘못 입력했습니다");
			scan.nextLine();
			return null;
		}
	
	}
	private void insertBoard(Board bod) {
		if(bod == null) {
			return;
		}
		list.add(bod);		
		System.out.println("게시글이 등록되었습니다");
	}
	
	private void printBoard() {
		if(list.size() == 0) {
			System.out.println("저장된 게시글이 없습니다");
			return;
		}else {
			System.out.println("---------------------");
			for(Board tmp : list) {
				System.out.println(tmp);
			}
			System.out.println("---------------------");
		}
	}
	
	private void detailPrintBoard() {
		if(list.size() == 0) {
			return;
		}
		System.out.print("확인할 게시글 번호를 입력하세요(나가기 = -1) : ");
		int num = scan.nextInt();
		try {
			if(num == -1) {
				System.out.println("나가기");
				return;
			}else {
				list.get(num-1).detailPrint();
				//조회수 1증가
				Board tmp = list.get(num-1);
				tmp.updateView();
				
			}
		}catch(Exception e) {
			System.out.println("잘못 입력했습니다");
			scan.nextLine(); 
			return;
		}
		
	}

	private void modifyBoard() {
		if(list.size() == 0) {
			return;
		}
		try {
			System.out.println("수정할 게시글을 선택하세요");
			int num = scan.nextInt();
			System.out.println("게시글 제목 수정 : ");
			String title = scan.next();
			System.out.println("게시글 내용 수정 : ");
			String content = scan.next();	
			list.get(num-1).modify(title, content);
			System.out.println("게시글이 수정되었습니다");
		}catch(Exception e) {
			System.out.println("잘못 입력했습니다");
			scan.nextLine(); 
			return;
		}
	}
	
}

