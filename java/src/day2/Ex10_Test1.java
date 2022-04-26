package day2;

public class Ex10_Test1 {

	public static void main(String[] args) {
		/* num가 짝수인지 아닌지 확인하는 코드를 작성하세요 (A성적 출력하는 예제를 활용)
		 */
		int num = 1;
		
		System.out.println(num + "는 짝수인가? " + (num % 2 == 0));
		
		// 짝수는 2의 배수 -> 2로 나누었을때 나머지 0 -> num 2 % 0 == -> num % 2 == 0
		
		
		/* num가 짝수이면 num는 짝수라고 출력하고, num가 짝수가 아니면 num는 짝수가 아님이라고 출력하도록 코드를 작성하세요
		*/
		
		String str = (num % 2 ==0)?"짝수" : "짝수가 아님";
		System.out.println(num + "는 " + str);
		
	}

}
