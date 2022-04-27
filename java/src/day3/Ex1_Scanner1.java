package day3;

import java.util.Scanner;

public class Ex1_Scanner1 {

	public static void main(String[] args) {
		/* 한 학생의 수학 영어 국어 성적을 입력받고, 총점과 평균을 구하세요
		 * 단, 성적은 정수로 입력(0~100사이의 정수)
		 */
		Scanner scan = new Scanner(System.in);
		
		System.out.print("수학 점수를 입력하세요 : ");
		int math = scan.nextInt();
		System.out.print("영어 점수를 입력하세요 : ");
		int english = scan.nextInt();
		System.out.print("국어 점수를 입력하세요 : ");
		int korean = scan.nextInt();
		
		int total = math + english + korean;
		double average = total/3.0; //나누기할때 double 꼭!!!!
		System.out.println("총점은 "+total+"입니다.");
		System.out.println("평균은 "+average+"입니다.");
		
		scan.close();

	}

}
