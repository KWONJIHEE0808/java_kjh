package day16;

public class Ex9_String_EndWith {

	public static void main(String[] args) {
		/* 다음과 같은 파일 이름이 주어졌을 때, 파일이 이미지인지 아닌지 구별하는 코드를 작성하세요
		 * 파일 확장자가 .jpg, .png, .bmp인 경우 이미지
		 * 끝에서부터 .을 찾아서 .뒤에 있는 문자열을 가져옴
		 * -> 가져온 문자열이 jpg, png, bmp인지 체크후 같은게 있으면 이미지
		 */
		String fileName = "testjpg.jpg";
		int index = fileName.lastIndexOf(".");
		if(index != -1) {
			String endWith = fileName.substring(index+1);//점을 포함할거면 index, 포함하고싶지 않으면 index+1
			switch(endWith) {
			case "jpg" , "png", "bmp":
				System.out.println(fileName+"은 이미지입니다");
				break;
			default:
				System.out.println(fileName+"은 이미지가 아닙니다");
				
			}
		}else {
			System.out.println(fileName+"은 이미지가 아닙니다");
		}
		
		String img[] = {"jpg", "bmp", "png"};
		if(index != -1) {
			String endWith = fileName.substring(index+1);
			int i;
			for(i=0; i<img.length; i++) {
				if(img[i].equals(endWith)) {
					break;
				}
			}
			if(i<img.length) {
				System.out.println(fileName+"은 이미지입니다");
			}else {
				System.out.println(fileName+"은 이미지가 아닙니다");
			}
		}else {
			System.out.println(fileName+"은 이미지가 아닙니다");
		}
		
		String img2[] = {".jpg", ".bmp", ".png"};
		int i;
		for(i=0; i<img2.length; i++) {
			if(fileName.endsWith(img2[i])){
				break;
			}
		}
		if(i<img2.length) {
			System.out.println(fileName+"은 이미지입니다");
		}else {
			System.out.println(fileName+"은 이미지가 아닙니다");
		}
		
		int length = fileName.length();
		for(i=0; i<img2.length; i++) {
			index = fileName.lastIndexOf(img2[i]);
			if(index == length-img2[i].length()) {
				break;
			}
		}
		if(i<img2.length) {
			System.out.println(fileName+"은 이미지입니다");
		}else {
			System.out.println(fileName+"은 이미지가 아닙니다");
		}
	}

}
