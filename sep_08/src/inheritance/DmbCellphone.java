package inheritance;

public class DmbCellphone extends Cellphone {

	void turnOnDmb() {
		System.out.println("채널 "+channel+"번 dmb 방송 시작");
	}
	void turnOffDmb() {
		System.out.println("채널 "+channel+"번 dmb 방송 종료");
	}
	void changeChannelDmb(int channel) {
		System.out.println("채널 "+channel+"번 변경");
	}
}
