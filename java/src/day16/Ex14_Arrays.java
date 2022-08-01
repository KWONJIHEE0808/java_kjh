package day16;

import java.util.Arrays;

public class Ex14_Arrays {

	public static void main(String[] args) {
		int nums[] = {10, 2, 8, 1, 5};
		System.out.print("정렬전 배열 : ");
		for(int i=0; i<nums.length; i++) {
			System.out.print(nums[i]+" ");
		}
		System.out.println();
		
		Arrays.sort(nums);
		
		System.out.print("정렬후 배열 : ");
		for(int i=0; i<nums.length; i++) {
			System.out.print(nums[i]+" ");
		}
		System.out.println();

	}

}
