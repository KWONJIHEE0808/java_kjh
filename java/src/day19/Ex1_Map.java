package day19;

import java.util.*;

public class Ex1_Map {

	public static void main(String[] args) {
		Map<String, Object> map = new HashMap<String, Object>();
		Point pt = new Point();
		String str = "Hello";
		List<String> list = new ArrayList<String>();
		list.add("홍길동");
		map.put("point", pt);
		map.put("string", str);
		map.put("userList", list);
		
		Set<String> keySet = map.keySet();
		Iterator<String> it = keySet.iterator();
		while(it.hasNext()){
			String key = it.next();
			Object obj = map.get(key);
			if(obj instanceof String) {
				System.out.println("문자열 : "+(String)obj);
			}else if(obj instanceof Point) {
				Point pt2 = (Point)obj;
				System.out.println(pt2.x+","+pt2.y);
			}else if(obj instanceof ArrayList) {
				List<String> list2 = (ArrayList<String>)obj;
				System.out.println(list2);
			}
			
		}

	}

}

class Point{
	int x, y;
}
