package day8;

public class Ex1_Method1_Sum {//<-클래스

	public static void main(String[] args) {//<- 메소드/메소드안에 다른 메소드 불가능, 클래스안에선 가능
		/* 두 정수의 합을 알려주는 메소드를 작성해보세요
		 */
		int num1=1, num2=2;
		int res = sum1(num1, num2);
		System.out.println(res);
		System.out.println(sum1(1,2));
		sum2(1,2);
		
	}
	/* 기능 : 두 정수가 주어지면 두 정수의 합을 알려주는 메소드(두번째 방법보다 이 방법이 더 좋음)
	 * 매개변수 : 두 정수 -> int num1, int num2
	 * 리턴타입 : 두 정수의 합 -> 정수 -> int
	 * 메소드명 : sum1
	 */
	public static int sum1(int num1, int num2) {
		int res = num1+num2;
		return res;
	}	
	/* 기능 : 두 정수가 주어지면 두 정수의 합을 콘솔에 출력하는 메소드
	 * 매개변수 : 두 정수 -> int num1, int num2
	 * 리턴타입 : 없음 -> void(리턴타입이 없다는 뜻)
	 * 메소드명 : sum2
	 */
	public static void sum2(int num1, int num2) {
		int res = num1+num2;
		System.out.println(res);
	}

}
