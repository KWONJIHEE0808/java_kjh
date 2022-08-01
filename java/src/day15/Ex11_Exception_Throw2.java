package day15;

public class Ex11_Exception_Throw2 {

	public static void main(String[] args) {
		try {
			throwException2();
		}
		catch(RuntimeException e) {
			System.out.println("런타임 예외");
		}
		catch(Exception e) {
			System.out.println("예외");
		}
		

	}
	public static void throwException1() throws Exception {
		/* Exception은 RuntimeException의 부모 클래스이지 자식클래스가 아니기 때문에 RuntimeException이 아니다.
		 * throws에 적어야함
		 */
		throw new Exception();
	}
	
	public static void throwException2(){
		//RuntimeException는 throws를 적어도 되고, 안 적어도 된다 
		throw new RuntimeException();
	}

}
