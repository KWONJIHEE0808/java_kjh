package day4;

public class Ex1_For_Prime {

	public static void main(String[] args) {
		/* 정수 num가 소수인지 아닌지 판별하는 코드를 작성하세요
		 * 소수는 약수가 1과 자기 자신인 수 = 약수의 개수가 2개인 수
		 * ex) 1은 소수가 아님, 2와 3은 소수, 4는 소수가 아님
		 */
		
		/* 반복횟수 : i는 1부터 num까지 1씩 증가
		 * 규칙성 : i가 num의 약수이면 약수의 개수를 하나 증가
		 * 반복문 종료 후 : 약수의 개수(count)가 2개이면 소수라고 출력하고, 아니면 소수가 아님이라고 출력
		 */
		int num=131,i,count;
		for(i=1,count=0; i<=num; i++) {
			if(num%i==0) {
				count++;
			}
		}if(count==2) {
			System.out.println(num+"는 소수이다");
		}else {
			System.out.println(num+"는 소수가 아니다");
		}
		//진짜 어렵다
			
	}

}
