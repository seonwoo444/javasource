package dfdf;
//완전 추상화 => 상수필드만 갖는, 추상메서드만 사용 가능
//jdk8이 되면서 default, static 가질 수 있다


public interface Shop {
	public void setTitle(String name); // public abstract 부분이 생략된 것
	public void genUser();
	public void genProduct();
	public void start();
}
