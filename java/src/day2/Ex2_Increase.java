package day2;

public class Ex2_Increase {

	public static void main(String[] args) {
		/* 증감 연산자 : 최종적으로 1증가 또는 1감소
		 * 전위형 : ++변수명 / 증가 후에 동작
		 * 후위형 : 변수명++ / 동작 후에 증가
		 */
		int num1 = 10, num2 = 10;
		System.out.println(num1 + " , " + num2);
		System.out.println(++num1 + " , " + num2++);
		System.out.println(num1 + " , " + num2);
		//전위형은 출력때 바로 증가, 후위형은 다음 출력부터 증가
		
		int num3 = 10, num4 = 10;
		System.out.println(num3 + " , " + num4);
		++num3;//++num3; //num3 = num3 +1; 과 동일
		System.out.println(num3 + " , " + num4);
		++num4;//++num4; //num4 = num4 +1; 과 동일
		System.out.println(num3 + " , " + num4);
		
	}

}
