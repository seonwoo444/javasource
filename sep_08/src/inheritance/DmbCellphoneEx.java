package inheritance;

public class DmbCellphoneEx {

	public static void main(String[] args) {
		DmbCellphone phone = new DmbCellphone();
		  
		phone.color = "black";
		phone.model = "�ڹ���";
		phone.channel = 7;
		
		phone.powerOn();
		phone.turnOnDmb();
		phone.changeChannelDmb(8);
		phone.turnOffDmb();
		phone.bell();
		phone.senVoice("�ȳ��ϼ���");
		phone.receiveVoice("�ݰ�����");
		phone.hangUp();
		

	}

}
