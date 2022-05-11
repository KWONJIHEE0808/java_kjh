package day12;

public class Ex3_Override1 {

	public static void main(String[] args) {
		Animal a = new Animal();
		a.bark();
		Dog d = new Dog();
		d.bark();
		Cat c = new Cat();
		c.bark();

	}

}

class Animal{
	public void bark() {
		System.out.println("짖다");
	}
}

class Dog extends Animal{
	@Override
	public void bark() {
		super.bark();//부모 클래스의 메소드 뒤에 새로운 기능을 추가,super.메소드()는 super();랑 다르게 첫번째줄 아니어도됨
		System.out.println("멍멍");
	}
}

class Cat extends Animal{
	@Override
	public void bark() {
		System.out.println("야옹");//부모 클래스의 메소드를 사용하지않고 재정의
	}
}