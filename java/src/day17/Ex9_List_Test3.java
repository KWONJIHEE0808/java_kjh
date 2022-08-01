package day17;

import java.util.*;

public class Ex9_List_Test3 {

	public static void main(String[] args) {
		List<Student> list = new ArrayList<Student>();
		Student std = new Student(1,1,1,"홍길동");
		list.add(new Student(std));
		System.out.println(list);
		
		std.setName("임꺽정");
		/* 학생 객체 std를 생성하여 리스트에 추가한 후,학생 객체를 수정했을때 문제가 생김
		 * -> 복사 생성자를 이용하여 객체를 복사해서 리스트에 추가해야함
		 */
		System.out.println(list);
		

	}

}
