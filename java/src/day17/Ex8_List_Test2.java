package day17;

import java.util.*;

public class Ex8_List_Test2 {

	public static void main(String[] args) {
		List<Student> list = new ArrayList<Student>();
		Student std = new Student(1,1,1,"홍길동");
		list.add(std);
		
		System.out.println(list);
		int index = list.indexOf(new Student(1,1,1,"홍길동"));
		System.out.println("list에서 학생정보가 있습니까? "+index+"번지");
		System.out.println("list에서 학생정보가 있습니까? "+list.contains(new Student(1,1,1,"홍길동")));
		System.out.println("list에서 학생정보를 삭제했습니까? "+list.remove(new Student(1,1,1,"임꺽정")));
		//list.remove(new Student(1,1,1,"홍길동")); <- 소스에서 해시코드 이퀄스 불러와야 가능
		//list.remove(std); 
		System.out.println(list);

	}

}

class Student{
	private int grade, group, num;
	private String name;
	
	public Student(int grade, int group, int num, String name) {
		this.grade = grade;
		this.group = group;
		this.num = num;
		this.name = name;
	}
	
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public int getGroup() {
		return group;
	}
	public void setGroup(int group) {
		this.group = group;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Student [grade=" + grade + ", group=" + group + ", num=" + num + ", name=" + name + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + grade;
		result = prime * result + group;
		result = prime * result + num;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (grade != other.grade)
			return false;
		if (group != other.group)
			return false;
		if (num != other.num)
			return false;
		return true;
	}
	
	public Student(Student std) {
		this.num = std.num;
		this.group = std.group;
		this.grade = std.grade;
		this.name = new String(std.name); //std.name;으로 하면 이름을 같이 공유하는 문제가 생김
		
	}
	
	
}
