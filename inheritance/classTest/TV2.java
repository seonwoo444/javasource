package classTest;

public class TV2 {	
	// �Ӽ�(�ʵ�,�������,������Ƽ) => ����,��������,ä��....
	String color; // red,blue,black....
	boolean power;    // on, off
	int channel;
	
	//������
	TV2(){
		//default(�⺻) ������
		//���������� �����ڰ� �ϳ��� ������� �ʾҴٸ� �����Ϸ��� �ڵ����� ����
	}
	TV2(String color,int channel){
		this.color = color;
		this.channel = channel;
	}
	
	
	
	
	
	// ����(�޼ҵ�) => ä�� ����(����,����)�ϴ�/������ �Ѵ�/����
	void channelUp() {
		//channelUp �� �ؾ� �ϴ� �۾� �ۼ� ���� ä�� 7 => 8,9,10....
		channel++;		
	}
	void channelDown() {
		//channelDown �� �ؾ� �ϴ� �۾� �ۼ� ���� ä�� 7 => 6,5,4....
		channel--;
	}
	
	void power() {
		//power�� �ؾ� �ϴ� �۾� on => off,  off => on
		power = !power;
	}
	
}



