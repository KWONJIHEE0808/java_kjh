package day2;

public class Ex14_Test2 {

	public static void main(String[] args) {
		/* 성적에 맞는 학점을 출력하는 코드를 작성하세요. 성적은 정수
		 * A : 90이상 ~ 100이하
		 * B : 80이상 ~ 90미만
		 * C : 70이상 ~ 80미만
		 * D : 60이상 ~ 70미만
		 * F : 0이상 ~ 60미만
		 * 0미만, 100초과인 경우 잘못된 성적이라고 출력하도록 수정하세요.
		 */
		int score = 104;
		if(score >= 90 && score <= 100) {
			System.out.println(score + "는 A학점");
		}
		else if(score >= 80 && score < 90) {
			System.out.println(score + "는 B학점");
		}
		else if(score >= 70 && score < 80) {
			System.out.println(score + "는 C학점");
		}
		else if(score >= 60 && score < 70) {
			System.out.println(score + "는 D학점");
		}
		else if(score >= 0 && score < 60) {
			System.out.println(score + "는 F학점");
		}
		else {
			System.out.println(score + "는 잘못된 성적");
		}
		
		// 간결하게 쓰기(중요! 위에서 부터 비교하기때문에 큰값을 맨위에 잡으면 간단해짐)
		
		if(score < 0 || score > 100) {
			System.out.println(score + "는 잘못된 성적");
		}else if(score >= 90) {
			System.out.println(score + "는 A학점");
		}else if(score >= 80) {
			System.out.println(score + "는 B학점");
		}else if(score >= 70) {
			System.out.println(score + "는 C학점");
		}else if(score >= 60) {
			System.out.println(score + "는 D학점");
		}else {
			System.out.println(score + "는 F학점");
		}

	}

}
