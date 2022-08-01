package day15;

public class Ex7_Exception_TryCatchFinally {

	public static void main(String[] args) {
		int num1 = 1, num2 = 0;
		int res = 0;
		try {
			/* 예외가 발생했을때 예외처리를 안하면 프로그램 중단
			 * 예외처리시 프로그램 중단없이 예외처리후 이어서 시작
			 * 예외가 발생하면 밑에 코드가 있던없던 catch로 이동해서 예외처리함
			 * catch는 여러개 올수있고, Exception은 무조건 마지막 catch에 배치
			 * catch를 작성할 때 부모 예외들을 자식 아래로 배치
			 */
			res = num1%num2;
			System.out.println(res);
		}
		/* RuntimeException을 ArrayIndexOutOfBoundsException 위에 추가하면 에러발생
		 * ArrayIndexOutOfBoundsException가 발생해도 RuntimeException에서 걸리기때문에
		 * ArrayIndexOutOfBoundsException에 올 일이 없기 때문
		 * catch(RuntimeException e){
		 * 
		 * }
		 */
		
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("0으로 나눌 수 없습니다");
		}
		catch(Exception e) {
			System.out.println("예외 발생"); //모든 예외는 Exception에 걸리므로 마지막에 꼭 적어주기
			return; //예외처리 후 메소드가 종료되어도 finally는 무조건 실행
		}
		finally {
			System.out.println("finally입니다");
		}
		System.out.println("프로그램 종료");
		

	}

}
