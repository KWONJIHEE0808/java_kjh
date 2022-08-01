package day17;

import java.util.Random;

public class Ex3_Random {

	public static void main(String[] args) {
		Random r = new Random(); 
		//Random 생성자에 시드값을 입력안하면 현재시간을 시드값으로 랜덤한 수를 생성
		//입력하면 입력한 값을 이용하여 랜덤한 수를 생성하기 때문에 항상 같은 순서로 랜덤한 값이 나옴
		int num = 5;
		for(int i=0; i<num; i++) {
			System.out.println(r.nextDouble()); //0이상 1미만 난수(어지러울 난, 랜덤수)
		}
		System.out.println("---------------------");
		for(int i=0; i<num; i++) {
			System.out.println(r.nextInt());//int의 최소값에서 최대값 사이의 난수
		}
		System.out.println("---------------------");
		int min = 1, max = 9;
		for(int i=0; i<num; i++) {
			System.out.println(r.nextInt(max - min + 1) + min);//min~max 사이의 난수
		}
		
		/* Math.random()은 객체를 생성안하고 호출할 수 있지만 식이 복잡하다
		 * Random 클래스의 nextInt(num)는 객체를 생성하고 호출해야하지만 식이 간단하다
		 */
	}

}
