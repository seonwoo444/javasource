
public class SubscriberMain {
	//�Ӽ� - �̸�, ���̵�, �н�����, ��ȭ��ȣ, �ּ�
	private String name;
	private String id;
	private String pasword;
	private String tel;
	private String addr;
	
	
	//������ - �̸�, ���̵�, �н����常 �ʱ�ȭ �� ��ü ����
	public SubscriberMain(String name, String id, String pasword) {
		super();
		this.name = name;
		this.id = id;
		this.pasword = pasword;
	}
	
	//		- �̸�, ���̵�, �н�����, ��ȭ��ȣ, �ּҸ� �ʱ�ȭ �� �� ��ü ����
	public SubscriberMain(String name, String id, String pasword, String tel, String addr) {
		super();
		this.name = name;
		this.id = id;
		this.pasword = pasword;
		this.tel = tel;
		this.addr = addr;
	}

	//��� - �н����� ����, ��ȭ��ȣ�� ����, �ּ� ����
	
	//setter �޼ҵ��
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public void setPasword(String pasword) {
		this.pasword = pasword;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
}
