package day3;

public class Ex13_For4_Sum {

	public static void main(String[] args) {
		/* 1부터 5까지 합을 구하는 코드
		 *      sum = 0
		 * i=1  sum = sum0 + 1
		 * i=2  sum = sum1 + 2
		 * i=3  sum = sum2 + 3
		 * i=4  sum = sum3 + 4
		 * i=5  sum = sum4 + 5
		 * 
		 * 반복횟수 : i는 1부터 5까지 1씩 증가
		 * 규칙성 : sum = sum + i
		 * 
		 */
		
		int i;
		int sum = 0;
		for(i=1; i<=5; i++) {
			sum += i;}
			System.out.println("1부터 5까지 합 : " + sum);
		}	

	}


