package classTest;

public class SubscriberInfo {
	//�Ӽ� - �̸�,���̵�,�н�����,��ȭ��ȣ,�ּ�
	private String name;
	private String id;
	private String password;
	private String tel;
	private String address;
	
	
	//������ - �̸�,���̵�,�н����常 �ʱ�ȭ�� ���� ��ü ����
	public SubscriberInfo(String name, String id, String password) {
		super();
		this.name = name;
		this.id = id;
		this.password = password;
	}
	//       - �̸�,���̵�,�н�����,��ȭ��ȣ,�ּҸ� �ʱ�ȭ �� �� ��ü ����
	public SubscriberInfo(String name, String id, String password, String tel, String address) {
		super();
		this.name = name;
		this.id = id;
		this.password = password;
		this.tel = tel;
		this.address = address;
	}
	
	//��� - �н����� ����, ��ȭ��ȣ ����, �ּ� ����
	//setter�޼ҵ�
	public void setPassword(String password) {
		this.password = password;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public void setAddress(String address) {
		this.address = address;
	}		
}
