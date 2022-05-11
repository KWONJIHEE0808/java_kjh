package day12;

public class Ex1_Inheritance1 {

	public static void main(String[] args) {
		Child c = new Child();
		c.x = 10;
		c.y = 20;
		//c.z = 30; <-에러
		c.setZ(30);

	}

}

class Parent{
	public int x;
	protected int y;
	private int z;
	
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public int getZ() {
		return z;
	}
	public void setZ(int z) {
		this.z = z;
	}
	
	
}

class Child extends Parent{
	public int s;
	public void print() {
		System.out.println(x); // public이라 호출 가능
		System.out.println(y); // protected라 자식 + 같은패키지 호출 가능
		//System.out.println(z); // private라 호출 불가능
		System.out.println(getZ()); //소스에서 게터 세터 만들어서 불러오면 사용가능
		System.out.println(s);
	}
	
}