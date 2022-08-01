package day17;

public class Ex2_Math {

	public static void main(String[] args) {
		/* 주어진 정수를 소수점 n번째자리에서 반올림하는 코드를 작성하세요
		 * 
		 */
		double pi = 523.141592;
		int num = -2; //3 넣으면 2번째 자리까지, 4넣으면 3번째 자리까지
		
		double pi2 = pi * Math.pow(10, num-1);
		
		double pi3 = Math.round(pi2) / Math.pow(10, num-1);
		
		System.out.println(pi3);
		
		double pi4 = Math.round(pi * Math.pow(10, num-1)) / Math.pow(10, num-1);
		
		System.out.println(pi4);
		
	}

}
