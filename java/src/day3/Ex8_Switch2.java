package day3;

public class Ex8_Switch2 {

	public static void main(String[] args) {
		/* 월이 주어졌을 때 주어진 월의 마지막일을 출력하는 코드를 작성하세요. (switch문)
		 * 31 : 1 3 5 7 8 10 12
		 * 30 : 4 6 9 11
		 * 28 : 2
		 * 그 외의 달은 잘못된 월입니다라고 출력
		 */
		int month = 1;
		
		switch(month) {
		case 1,3,5,7,8,10,12:
			System.out.println(month + "월의 마지막일은 31일");	
			//위 실행문은 12의 실행문
		case 2:
			System.out.println(month + "월의 마지막일은 28일");
			break;
		case 4,6,9,11:
			System.out.println(month + "월의 마지막일은 30일");	
			break;
		default:
			System.out.println(month + "월은 없는 달입니다");
		}

	}

}
