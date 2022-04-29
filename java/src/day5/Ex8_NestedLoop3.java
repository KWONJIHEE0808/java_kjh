package day5;

import java.util.Scanner;

public class Ex8_NestedLoop3 {

	public static void main(String[] args) {
		/* 1부터 100사이의 모든 소수를 출력하는 코드를 작성하세요 
		 * 1부터 100사이의 정수를 차례대로 num에 저장하여 출력하는 코드
		 *  - num이 소수인지 아닌지 판별하는 코드
		 */	
		Scanner scan = new Scanner(System.in);
		
		for(int num =1; num<=100; num++) {
			int count = 0;
			for(int i=1; i<=num; i++) {
				if(num%i==0) {
					count++;
					//i가 num의 약수이다-> num을 i로 나누었을때 나머지가 0
			}
		}
			if(count==2) {
				System.out.print(num + " ");
				//약수의 개수가 2개 -> 소수, 아니면 출력 X
		}
	}
		
		
		/*int i, j;
		for(i=1; i<=100; i++){
            for(j=2; j<=i; j++){
                if(i!=j && i%j ==0)
                	break;
                if(i==j){
                    System.out.print(i+" ");
                }
            }
        }
        */
		
		scan.close();
		
	}

}
