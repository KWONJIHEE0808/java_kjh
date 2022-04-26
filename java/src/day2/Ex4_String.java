package day2;

public class Ex4_String {

	public static void main(String[] args) {
		/* String 은 첫 글자 대문자
		 * 문자열 + 문자열,정수,문자,실수,논리 => 문자열 
		 */
		
		String str = "Hello";
		str = str + " world";
		System.out.println(str);
		str = str + '!';
		System.out.println(str);
		str = str + 123;
		System.out.println(str);
		str = str + 3.45;
		System.out.println(str);
		str = str + true;
		System.out.println(str);
		
		//=> Hello world!1233.45true 로 출력됨 (계산X, 문자열이라 그대로 추가되는거)
	
	}

}
