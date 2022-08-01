package day21;

import java.util.function.*;

import day21.Outer.Inner;

public class Ex6_Lambda4 {

	public static void main(String[] args) {
		Outer o = new Outer();
		Inner i = o.new Inner();
		i.method();

	}

}

//람다식에서 클래스 필드에 접근하는 코드
class Outer{
	public int outerField = 10;
	
	class Inner{
		int innerField = 20;		
		void method() {
			int localField = 10;
			Consumer<Integer> co = (Integer a)->{
				System.out.println("outerField : " + outerField);
				System.out.println("outerField : " + Outer.this.outerField);
				
				System.out.println("innerField : " + innerField);
				System.out.println("innerField : " + this.innerField);
				
				System.out.println("localField : " + localField);
			};
			co.accept(1);
		}
	}
}