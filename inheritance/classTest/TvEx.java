package classTest;

public class TvEx {
	public static void main(String[] args) {
		
		//��ü ����, ����
		TV tv = new TV();
		System.out.println(tv);
		
		//��ü ����
		tv.power = true; //on
		tv.channel = 2;
		
		tv.channelUp(); //�޼ҵ� ȣ��
		System.out.println("ä�� ���� : "+tv.channel);
		
		

	}

}
