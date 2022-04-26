package day2;

public class Ex9_BitShift {

	public static void main(String[] args) {
		/*A << B :  정수 A의 각 비트를 B만큼 왼쪽으로 이동 (빈자리는 0으로 채움) -> A를 2의 B제곱만큼 곱한 결과값
		  ex) 3 << 2 : 00000011 -> 00001100 -> 12

		  A >> B : 정수 A의 각 비트를 B만큼 오른쪽으로 이동 (빈자리는 A의 최상위 비트와 같은 값으로 채움)
		  ex) 3 >> 1 : 00000011 -> 00000001 -> 1

		  A >>> B : 정수 A의 각 비트를 오른쪽으로 이동 (빈자리는 0으로 채움)
		  ex) -4 >> 1 = 11111110 -> -2
    		  -4>>> 1 = 01111110 -> 126
       
        */
		
		byte num1 = 3;
		int num2 = -4;
		
		System.out.println(num1<<2);
		System.out.println(num1>>1);
		System.out.println(num2>>1);
		System.out.println(num2>>>1);
		

	}

}
