package day20;

public class Ex2_Thread1 {

	public static void main(String[] args) {
		
		Thread th1 = new Thread(new Test1());
		/* Test1 t1 = new Test1();
		 * Thread th1 = new Thread(t1);
		 * 위 두줄을 한줄로 줄인 방법
		 */
		th1.setPriority(Thread.MAX_PRIORITY);
		th1.start();
	
		Thread th2 = new Thread(new Test2());
		th1.setPriority(Thread.MIN_PRIORITY);
		th2.start();

		Thread th3 = new Thread(new Runnable() {			
			@Override
			public void run() {
				for(int i=0; i<1000; i++) {
					System.out.println("@");
				}
			}
		});
		th3.start();
		
		for(int i=0; i<1000; i++) {
			System.out.println("|");
		}
	}

}

//Runnable 인터페이스를 구현한 구현 클래스를 이용하는 방법
class Test1 implements Runnable{

	@Override
	public void run() {
		for(int i=0; i<1000; i++) {
			System.out.println("-");
		}
	}	
}

//Thread 클래스를 상속 받은 자식 클래스를 이용하는 방법
class Test2 extends Thread{
	@Override
	public void run() {
		for(int i=0; i<1000; i++) {
			System.out.println("*");
		}
	}	
}