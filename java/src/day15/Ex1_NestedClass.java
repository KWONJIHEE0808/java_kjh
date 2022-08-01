package day15;

public class Ex1_NestedClass {

	public static void main(String[] args) {
		//A.num = 10; <=인스턴스 변수여서 클래스를 통해 호출할 수 없다
		A.num2 = 10;
		
		A a = new A();//A생성자 호출
		A.B b = a.new B();//B생성자 호출
		A.C c = new A.C();//C생성자 호출
		
		a.method(1);

	}

}

class A{
	public int num = 1;
	public static int num2;
	
	B b1 = new B();
	C c1 = new C();
	//static B b2 = new B();
	static C c2 = new C();
	
	class B{//인스터스(객체) 멤버 클래스
		int num = 2;
		public B() {
			System.out.println("B생성자");
			System.out.println(this.num);//B객체의 num을 호출
			System.out.println(A.this.num);//바깥 클래스 A 객체의 num을 호출
		}
	}
	static class C{//정적(클래스) 멤버 클래스
		public C() {
			System.out.println("C생성자");
		}
	}
	public void method(int num) {//로컬 클래스
		/* 매개변수와 지역변수 사용시 자동으로 final이 붙는다
		 * 매개변수와 지역변수를 로컬 클래스에서 수정할 수 없다
		 */
		char ch = 'a';
		class D{
			public D() {
				System.out.println("D생성자");
				//ch = 'b'; <-X
				//num = 2; <-X
			}
		}
		D d = new D();
		ch = 'c'; //클래스 내에선 수정 가능
	}
	public A() {
		System.out.println("A생성자");
	}
}
