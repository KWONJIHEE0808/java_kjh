package day11;

/* 학생 클래스를 작성하세요
 * -> 학생 클래스 : 학년, 반, 번호, 이름, 국어/영어/수학 성적
 * -> 기능 : 
 *  -> 학생 정보 출력 기능
 *  -> 학년, 반, 번호가 주어졌을때 일치하는 학생이 있는지 확인하는 기능
 *  -> 이름, 국어/영어/수학 성적을 수정하는 기능
 * -> 생성자 : 이름, 학년, 반, 번호, 국어/영어/수학 성적이 주어졌을때 초기화하는 생성자 
 */

public class Ex6_Student {
	private String name;
    private int grade, group, number;
    private double kor, eng, math;
	
    public void print() {
    	System.out.println("------------------------");
		System.out.print(grade+"학년 "+group+"반 "+number+"번 "+name);
		System.out.println(" 국어 : "+kor+", 영어 : "+eng+", 수학 : "+math);
		System.out.println("------------------------");
	}
    
    /* 기능 : 학년, 반, 번호가 주어졌을때 일치하는지 확인하는 메소드
     * 매개변수 : 학년, 반, 번호 -> int grade, int group, int number
     * 리턴타입 : 일치여부 -> boolean
     * 메소드명 : equal
     */
	public boolean equal(int grade, int group, int number) {
		if(this.grade != grade) {
			return false;
		}
		if(this.group != group) {
			return false;
		}
		if(this.number != number) {
			return false;
		}
		return true;
	}
	
	/* 기능 : 주어진 이름, 국어/영어/수학 성적을 수정하는 메소드
	 * 매개변수 : 이름, 국어, 영어, 수학 -> string, double
	 * 리턴타입 : 없음 -> void
	 * 메소드명 : modify
	 */
	
	public void modify(String name, double kor, double eng, double math) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}

	public Ex6_Student(String name, int grade, int group, int number, double kor, double eng, double math) {
		super();
		this.name = name;
		this.grade = grade;
		this.group = group;
		this.number = number;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
}