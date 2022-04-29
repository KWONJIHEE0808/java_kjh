package day5;

public class Ex10_NestedLoop4 {

	public static void main(String[] args) {
		/* 알파벳 출력
		 * a
		 * ab
		 * abc
		 * ...
		 * abc...xyz
		 * 
		 * 반복횟수 : end는 'a'부터 'z'까지 1씩 증가
		 * 규칙성 : ch는 'a'부터 end까지 1씩 증가하며 ch를 출력
		 */		
		char chr,end;
		for(chr='a';chr<='z'; chr++) {
			for(end='a';end<=chr;end++) {
				System.out.print(end);
			}System.out.println(" ");
		}
	}
		
}
