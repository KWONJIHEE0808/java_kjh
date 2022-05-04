package day8;

public class Ex2_Method2_Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=1, b=2;//변수 이름은 꼭 num1 num2로 일치하지않아도 됨
		char op = '/';
		double res = calculator(a, op, b);
		System.out.println(""+a+ op +b+" = "+res);
	}
	/* 기능 : 두 정수와 산술 연산자가 주어지면, 산술 연산 결과를 알려주는 메소드
	 * 매개변수 : 두 정수, 산술 연산자 -> int num1, int num2, 산술연산자->char op
	 * 리턴타입 : 산술 연산 결과 -> double(나누기 때문에)
	 * 메소드명 : calculator
	 */
	public static double calculator(int num1, char op, int num2) {
		double res=0;
		switch(op) {
		case '+': res = num1+num2; break;
		case '-': res = num1-num2; break;
		case '*': res = num1*num2; break;
		case '/': res = num1/(double)num2; break;
		case '%': res = num1%num2; break;
		}
		return res;
	}

}
