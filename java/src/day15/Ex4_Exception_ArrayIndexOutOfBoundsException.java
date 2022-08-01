package day15;

public class Ex4_Exception_ArrayIndexOutOfBoundsException {

	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5};
		
		//0번지~크기-1번지까지 해야하는데 실수로 0번지~크기번지까지 하는경우 <- 가장 흔한 실수
		for(int i=0; i<=arr.length; i++) {
			//System.out.println(arr[i]); <- 경고 표시 X, 예외 발생
		}
		
		//변수를 이용하여 배열을 제어하는 경우, 변수의값이 배열의 크기를 넘지않도록 해야하는데 넘는경우
		int num = 10; //5개짜리 배열인데 변수의값을 10으로 설정
		for(int i=0; i<num; i++) {
			System.out.println(arr[i]);
		}

	}

}
