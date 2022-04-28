package day4;

import java.util.Scanner;

public class Ex2_For_Score {

	public static void main(String[] args) {
		/* 3명의 국어 점수를 입력받아 총점과 평균을 구하는 코드를 작성하세요(반복문 이용)		 
		 * 단, 총점과 평균만 알면 됨(각각 점수 X) 
		 */
		
		/* 학생수, 국어점수, 총점, 평균
		 * 반복횟수 : i는 1부터 3까지 1씩 증가
		 * 규칙성 : 점수를 입력받고 총점에 누적,Scanner를 이용하여 점수를 입력받아,num에 저장한후
		 * sum에 num을 더해서 sum에 저장 
		 * 출력 : 총점을 출력하고, 총점을 이용하여 평균을 계산한 후, 평균을 출력
		 */
		Scanner scan = new Scanner(System.in);
		
		int i, num, sum=0; 
		double avg;
		for(i=1;i<=3;i++) {
			System.out.println("학생"+i+"의 국어 성적 :");
			num = scan.nextInt();
			sum = sum+num; //sum+=num;
		}
		avg =(double)sum/3;
		
		System.out.println("학생 3명의 국어 총점 : "+sum);
		System.out.println("학생 3명의 국어 평균 : "+avg);
		
		scan.close();
		
	}

}
