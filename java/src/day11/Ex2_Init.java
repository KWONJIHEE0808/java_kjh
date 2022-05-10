package day11;

public class Ex2_Init {

	public static void main(String[] args) {
		Test t = new Test(4);
		t.print();
		System.out.println("-------");
		Test2.print();

	}

}

class Test{
	int num1;
	//타입의 기본값(int는 0)으로 초기화
	
	int num2 = 2;
	//명시적 초기화
	
	int num3 = -1;{
		num3 = 3;
	}//초기화 블록을 이용한 초기화
	
	int num4 = 4;
	
	void print() {
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		System.out.println(num4);
	}
	public Test(int num4) {
		this.num4 = num4;
		//생성자를 이용한 초기화
	}
}

class Test2{
	static int num1;
	static int num2 = 2;
	static int num3 = -1;
	static {
		num3 = 3;
	}
	
	public static void print() {
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
	}
}
