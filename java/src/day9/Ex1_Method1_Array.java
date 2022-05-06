package day9;

public class Ex1_Method1_Array {


	public static void main(String[] args) {
		/* 1~4 사이의 중복되지 않은 3개의 수를 생성하여 배열에 저장하고 출력하는 코드를 작성하세요 
		 * contains와 printArray를 이용
		 */
		/* 3개짜리 배열 생성
		 * 저장된 개수가 3개가 될때까지 count
		 * count가 3이 아니면 동작(count가 3보다 작으면 동작)
		 * 1~4 사이의 랜덤한 수 생성
		 * 배열에 count개만큼 랜덤한 수와 비교하여 있는지 없는지 확인
		 * 없으면 배열 count 번지에 랜덤한 수 저장후 count 1 증가
		 */
		int com[] = new int[3];
		int min=1, max=6;
		for(int count=0; count<3;) {
			int r=(int)(Math.random()*(max-min+1)+min);
			if(!contains(com, count, r)) {
				com[count]=r;
				count++;
			}
		}printArray(com);	
		
		/* 사용자가 1~9 사이의 정수 3개를 입력
		 */
		int user[]= {1,2,3};
		System.out.println(getStrike(com, user));
		System.out.println(getBall(com, user));
	}		
	/* 기능 : 정수형 배열 처음부터 n개중 정수 num이 있는지 없는지 알려주는 메소드
	 * 
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
	
	/* 기능 : 정수형 배열이 주어졌을 때, 주어진 배열의 값을 콘솔에 출력하는 메소드
	 * 
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

	/* 기능 : 정수형 배열 2개가 주어지면 스트라이크 개수(같은 자리에서 일치하는 숫자의 개수)를 알려주는 메소드
	 * 매개변수 : 정수형 배열 2개 -> int arr1[], int arr[]
	 * 리턴타입 : 스트라이크 개수 -> int
	 * 메소드명 : getStrike
	 */
	public static int getStrike(int arr1[], int arr2[]) {
		if(arr1==null || arr2==null) {
			return 0;
		}
		int strike = 0;
		int count = arr1.length>arr2.length?arr2.length:arr1.length;
		for(int i=0; i<count; i++) {
			if(arr1[i]==arr2[i]) {
				strike++;
			}		
		}
		return strike;
		
	}
	
	/* 기능 : 정수형 배열 2개가 주어지면 볼 개수(다른 자리에서 일치하는 숫자의 개수)를 알려주는 메소드
	 * 매개변수 : 정수형 배열 2개 -> int arr1[], int arr[]
	 * 리턴타입 : 볼 개수 -> int
	 * 메소드명 : getBall
	 */
	public static int getBall(int arr1[], int arr2[]) {
		if(arr1==null || arr2==null) {
			return 0;
		}
		int ball = 0; //볼+스트라이크 개수
		for(int tmp:arr1) {
			if(contains(arr2, arr2.length, tmp)) {
				ball++;
			}		
		}
		return ball - getStrike(arr1,arr2);		
	}

}