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
	
	//hashCode()의 중복을 저장하지 않을때 밑에 두개의 오버라이드를 해주자
	//name이면 name, id면 id, 패스워드면 패스워드 중 중복되는 것의 종류를 선정해서 조건을 알려줘 중복됬다는것을 알려줘야 한다
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
