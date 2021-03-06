package day5;

import java.util.Scanner;

public class Ex3_UpDown {

	public static void main(String[] args) {
		/* 랜덤으로 생성한 수(1~100)를 맞추는 게임을 작성하세요
		 * 정수를 입력했을때 입력한 정수보다 랜덤으로 생성된 수가 크면 UP, 작으면 Down을 표시하고
		 * 맞으면 "맞췄습니다"라고 표시
		 * 
		 * 반복횟수 : 무한
		 * 규칙성 : 입력받은 정수가 랜덤한 수 r과 같으면 정답입니다 라고 출력한 후 반복문을 빠져나가고,
		 * 		  입력받은 정수가 랜덤한 수 r과 같지않고 r보다 크면 Down이라고 출력하고,
		 * 	      입력받은 정수가 랜덤한 수 r과 같지않고 r보다 작으면 UP이라고 출력
		 */
		Scanner scan = new Scanner(System.in);
		int min=1,max=100;
		int r=(int)(Math.random()*(max-min+1)+min);
		System.out.println("랜덤으로 생성한 수(1~100) : " + r);
		while(true) {
			System.out.println("1~100 사이의 정수를 입력하세요 : ");
			int num = scan.nextInt();
			if(num<1||num>100) {
				continue;
			}
			if(num==r) {
				System.out.println("정답입니다");
				break;
			}
			else if(num>r) {
				System.out.println("DOWN");
			}else {
				System.out.println("UP");
			}
		}
		
		scan.close();
		
		/*for(;;) {
		System.out.println("정수를 입력하세요 : ");
		num = scan.nextInt();
		if(num!=r && num>r) {
			System.out.println("DOWN");
			if(num!=r && num<r) {
				System.out.println("UP");
			}
			else {
				System.out.println("정답입니다");
				break;
			}
		}
	    */
	
	
		

	}

}
