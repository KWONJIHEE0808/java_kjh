package day15;

public class Ex14_Method {

	public static void main(String[] args) {
		System.out.println(sum(1,2));
		System.out.println(sum(4,5,6,7,8));
		System.out.println(sum());

	}
	/* 기능 : 여러 정수의 합을 알려주는 메소드
	 * 매개변수 : 여러개의 정수 > int ...  nums
	 * 리턴타입 : 합 > int
	 * 메소드명 : sum
	 */
	public static int sum(int ...nums) { //메소드의 매개변수가 가변일떄 사용하는 방법 "타입 + ... + 배열명"
		if(nums.length == 0) {
			return 0;
		}
		int sum = 0;
		for(int tmp : nums) {
			sum += tmp;
		}
		return sum;
	}

}
