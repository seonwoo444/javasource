package Poly;

public class person {
	private String name;
	private String address;
	private int age;
	
	public person(String name, String address, int age) {
		super();
		this.name = name;
		this.address = address;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	public String getAddress() {
		return address;
	}
	public int getAge() {
		return age;
	}
//	@Override
//	public String toString() {
//		return "name="+name+", address = "+address+", age = "+age;
//	}

	@Override
	public String toString() {
		return "person [name=" + name + ", address=" + address + ", age=" + age + "]";
	}
	
	
	
}
