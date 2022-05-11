package day12;

public class Ex2_Inheritance2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

class A{
	public void print() {
		System.out.println("Hello");
	}
}

class B{
	public void print() {
		System.out.println("Hi");
	}
}

class C extends A{
	/* A와 B를 동시에 상속받을 수 없다. 
	 * 동시 상속하면 클래스 C를 이용하여 생성한 객체에 print()를 호출했을때,
	 * A의 print()인지 B의 print()인지 알 수 없기때문에 동시 상속이 안됨
	 */
}