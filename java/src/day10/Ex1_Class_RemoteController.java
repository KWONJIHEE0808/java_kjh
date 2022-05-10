package day10;

import java.util.Scanner;

public class Ex1_Class_RemoteController {

	public static void main(String[] args) {
		/* 메뉴를 출력후 메뉴에 맞는 기능을 동작하도록 코드를 작성하세요
		 * 메뉴
		 * 1. 채널 UP
		 * 2. 채널 DOWN
		 * 3. 채널 변경
		 * 4. 볼륨 UP
		 * 5. 볼륨 DOWN
		 * 6. 전원
		 * 7. 종료
		 * 메뉴를 선택하세요 : 6
		 * TV를 켰습니다.
		 * * 메뉴
		 * 1. 채널 UP
		 * 2. 채널 DOWN
		 * 3. 채널 변경
		 * 4. 볼륨 UP
		 * 5. 볼륨 DOWN
		 * 6. 전원
		 * 7. 종료
		 * 메뉴를 선택하세요 : 3
		 * 채널 입력 : 100
		 * 채널 : 100
		 * * 메뉴
		 * 1. 채널 UP
		 * 2. 채널 DOWN
		 * 3. 채널 변경
		 * 4. 볼륨 UP
		 * 5. 볼륨 DOWN
		 * 6. 전원
		 * 7. 종료
		 * 메뉴를 선택하세요 : 7
		 */
		RemoteController rc = new RemoteController(1, 10);//맨밑에 생성자 초기화값 설정 ch=1,v=10
		Scanner scan = new Scanner(System.in);
		int menu = 0;
		for(;menu!=7;) {
			System.out.println("메뉴");//메뉴\n1.채널 UP\.n2.채널 Down...
			System.out.println("1. 채널 UP");
			System.out.println("2. 채널 DOWN");
			System.out.println("3. 채널 변경");
			System.out.println("4. 볼륨 UP");
			System.out.println("5. 볼륨 DOWN");
			System.out.println("6. 전원");
			System.out.println("7. 종료");
			System.out.print("메뉴를 선택하세요 : ");
			menu = scan.nextInt();
			switch(menu) {
			case 1 : 
				rc.channelUp();
				break;
			case 2 : 
				rc.channelDown();
				break;
			case 3 : 
				System.out.println("채널 입력 : ");
				int ch = scan.nextInt();
				rc.channel(ch);
				break;
			case 4 : 
				rc.volumeUp();
				break;
			case 5 : 
				rc.volumeDown();
				break;
			case 6 : 
				rc.turn();
				break;
			case 7 :
				System.out.println("프로그램 종료");
				break;
			default:
				System.out.println("잘못된 메뉴입니다");
			}
		}
		
		scan.close();	
	}
}

/* TV 리모컨 클래스를 생성하고, 객체를 생성 후 기능들을 테스트해보세요
 */

class RemoteController{
	//전원, 채널, 볼륨
	boolean power;//전원 on/off 두개뿐이기때문
	int channel;
	int volume;
	int minVolume = 0;
	int maxVolume = 32;
	int minChannel = 1;
	int maxChannel = 999;
	
	/* 기능 : TV를 켜는 메소드
	 * 매개변수 : 없음
	 * 리턴타입 : 없음
	 * 메소드명 : turnOn
	 */
	void turnOn() {
		power = true;
		System.out.println("TV를 켰습니다");
	}	
	/* 기능 : TV를 끄는 메소드
	 * 매개변수 : 없음
	 * 리턴타입 : 없음
	 * 메소드명 : turnOff
	 */
	void turnOff() {
		power = false;
		System.out.println("TV를 껐습니다");
	}	
	/* 기능 : TV를 키거나 끄는 메소드
	 * 매개변수 : 없음
	 * 리턴타입 : 없음
	 * 메소드명 : turn
	 */
	void turn() {
		power = !power;
		if(power) {
			System.out.println("TV를 켰습니다");
		}else {
			System.out.println("TV를 껐습니다");
		}
	}
	
	/* 기능 : 소리를 한칸 올리는 기능
	 * 매개변수 : 없음
	 * 리턴타입 : 없음
	 * 메소드명 : volumeUp
	 */
	void volumeUp() {
		if(power) { //전원이 켜져있고, 소리가 최대치가 아닐경우
			if(volume < maxVolume) {
				volume++;
			}
			System.out.println("소리 : " + volume);
		}
	}
	/* 기능 : 소리를 한칸 내리는 기능
	 * 매개변수 : 없음
	 * 리턴타입 : 없음
	 * 메소드명 : volumeDown
	 */
	void volumeDown() {
		if(power) { //전원이 켜져있고, 소리가 최소치가 아닐경우
			if(volume > minVolume) {
				volume--;
			}
			System.out.println("소리 : " + volume);
		}
	}
	 
	/* 기능 : 채널을 1씩 증가하는 메소드
	 * 매개변수 : 없음
	 * 리턴타입 : 없음
	 * 매개변수명 : channelUp
	 */
	void channelUp() {
		if(power) {
			if(channel < maxChannel) {
				channel++;
			}
			System.out.println("채널 : " + channel);
		}		
	}
	/* 기능 : 채널을 1씩 감소하는 메소드
	 * 매개변수 : 없음
	 * 리턴타입 : 없음
	 * 매개변수명 : channelDown
	 */
	void channelDown() {
		if(power) {
			if(channel > minChannel) {
				channel--;
			}
			System.out.println("채널 : " + channel);
		}		
	}

	/* 기능 : 입력한 채널로 이동하는 메소드
	 * 매개변수 : 이동할 채널 -> int ch
	 * 리턴타입 : 없음
	 * 메소드명 : channel
	 */
	void channel(int ch) {
		if(power) {
			if(ch < minChannel) {//1보다 작은 숫자를 입력했을경우 1번 채널로
				channel = minChannel;
			}
			else if(ch > maxChannel) {//999보다 큰 숫자를 입력했을경우 999번 채널로
				channel = maxChannel;
			}
			else {
				channel = ch;
			}
		}
		System.out.println("채널 : "+ch);
	}

	public RemoteController() {
		channel = minChannel;
		volume = minVolume;
	}
	public RemoteController(int ch, int v) {
		if(ch>=minChannel && ch<=maxChannel) {
			channel = ch;
		}else {
			channel = minChannel;
		}
		if(v>=minVolume && v<=maxVolume) {
			volume = v;
		}else {
			volume = minVolume;
		}
	}
}


