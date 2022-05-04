package day8;

public class Ex5_Class1 {

	public static void main(String[] args) {
		Point1 p1 = new Point1();
		p1.print();
		p1.x1=20;
		//p1.x2=20; <- 에러 발생, 접근 제한자가 private기 떄문
		p1.x=20;
		p1.print();
		
	}

}
		/* class앞에 public은 클래스 이름과 파일 이름이 같은 경우에만 사용 가능
		 * 좌표평면(2차원 화면)에서 두 점을 나타내는 클래스 : Point
		 * 멤버변수 : 좌표평면에서 점을 나타내기 위해 필요한 정보 -> x좌표, y좌표 
		 *  -> 클래스내 메소드에서 사용, 초기화를 하지않아도 기본값으로 자동 초기화됨, private를 사용하는게 좋음
		 * 기능 : 현재 좌표를 출력하는 메소드
		 * 매개변수 : 없음
		 * 리턴타입 : 없음 => void(출력)
		 * 메소드명 : print
		 */
class Point1{
	int x, y;
	public int x1, y1;
	private int x2, y2;
	public void print() {
		System.out.println(x+", "+y);
		x1=20;
		x2=20;
	}
	
	
}
