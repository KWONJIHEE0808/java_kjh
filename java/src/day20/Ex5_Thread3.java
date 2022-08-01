package day20;

public class Ex5_Thread3 {

	public static void main(String[] args) {
		// 한 계좌에 동시에 2명이 접근해서 천원을 빼갈때 생길 수 있는 문제점
		// (2개 이상의 스레드가 하나의 자원을 같이 이용하는 경우 생길 수 있는 문제점)
		// (ex. 영화표를 동시에 예매하는걸 방지)
		
		BankBook book = new BankBook(10000);
		User user1 = new User(book);
		user1.start();
		
		User user2 = new User(book);
		user2.start();

	}

}
class User extends Thread{
	BankBook book;
	
	public User(BankBook book) {
		this.book = book;
	}
	@Override
	public void run() {
		book.withdraw2(1000);
	}
}

class BankBook{
	private int money;

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}
	
	public synchronized void withdraw(int money) {
		/* withdraw = 출금, synchronized = 동기화
		 * 메소드를 동기화하면 어떤 스레드가 동기화 메소드를 실행하고 있을 경우,
		 * 다른 스레드가 접근할때 실행이 다 끝날때까지 일시정지했다가 다 끝나면 실행함
		 */
		this.money -= money;
		try {
			Thread.sleep(1000);
			System.out.println("남은 잔액 : " + this.money);
		}catch(InterruptedException e) {
			
		}
	}
	public void withdraw2(int money) {
		synchronized (this) {
			this.money -= money;
			try {
				Thread.sleep(1000);
				System.out.println("남은 잔액 : " + this.money);
			}catch(InterruptedException e) {
				
			}
		}
	}
	public BankBook(int money) {
		this.money = money;
	}
}