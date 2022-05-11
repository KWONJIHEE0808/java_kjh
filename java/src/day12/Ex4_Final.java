package day12;

public class Ex4_Final {

	public static void main(String[] args) {
		FinalTest ft = new FinalTest();
		ft.print();
	}

}
//String은 final 클래스이기때문에 상속 불가능
class FinalTest{
	private final int max = 30;
	public final void print() {
		//max = 20; <-불가능, max는 final이 붙어있기때문
		System.out.println(max);
	}
}

class FinalTestChild extends FinalTest{
	//public final void print() {print()를 오버라이드 할 수 없다 -> print()에 final이 붙어있기때문
		
}