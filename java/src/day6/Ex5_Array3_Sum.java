package day6;

import java.util.Scanner;

public class Ex5_Array3_Sum {

	public static void main(String[] args) {
		//
		/* 학생 3명의 국어 성적을 입력받고 총점과 평균을 구하는 코드를 작성하세요
		 * 단, 총점과 평균을 출력한 다음 학생 3명의 성적을 출력하세요.
		 */
		/* 배열 선언
		 * 반복문 몇번
		 * 반복문을 이용하여 총점 계산
		 * 총점을 이용하여 평균 계산
		 * 총점과 평균 출력
		 * 반복문을 이용하여 학생 점수 출력
		 */
		
		Scanner scan = new Scanner(System.in);
		int score[] = new int[3];
		int sum =0;
		double avg = 0;
		for(int i=0; i<score.length; i++) {
			System.out.println((i+1)+"번째 학생 성적 : ");
			score[i]=scan.nextInt();
		}
		for(int i=0; i<score.length; i++){
			sum+=score[i];
		}
		avg=sum / (double)score.length;
		System.out.println("학생 3명의 총점은 " +sum+"점이고, 평균은 "+avg+"점입니다");
		
		for(int i=0; i<score.length; i++) {
			System.out.println((i+1)+"번째 학생의 점수 : "+score[i]);
		
		scan.close();
		}
		
	}

}
