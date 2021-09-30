package inheritance;

public class Cellphone {

	
	String color;
	int channel;
	String model;
	
	
	void powerOn() {
		System.out.println("전원 on");
	}
	void powerOff() {
		System.out.println("전원 off");
	}
	void bell() {
		System.out.println("벨이 울립니다.");
	}
	void senVoice(String msg) {
		System.out.println("본인 : "+msg);
	}
	void receiveVoice(String msg) {
		System.out.println("상대방 : "+msg);
	}
	void hangUp() {
		System.out.println("전화를 끊습니다");
	}
	
	
}
