package day8;

public class Ex8_Method6_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,2,3,4,5};
		int n = 3;
		int num = 3;
		printArray(arr);
		System.out.println(contains(arr,num));
		System.out.println(contains(arr, n, num));
	}
	
	/* 기능 : 정수형 배열이 주어졌을때, 주어진 배열의 값을 콘솔에 출력하는 메소드
	 * 매개변수 : 정수형 배열 -> int num[]
	 * 리턴타입 : 없음 -> void 
	 * 메소드명 : printArray
	 */
	public static void printArray(int num[]) {
		if(num==null || num.length==0) {
			System.out.println("출력할 배열이 없습니다");
			return;
		}
		 for(int i=0; i<num.length; i++){
	            System.out.print(num[i]+" ");
	        }
		 System.out.println();
	}
	
	/* 기능 : 정수형 배열에 정수 num가 있는지 없는지 알려주는 메소드
	 * 매개변수 : 정수형 배열, 정수 num-> int arr[], int num
	 * 리턴타입 : 해당 정수가 있는지 없는지 -> boolean
	 * 메소드명 : contains
	 */
	public static boolean contains(int arr[], int num) {
		   if(arr==null || arr.length==0) {
			   return false;
		   }
		   for(int tmp:arr) {
			   if(tmp==num) {
				   return true;
			   }
		   }
		   return false;
	}
	/* 기능 : 정수형 배열 처음부터 n개중에서 정수 num가 있는지 없는지 알려주는 메소드
	 * 매개변수 : 정수형 배열 처음부터 n개, 정수 num-> int arr[], int n, int num
	 * 리턴타입 : 해당 정수가 있는지 없는지 -> boolean
	 * 메소드명 : contains
	 */
	public static boolean contains(int arr[], int n,int num) {
		   if(arr==null || arr.length==0 || n<=0) {
			   return false; //배열이 잘못되거나 비교 개수가 잘못돼서 비교할 필요가 없는 경우
		   }
		   if(arr.length<n) {
			   n=arr.length; //n이 배열수보다 크면 배열수만큼 수정
		   }
		   for(int i=0; i<n; i++) {
			   if(arr[i]==num) {
				   return true;
			   }
		   }
		   return false;
	}
		
}
