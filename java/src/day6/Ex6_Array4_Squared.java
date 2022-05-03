package day6;

public class Ex6_Array4_Squared {

	public static void main(String[] args) {
		//
		/* 배열에 1의 제곱부터 10의 제곱까지 저장하고, 출력하는 코드를 작성하세요
		 */
		int []arr = new int[10];
		for(int i=0; i<arr.length; i++) {
			arr[i]=(i+1)*(i+1);
			System.out.println((i+1)+"의 제곱: "+(arr[i]));
		}
		int []arr2 = new int[11];
		for(int i=1; i<arr2.length; i++) {
			arr2[i]=i*i;
			System.out.println(i+"의 제곱: "+(arr2[i]));
		}
		
	}

}
