package day10;

public class Ex2_Class_Static1_Point {

	public static void main(String[] args) {
		//Point.print(); -> print 메소드는 객체 메소드이기때문에 클래스 이름으로 호출할 수 없다
		Point1 p1 = new Point1(10,20);
		p1.print();
		
		Point1.printDimensional();
		//printDimensional은 클래스 메소드이기떄문에 클래스 이름으로 호출할 수 있다
		
		p1.printDimensional();
		//p1.printDimensional은 경고가 뜨지만 호출할 수 있긴함(객체를 이용한 방법)

	}

}

class Point1{
	static String dimensional="이차원";//클래스 변수
	int x, y;//객체 변수
	
	public Point1(int x, int y) {//내 필드 x, y에 매개변수 x, y의 값을 저장
		this.x=x;
		this.y=y;
		//멤버변수(파랑)와 매개변수(갈색) 이름이 같을때 this 사용
	}
	
	public Point1() {
		this(0,0);//x=0, y=0
	}
	
	public void print() {//static 붙이면 에러남 -> x,y가 있기때문
		System.out.println("차원 : " + dimensional);
		System.out.println("좌표 : " + x + "," + y);
	}
	
	public void move(int x, int y) {
		this.x=x;
		this.y=y;
	}
	
	public static void printDimensional() {//객체 변수 없어서 static 붙여도 됨
		System.out.println("차원 : " + dimensional);
		
	}
}
