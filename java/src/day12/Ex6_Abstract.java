package day12;

public class Ex6_Abstract {

	public static void main(String[] args) {

		// Ex6_Animal animal = new Ex6_Animal();<- 추상 클래스를 이용하여 객체를 만들 수 없음
		Ex6_Dog dog = new Ex6_Dog();
		dog.bark();
		Ex6_Animal animal = new Ex6_Dog();
		animal.bark();
	}

}

abstract class Ex6_Animal{ //추상 클래스는 추상 메소드와 일반 메소드 둘 다 존재가능
	public String type;//추상 클래스에는 필드가 있을수있다
	public abstract void bark(); //추상 메소드
	public void print() { //일반 메소드
		System.out.println("동물입니다");
	}
}

class Ex6_Dog extends Ex6_Animal{
	@Override
	public void bark() {
		// TODO Auto-generated method stub
		
	}
	/* 추상 클래스를 상속 받은 일만 클래스는 반드시 추상메소드를 오버라이딩해야한다
	 * 
	 */
	
}