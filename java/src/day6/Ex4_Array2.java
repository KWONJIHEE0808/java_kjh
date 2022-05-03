package day6;

public class Ex4_Array2 {

	public static void main(String[] args) {
		//
		
		int []arr = new int[5]; //5개짜리를 만드는경우 0,1,2,3,4 (5는 포함X 헷갈리지말자)
		arr[0]=1;
		System.out.println(arr[0]); //arr 0번지에 1을 저장하는 코드
		
		arr[1]=2;
		System.out.println(arr[1]); //arr 1번지에 2를 저장하는 코드
		
		//arr[5]=6;
		//System.out.println(arr[5]);} //5는 범위를 벗어남
		
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);
		System.out.println("------------------");
		for(int i=0; i<=4; i++) {
			System.out.println(arr[i]);
		}
		System.out.println("------------------");
		for(int i=0; i<5; i++) {
			System.out.println(arr[i]);
		}
		System.out.println("------------------");
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
	}


}
