package day5;

public class Ex2_Random {

	public static void main(String[] args) {
		/* 0 <= Math.random() < 1
		 */
		int min=1,max=42;
		int r;
		for(int i=1;i<=6;i++) {
			r=(int)(Math.random()*(max-min+1)+min);
			//그냥 공식처럼 외우기
			System.out.print(r + " ");			
		}
	
	}

}
