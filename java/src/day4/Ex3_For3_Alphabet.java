package day4;

public class Ex3_For3_Alphabet {

	public static void main(String[] args) {
		/* 반복문을 이용하여 a부터 z까지 출력하는 코드를 작성하세요 
		 */
		
		/* 반복횟수 : 26번(a~z는 26개) i는 0부터 26보다 작을때까지 1증가
		 * 규칙성 : i는 0부터 26보다 작을때까지 1증가
		 * 실행문 : (char)('a'+i)를 출력
		 */
		int i;
		for(i=0; i<26; i++) {
			System.out.print((char)('a'+i));
		}		
		//char을 빼면 a의 숫자인 97부터 나옴
		System.out.println( );
		//println()에 스페이스 넣으면 한줄 띄우고 아래거 출력
		
		char j;
		for(j='a'; j<='z'; j++) {
			System.out.print(j);
		}
		
		int num1 =1;
		char ch1 = 'a'+1;//a도 1도 char타입이라서 가능
		//char ch2 = 'a'+num1; -> num1은 int라서 오류 발생
		char ch2 = (char)('a'+num1); //char로 강제타입변환하면 가능
	}

}
