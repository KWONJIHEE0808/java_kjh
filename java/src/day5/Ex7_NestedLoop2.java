package day5;

public class Ex7_NestedLoop2 {

	public static void main(String[] args) {
		/* 아래와 같이 출력되도록 코드를 작성하세요.
		 * *
		 * **
		 * ***
		 * ****
		 * *****
		 */
		int num = 7;
		for(int i=1; i<=num; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
		}System.out.println();
		/* 아래와 같이 출력되도록 코드를 작성하세요.
		 *     *
		 *    **
		 *   ***
		 *  ****
		 * *****
		 */
		for(int i=1; i<=num; i++) {
			for(int j=1; j<=num-i; j++) {
				System.out.print(" ");
				}
			for(int j=1; j<=i; j++){
				System.out.print("*");
				}	
			System.out.println();
			}
		
		/* 아래와 같이 출력되도록 코드를 작성하세요.
		 *     *		i=1 ""=4 *=1
		 *    ***		i=2 ""=3 *=3
		 *   *****		i=3 ""=2 *=5
		 *  *******		i=4 ""=1 *=7
		 * *********	i=5 ""=0 *=9
		 * 					""=? *=?
		 */
		for(int i=1; i<=num; i++) {
			for(int j=1; j<=num-i; j++) {
				System.out.print(" ");
				}
			for(int j=1; j<=i; j++){
				System.out.print("*");
				}
			for(int j=1; j<=i-1; j++){
				System.out.print("*");
				}	
			System.out.println();
			}
		/*     *		i=1 ""=4 *=1 *=0
		 *    ** *		i=2 ""=3 *=2 *=1
		 *   *** **		i=3 ""=2 *=3 *=2
		 *  **** ***	i=4 ""=1 *=4 *=3
		 * ***** ****	i=5 ""=0 *=5 *=4
		 * 					""=5-i *=i *=?
		 */
		for(int i=1; i<=num; i++) {
			for(int j=1; j<=num-i; j++) {
				System.out.print(" ");
				}
			for(int j=1; j<=2*i-1; j++){
				System.out.print("*");
				}
			System.out.println();
		}
	}

}
