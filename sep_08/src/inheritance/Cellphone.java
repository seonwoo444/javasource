package inheritance;

public class Cellphone {

	
	String color;
	int channel;
	String model;
	
	
	void powerOn() {
		System.out.println("���� on");
	}
	void powerOff() {
		System.out.println("���� off");
	}
	void bell() {
		System.out.println("���� �︳�ϴ�.");
	}
	void senVoice(String msg) {
		System.out.println("���� : "+msg);
	}
	void receiveVoice(String msg) {
		System.out.println("���� : "+msg);
	}
	void hangUp() {
		System.out.println("��ȭ�� �����ϴ�");
	}
	
	
}
