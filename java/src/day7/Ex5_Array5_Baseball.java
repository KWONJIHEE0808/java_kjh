package day7;

import java.util.Scanner;

public class Ex5_Array5_Baseball {

	public static void main(String[] args) {
		/* 정수 3개짜리 배열 com을 생성한 후 
		 * 랜덤으로 1~9 사이의 세 정수를 만들어 배열에 저장하는 코드를 작성(중복가능)
		 */
		int min=1,max=9;
		int com[] = new int[3];
		int user[] = new int[3];
		
		Scanner scan = new Scanner(System.in);
		
		int count=0;
		
		for(;count<3;) {
			int r =(int)(Math.random()*(max-min+1)+min);
			int i=0;
			for(;i<count;i++) {
				if(r==com[i]) {
					break;
				}
			}
			if(i==count) {
				com[count]=r;
				System.out.print(com[count]+" ");
				count++;
			}//반복문 종료 후 i가 count와 같다는 의미는 중복된 수가 없다는 의미
		}
		
		
		System.out.println();
		/* 중복되지 않는 랜덤 수 생성
		 * [0,0,0] : 0
		 * 1 -> [1,0,0] : 1
		 * 1
		 * 5 -> [1,5,0] : 2
		 * 5
		 * 2 -> [1,5,2] : 3
		 */
		
		
		/* 사용자가 정수 3개를 입력하여 3S가 될때까지 게임을 진행하도록 코드를 작성하세요
		 * 단, 사용자가 입력한 정수도 배열에 저장.
		 */
		
		int s, b;
		do {
			s = 0;
			b = 0;
			System.out.println("정수를 입력하세요 : ");
			for(int i=0; i<user.length; i++) {
				user[i]=scan.nextInt();
			}
			/* user[0] = scan.nextInt();
			user[1] = scan.nextInt();
			user[2] = scan.nextInt();
			*/
			
			for(int i=0; i<com.length; i++) {
				if(com[i]==user[i]) {
					s++;
				}
			}
			/* if(com[0]==user[0]) {
				s++;
			}if(com[1]==user[1]) {
				s++;
			}if(com[2]==user[2]) {
				s++;
			}
			*/
			
			for(int i=0; i<com.length; i++) {
				for(int j=0; j<user.length; j++) {
					if(i==j) {
						continue;
					}if(com[i]==user[j]) {
						b++;
					}
				}
			}
			/* if(com[0]==user[1]||com[0]==user[2]) {
				b++;
			}if(com[1]==user[0]||com[1]==user[2]) {
				b++;
			}if(com[2]==user[0]||com[2]==user[1]) {
				b++;
			}	
			*/	
			
			//별개
			s=0;
			b=0;
			for(int i=0; i<com.length; i++) {
				for(int j=0; j<user.length; j++) {
					if(com[i]==user[j]) {
						//같은 숫자가 있으면
						if(i==j) {
							//같은 자리일때 스트라이크
							s++;
						}else {
							//다른 자리일때 볼
							b++;
						}//S와 B 갯수를 같이 확인하는 코드
					}
				}
			}
				
			if(s!=0) {
				System.out.print(s+"S");
			}if(b!=0) {
				System.out.print(b+"B");
			}if(s==0&&b==0) {
				System.out.print("O");
			}System.out.println(" ");				
		}while(s<3);
		scan.close();
		

	}

}
