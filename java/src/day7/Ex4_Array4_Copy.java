package day7;

public class Ex4_Array4_Copy {

	public static void main(String[] args) {
		/* arr2 배열을 생성하여 arr1 배열을 복사하고, arr2 배열값을 출력하세요
		 */
		int arr1[]={1,4,6,8};
		int arr2[]=new int[arr1.length];
		int arr3[]=arr1; //arr1을 "="을 통해 arr3에 복사(정확히는 복사가 아님 arr1의 주소를 공유)
		int arr4[]=new int[arr1.length];
		int i;
		for(i=0; i<arr1.length; i++) {
			arr2[i]=arr1[i];
		}//arr1의 값들을 반복문을 통해 arr2에 복사
		
		System.arraycopy(arr1, 0, arr4, 0, arr1.length);
		//arr1의 값들을 기능을 통해 arr4에 복사하는 코드
		//arr1 배열에 있는 값들을 0번지부터 arr.length에 복사하여 arr4배열의 0번지부터 붙여넣어줌
		
		arr1[0]=0;
		System.out.print("arr1 : ");
		for(i=0; i<arr1.length; i++) {
			System.out.print(arr1[i]+" ");
		}//arr1의 0번지 값을 0으로 수정
		
		System.out.println();
		System.out.print("arr2 : ");
		for(i=0; i<arr2.length; i++) {
			System.out.print(arr2[i]+" ");
		}
		
		System.out.println();
		System.out.print("arr3 : ");
		for(i=0; i<arr3.length; i++) {
			System.out.print(arr3[i]+" ");
		}System.out.println();
		
		System.out.print("arr4 : ");
		for(i=0; i<arr4.length; i++) {
			System.out.print(arr4[i]+" ");
		}System.out.println();
	
	}

}
