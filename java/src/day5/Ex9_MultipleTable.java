package day5;

public class Ex9_MultipleTable {

	public static void main(String[] args) {
		/* 구구단 7단을 출력하는 코드를 작성하세요
		 * ex. 7 X 1 = 7
		 *     7 X 2 = 14
		 * ...
		 *     7 X 9 = 63
		 *     
		 * 반복횟수 : i는 1부터 9까지 1씩 증가
		 * 규칙성 : 7 x i = (7*i)를 출력
		 * 반복문종료후 : 없음
		 */
		int i, num;
		for(i=2;i<=9;i++) {
			for(num=1;num<=9;num++) { 
			System.out.println(i+"x"+num+" = "+i*num);
			}
		}System.out.println(" ");
		
	}

}
