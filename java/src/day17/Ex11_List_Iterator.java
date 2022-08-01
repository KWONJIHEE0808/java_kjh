package day17;

import java.util.*;

public class Ex11_List_Iterator {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(3);
		list.add(2);
		
		for(Integer tmp : list) {
			System.out.print(tmp+" ");
		}
		System.out.println();
		
		Iterator<Integer> it = list.iterator();
		while(it.hasNext()) {
			Integer tmp = it.next();
			System.out.print(tmp+" ");
		}
		System.out.println();

	}

}
