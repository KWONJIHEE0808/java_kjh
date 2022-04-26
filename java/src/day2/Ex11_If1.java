package day2;

public class Ex11_If1 {

	public static void main(String[] args) {
		if(true) {
			System.out.println("참입니다");
		
		/* num가 짝수면 짝수라고 출력하는 코드를 if문을 이용하여 작성하세요
		 */
	    int num = 2;
	    if(num % 2 == 0) {
	    	System.out.println(num + "는 짝수");	    	
	    }
		
	    /* score가 90점 이상이고, 100점 이하이면 A학점이라고 출력하는 코드를 if문을 이용하여 작성하세요
	     */
	    int score = 95;
	    if(score >= 90 && score <= 100) {
	    	System.out.println(score + "는 A학점");	    	
	    	
	    }	    
	    
	  }

	}

}
