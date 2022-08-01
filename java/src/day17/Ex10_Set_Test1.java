package day17;

import java.util.*;

public class Ex10_Set_Test1 {

	public static void main(String[] args) {
		Set<Integer> set = new HashSet<Integer>();
		for(int i=0; i<10; i++) {
			int r = (int)(Math.random()*(15-10+1)+10);
			System.out.println(r+" : "+set.add(r));
		}
		
		System.out.println(set);
		System.out.println("10 삭제 ? "+set.remove(10));
		System.out.println(set);
		Iterator<Integer> it = set.iterator();
		while(it.hasNext()) {
			Integer tmp = it.next();
			System.out.print(tmp+" ");
		}
		System.out.println();
	}

}
