package systemclass;

public class Member {
	private String id;
	private String password;
	private String name;

	public Member(String id, String password, String name) {
		super();
		this.id = id;
		this.password = password;
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Member [id=" + id + ", password=" + password + ", name=" + name + "]";
	}
	
	//hashCode()�� �ߺ��� �������� ������ �ؿ� �ΰ��� �������̵带 ������
	//name�̸� name, id�� id, �н������ �н����� �� �ߺ��Ǵ� ���� ������ �����ؼ� ������ �˷��� �ߺ���ٴ°��� �˷���� �Ѵ�
	@Override
	public int hashCode() {
		return id.hashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Member) {
			Member mem = (Member)obj;
			return this.id.equals(mem.id);
		}
		return false;
	}

}
