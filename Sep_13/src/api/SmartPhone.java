package api;

public class SmartPhone {
	private String company;
	private String os;
	public SmartPhone(String company, String os) {
		super();
		this.company = company;
		this.os = os;
	}
	@Override
	public String toString() {//��ü�� �����ִ� ��� ������ ���� ����ϴ� �뵵�� �Ѵ�
		return "SmartPhone [company=" + company + ", os=" + os + "]";
	}
	
	
}