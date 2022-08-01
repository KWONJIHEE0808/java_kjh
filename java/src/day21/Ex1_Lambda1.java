package day21;

public class Ex1_Lambda1 {

	public static void main(String[] args) {
		//스레드 활용 코드
		Thread th1 = new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println("안녕");
			
			}
			
		});
		th1.start();
		
		//위의 코드를 람다식으로 활용
		Thread th2 = new Thread(()->System.out.println("Hi"));
		th2.start();
		
		Thread th3 = new Thread(()->{
			System.out.println("하이");
		});
		th3.start();

	}

}


