package day15;

public class Ex15_Method2 {

	public static void main(String[] args) {
		System.out.println(sum1(5));
		System.out.println(sum1(5,1,2,3));
		System.out.println(sum1(5,1,2,3,4,5));
		System.out.println(sum1(5,1,2,3,4,5,6));

	}
	public static int sum1(int max, int ... nums) {//max와 ...nums 둘의 순서를 바꾸면 오류발생, ...nums는 제일 뒤에 와야함
		if(nums.length == 0 || max == 0) {
			return 0;
		}
		if(max > nums.length) {
			max = nums.length;
		}
		int sum = 0;
		for(int i=0; i<max; i++) {
			sum += nums[i];
		}
		return sum;
	}
}
