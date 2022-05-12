package day13;

public class Ex1_Interface1 {

	public static void main(String[] args) {
		Controller rc = new RemoteController();
		rc.print();
		rc.run();
		rc.print();
		rc.stop();
		rc.print();
		
		
		Controller rc2 = new Controller() {
			/* 익명 구현 객체 : 익명 클래스를 이용하여 객체를 생성
			 * 인터페이스를 이용하여 재사용없이 같은종류의 객체를 1개만 만들면 될 때 사용
			 */
			
			@Override
			public void stop() {
				System.out.println("중지");
			}
			
			@Override
			public void run() {
				System.out.println("시작");
				
			}
			
			@Override
			public void print() {
				System.out.println("출력");
				
			}
		};
		rc2.print();
		rc2.run();
		rc2.print();
		rc2.stop();
		rc2.print();
	}

}
