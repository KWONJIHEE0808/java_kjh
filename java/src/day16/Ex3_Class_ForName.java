package day16;

public class Ex3_Class_ForName {

	public static void main(String[] args) {
		Class c = null;
		try {
			c = Class.forName("java.util.Scanner");
			System.out.println(c);
			c = Class.forName("day12.Car");
			System.out.println(c);
			c = Class.forName("java.util.Scanner1");//""안에 없는걸 적으면 에러남
			System.out.println(c);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch(Exception e) {
			e.printStackTrace();
		}

	}

}
