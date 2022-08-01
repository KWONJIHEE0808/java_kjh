package day16;

public class Ex4_String_Constructor {

	public static void main(String[] args) {
		String str1 = "abc";
		String str2 = new String("abc"); //생성자를 통해 만드는법
		String str3 = "abc";		
		/* 문자열을 리터럴 문자열("")로 초기화하면 같은 리터럴 문자열로 초기화한 다른 문자열과 주소 공유
		 * String은 내용을 바꿀수없기 때문
		 * 생성자를 이용하면 같은 내용의 문자열이더라도 다른 주소에 할당
		 */
		
		if(str1 == str2) {
			System.out.println("str1과 str2가 같은 주소");
		}else {
			System.out.println("str1과 str2가 다른 주소");
		}
		if(str1 == str3) {
			System.out.println("str1과 str3이 같은 주소");
		}else {
			System.out.println("str1과 str3이 다른 주소");
		}

	}

}
