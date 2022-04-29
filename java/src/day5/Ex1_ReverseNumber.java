package day5;

import java.util.Scanner;

public class Ex1_ReverseNumber {

	public static void main(String[] args) {
		/* 양의 정수를 입력하고, 입력받은 정수를 역으로 출력하는 코드를 작성하세요.
		 * ex) 1230 -> 0321
		 * 1230 -> 0을 출력, 1230 -> 123
		 * 123 -> 3을 출력, 123 -> 12
		 * 12 -> 2를 출력, 12 -> 1
		 * 1-> 1을 출력, 1 -> 0
		 * 0이 되는순간 반복문 종료
		 * 반복횟수 : num가 0이 아닐때까지
		 * 규칙성 : num의 일의 자리를 출력한 후 num를 10으로 나눈 몫을 num에 저장
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("정수를 입력하세요 : ");
		int num = scan.nextInt();
		// int reverseNum = 0;
		// int tmpNum = num;
		while(num!=0) {
			System.out.print(num%10);
			// reverseNum = 10*reverseNum + num%10;
			num = num/10;
		}
		// System.out.println(tmpNum + "를 거꾸로한 정수 : " + reverseNum);
		scan.close();

	}

}
