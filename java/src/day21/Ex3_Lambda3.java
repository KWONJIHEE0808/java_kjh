package day21;

import java.util.*;

public class Ex3_Lambda3 {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		
		list.add(10);
		list.add(100);
		list.add(50);
		list.add(70);
		list.add(30);
		
		list.sort(new Comparator<Integer>() {
			public int compare(Integer o1, Integer o2) {
				return o1-o2;
			}
		});
		
		//람다식을 활용한 정렬 코드
		list.sort((Integer a, Integer b)->a-b);
		
		System.out.println(list);

	}

}
