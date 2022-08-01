package day17;

public class Ex1_Wrapper {

	public static void main(String[] args) {
		/* 제네릭은 기본타입이 올 수 없고 클래스가 필요하다(기본타입으로 만든 Wrapper 클래스 이용)
		 * Wrapper 클래스의 객체는 기본타입값과 null을 가짐
		 * - 언박싱 할때 null일 수 있기때문에 조심해야함
		 * - 기본타입은 기본타입값만 가질 수 있다
		 * - 두 기본타입 변수는 ==로 비교 가능
		 * - 기본타입 변수와 Wrapper 클래스 객체를 ==로 비교할 수 있다
		 * - Wrapper끼리는 ==로 비교할 수 없다(equals 활용)
		 */
		//List<Integer> list = new ArrayList<Integer>();
		
		Integer num1 = 1; //자동 박싱
		int num2 = num1; //자동 언박싱
		Integer num3 = null;
		//int num4 = num3; <- num3 = null이라서 예외발생
		int num5 = 1, num6 =2;
		if(num5 == num6) {//기본타입 변수끼리는 ==로 비교할 수 있다
			System.out.println(num5+"와 "+num6+"은 같다");
		}else {
			System.out.println(num5+"와 "+num6+"은 다르다");
		}
		
		Integer num7 = 1, num8 = new Integer(1); //Wrapper끼리는 ==로 비교할 수 없다
		if(num7 == num8) {
			System.out.println(num7+"와 "+num8+"은 같다");
		}else {
			System.out.println(num7+"와 "+num8+"은 다르다");
		}
		
		if(num7 == (int)num8) { //(int)로 언박싱하면 ==로 비교할 수 있다 <- Wrapper객체와 기본타입 변수 비교
			System.out.println(num7+"와 "+num8+"은 같다");
		}else {
			System.out.println(num7+"와 "+num8+"은 다르다");
		}
		
		String str1 = "1000";
		int num9 = Integer.parseInt(str1);
		System.out.println("문자열 : "+str1+", 정수 : "+num9);
		
		String str2 = "1.23";
		double num10 = Double.parseDouble(str2);
		System.out.println("문자열 : "+str2+", 정수 : "+num10);
		
		
		
		
		
		
		
		
	}

}
