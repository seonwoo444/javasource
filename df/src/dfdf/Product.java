package dfdf;

//추상클래스 (반추상) : 일반 클래스와 동일 하지만 추상매서드도 갖고 있는 상태

public abstract class Product {

	private String pname;
	private int price;

	public Product(String pname, int price) {
		super();
		this.pname = pname;
		this.price = price;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public void printDetail() {
		System.out.println("상품명 : " + this.pname);
		System.out.println("가격 : " + this.price);
		printExtra();

	}

	public abstract void printExtra();

}
