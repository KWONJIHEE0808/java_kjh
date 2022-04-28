package day4;

public class Ex4_Break1 {

	public static void main(String[] args) {
		/* break는 반복문에서 빠져나올때 사용
		 * 
		 */
		for(int i = 1; i<=5; i++) {
			System.out.println("Hello");
			if(i==3) {
				break;
			}
		}
	}

}
