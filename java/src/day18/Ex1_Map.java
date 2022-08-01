package day18;

import java.util.*;

public class Ex1_Map {

	public static void main(String[] args) {
		Map<String, String> map = new HashMap<String, String>();
		map.put("abc123", "abc123");
		map.put("a", "b");
		map.put("abc456", "abc123"); //비번 중복, 저장가능
		map.put("abc123", "123456"); //아이디 중복, 기존값에 덮어쓰기
		System.out.println(map);
		
		map.remove("abc456");
		System.out.println(map);
		
		System.out.println("abc123 회원이 있습니까 ? : "+map.containsKey("abc123"));
		System.out.println("비밀번호가 456인 회원이 있습니까 ? : "+map.containsValue("456"));
		
		Iterator<String> it2 = map.keySet().iterator();
		while(it2.hasNext()) {
			String id = it2.next();
			String pw = map.get(id);
			System.out.println(new User(id,pw));
	
		}
		
		/* Set<Map.Entry<String, String>> entry = map.entrySet();
		 * Iterator<Map.Entry<String, String>> it = entry.iterator();
		 * 위의 두줄 코드를 한줄로 변경
		 * Map에 저장된 회원의 아이디와 비밀번호를 하나의 객체로 만들어 List에 저장
		 */
		Iterator<Map.Entry<String, String>> it = map.entrySet().iterator();
		List<User> list = new ArrayList<User>();
		while(it.hasNext()) {
			Map.Entry<String, String> entry = it.next();
			list.add(new User(entry.getKey(), entry.getValue()));
		}
		System.out.println(list);

	}

}

class User{
	String id, pw;
	public User(String id, String pw) {
		this.id = id;
		this.pw = pw;
	}
	
	@Override
	public String toString() {
		return "User [id = " + id + ", pw = " + pw + "]";
	}
	
}
