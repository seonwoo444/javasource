package classTest;

public class TV3 {	
	
	private String color; 
	private boolean power;    
	private int channel;
	
	//������
	TV3(){
		//default(�⺻) ������
		//��������� �����ڰ� �ϳ��� ������� �ʾҴٸ� �����Ϸ��� �ڵ����� ����
	}
	TV3(String color,int channel){
		this.color = color;
		this.channel = channel;
	}	
	public TV3(String color, boolean power, int channel) {
		super();
		this.color = color;
		this.power = power;
		this.channel = channel;
	}
		
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public boolean isPower() {
		return power;
	}
	public void setPower(boolean power) {
		this.power = power;
	}
	public int getChannel() {
		return channel;
	}
	public void setChannel(int channel) {
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




