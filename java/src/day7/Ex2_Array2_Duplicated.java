package day7;

import java.util.Scanner;

public class Ex2_Array2_Duplicated {

	public static void main(String[] args) {
		/* 정수 num를 입력받고, 입력받은 정수가 배열에 있는지 없는지 확인하는 코드 작성
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("정수를 입력하세요 : ");
		int count=0;
		int num = scan.nextInt();
		int arr[] = {1,2,3};
		if(arr[0]==num){
			count++;
		}if(arr[1]==num){
			count++;
		}if(arr[2]==num){
			count++;
		}if(count>=1){
			System.out.println(num+"는 배열에 있습니다");
		}else {
			System.out.println(num+"는 배열에 없습니다");
		}		
		
		/*
		 if(num==arr[0]||num==arr[1]||num==arr[2]) {
			System.out.println(num+"는 배열에 있습니다");
		}else {
			System.out.println(num+"는 배열에 없습니다");
		}
		*/
		
		/* for(i=0; i<arr.length; i++){
		 * 		if(arr[i]==num){
		 * 			count++
		 * 		}
		 * }
		 * if(count>=1){
		 * 		sysout~
		 * }else{
		 * 		sysout~
		 * }
		 */
		
		/* for(i=0; i<arr.length; i++){
		 * 		if(arr[i]==num){
		 * 			break;
		 * 		}
		 * }if(i<arr.length){
		 * 		sysout~
		 * }else{
	     * 		sysout~
	     * }
		 */
		
		scan.close();
	}

}
