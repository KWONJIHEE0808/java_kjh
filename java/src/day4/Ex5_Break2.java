package day4;

import java.util.Scanner;

public class Ex5_Break2 {

	public static void main(String[] args) {
		/* 양의 정수를 무한으로 입력하고, 입력한 정수를 콘솔에 출력하는 코드를 작성하세요.
		 * 입력받은 정수가 음수이면 반복문을 빠져 나오게 수정
		 */
		
		/* 반복횟수 : 5회
		 * 규칙성 : Scanner를 이용하여 정수를 입력받아 num에 저장하고,
		 * num 가 음수이면 반복문을 빠져나가고 아니면 num를 출력
		 * 반복문 종료 후 : 없음
		 */
		Scanner scan = new Scanner(System.in);
		
		int num;
		for(;;) {
			System.out.println("양의 정수 입력 : ");
			num = scan.nextInt();
			if(num<0) {
				break;
			}System.out.println(num);
		scan.close();	
		}
		//for{;;} 안에를 안 적으면 무한루프
		
		
	}

}
