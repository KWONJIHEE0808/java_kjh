package day16;

public class Ex5_String {

	public static void main(String[] args) {
		String str = "Hello world world";
		String search = "wo";
		int index = str.indexOf(search);
		//indexOf는 일치하는 문자열이 있으면 시작 번지, 없으면 -1로 나옴, 여러개 있어도 처음 시작하는 번지만 나옴
		if(index >= 0) {
			System.out.println(str+" 문자열에 "+search+" 문자열은 "+index+" 번지에 있습니다.");
			index = str.indexOf(search, index+1+search.length());
			if(index >= 0) {
				System.out.println(str+" 문자열에 "+search+" 문자열은 "+index+" 번지에 2개 있습니다.");
			}else {
				System.out.println(str+" 문자열에 "+search+" 문자열은 "+index+" 번지에 1개 있습니다.");
			}
		}else {
			System.out.println(str+" 문자열에 "+search+" 문자열은 없습니다");
		}
		System.out.println(str.lastIndexOf(search));
		System.out.println(str.contains(search));

	}

}
