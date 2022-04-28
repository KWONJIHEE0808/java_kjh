package day3;

public class Ex7_Switch1 {

	public static void main(String[] args) {
		/* 홀수 짝수 판별 예제
		 * num가 2로 나누었을 떄 나머지가 0과 같으면 짝수라고 출력하고
		 * 아니면 홀수라고 출력한다
		 */
		
		int num = 4;
		if(num % 2 == 0) {
			System.out.println(num + "는 짝수");			
		}else {
			System.out.println(num + "는 홀수");
		}
		
		// 위에 식을 스위치로 바꿀경우
		
		switch(num % 2) {
		case 0:
			System.out.println(num + "는 짝수");	
			break;
		default:
			System.out.println(num + "는 홀수");
			break;
		//num를 2로 나누었을때 나올수 있는 나머지는 0 or 1 -> default=else랑 같은뜻
	    //break; 를 안 넣으면 계속 나옴
			
		}

	}

}
